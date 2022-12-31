package a.b.c.board;

import java.util.Map;

public interface BoardService {
	boolean insert(BoardVO vo);
	BoardVO edit(int no); // 수정 폼 
	boolean update(BoardVO vo); // 수정 처리
	boolean delete(int no);
	Map list(BoardVO vo);
	BoardVO view(int no); // 조회수 업데이트 후 상세보기
}
