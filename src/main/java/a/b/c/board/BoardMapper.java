package a.b.c.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	int insert(BoardVO vo);
	int update(BoardVO vo);
	int delete(int no);
	List<BoardVO> list(BoardVO vo);
	BoardVO view(int no);
	int viewcountUpdate(int no);
	int totalCount(BoardVO vo);
	
	
}
