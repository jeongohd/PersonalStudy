package a.b.c.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper mapper;

	@Override
	public boolean insert(BoardVO vo) {
		return mapper.insert(vo) > 0 ? true : false;
	}

	@Override
	public boolean update(BoardVO vo) {
		return mapper.update(vo) > 0 ? true : false;
	}

	@Override
	public boolean delete(int no) {
		return mapper.delete(no) > 0 ? true : false;
	}

	@Override
	public Map list(BoardVO vo) {
		
		// 총 게시물수
		int totalCount = mapper.totalCount(vo); 
		
		// 총 페이지수
		int totalPage = totalCount / vo.getPageRow(); 
		if (totalCount % vo.getPageRow() > 0) totalPage++;
		
		// startIdx
		int startIdx = (vo.getPage()-1) * vo.getPageRow(); 
		vo.setStartIdx(startIdx);
		List<BoardVO> list = mapper.list(vo);
		
		// 화면에 보여지는 처음페이지, 끝페이지
		int endPage = (int)(Math.ceil(vo.getPage()/(double)(vo.getPageRow())) * vo.getPageRow());
		int startPage = endPage-(vo.getPageRow()-1);
		if (endPage > totalPage) endPage = totalPage;
		
		// 이전 다음
		boolean prev = startPage > 1 ? true : false;
		boolean next = endPage < totalPage ? true : false;
		
		Map map = new HashMap();
		map.put("totalCount", totalCount);
		map.put("totalPage", totalPage);
		map.put("startPage", startPage);
		map.put("endPage", endPage);
		map.put("prev", prev);
		map.put("next", next);
		map.put("list", list);
		
		return map;
	}

	@Override
	public BoardVO view(int no) {
		mapper.viewcountUpdate(no);
		return mapper.view(no);
	}

	@Override
	public BoardVO edit(int no) {
		return mapper.view(no);
	}
	
	
}
