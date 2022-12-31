package a.b.c.board;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BoardVO {
	private int no;
	private String title;
	private String content;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Timestamp regdate;
	private int viewcount;
	private String filename_org;
	private String filename_real;
	private int filename_chk;
	
	// 검색
	private String stype;
	private String sword;
	
	// 페이징
	private int page;
	private int startIdx;
	private int pageRow;
	
	BoardVO(){
		this(1,5);
	}
	BoardVO(int page, int pageRow){
		this.page = page;
		this.pageRow = pageRow;
	}
	
}
