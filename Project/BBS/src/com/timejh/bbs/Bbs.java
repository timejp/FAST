package com.timejh.bbs;

/**
 * 게시판 정보
 * 
 * @author tokijh
 *
 */
public class Bbs {

	private int bbsno;
	private String title;
	private String content;
	private String author;
	private String datetime;

	public Bbs() {
		title = "제목없음";
	}

	public Bbs(String title) {
		this.title = title;
	}

	public Bbs(int bbsno, String title, String content, String author, String datetime) {
		this.bbsno = bbsno;
		this.title = title;
		this.content = content;
		this.author = author;
		this.datetime = datetime;
	}

	public void print() {
		System.out.print(this.toString());
	}

	public String toString() {
		return String.format("%03d번\n\tTitle : %s\nContent : \t%s\nAuthor : \t%s\t\nDatetime : %s\t|\n", bbsno, title, content, author, datetime)
				.toString();
	}

	public int getBbsno() {
		return bbsno;
	}

	public void setBbsno(int bbsno) {
		this.bbsno = bbsno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

}
