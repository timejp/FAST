package com.timejh.bbs;

/**
 * 게시판 정보
 * 
 * @author tokijh
 *
 */
public class Bbs {

	private int bbsno = 0;
	private String title = "";
	private String content = "";
	private String author = "";
	private String datetime = "";
	
	public Bbs() {
		
	}

	public Bbs(String data) {
		String[] datas = data.split("\\|");
		this.bbsno = Integer.parseInt(datas[0]);
		this.title = datas[1].replaceAll("[*]n", "\n");
		this.content = datas[2].replaceAll("[*]n", "\n");
		this.author = datas[3].replaceAll("[*]n", "\n");
		this.datetime = datas[4].replaceAll("[*]n", "\n");
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
		return String.format("\n%03d번\nTitle : %s\nContent : %s\nAuthor : %s\nDatetime : %s\n", bbsno, title, content,
				author, datetime).toString();
	}
	
	public String toFileString() {
		return String.format("%d|%s|%s|%s|%s\n", bbsno, title.replaceAll("\n", "*n"), content.replaceAll("\n", "*n"), author.replaceAll("\n", "*n"), datetime.replaceAll("\n", "*n"));
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
