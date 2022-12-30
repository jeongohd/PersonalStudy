package a.b.c.board;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardVO {
	private int no;
	private String title;
	private String content;
	private Timestamp regdate;
	private int viewcount;
	private String filename_org;
	private String filename_real;
	
	// 검색
	private String stype;
	private String sword;
	
	// 페이징
	private int page;
	private int startIdx;
	private int pageRow;
	BoardVO(){
		this.startIdx = 1;
		this.pageRow = 10;
	}
	
}
