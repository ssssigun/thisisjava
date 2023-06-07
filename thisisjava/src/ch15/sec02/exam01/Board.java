package ch15.sec02.exam01;

import lombok.Data;

@Data
public class Board {
	private String subject;
	private String content;
	private String writer;
	
	public Board(String subject, String content, String writer){
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
}
