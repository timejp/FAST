package com.timejh.bbs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Bbs를 처리하기 위한 컨트롤러
 * 
 * @author tokijh
 *
 */
public class BbsController {

	private static BbsController bbsController;

	private Database database;
	private int bbsno;

	public BbsController() {
		database = new Database();
		bbsno = 0;
	}

	/**
	 * Single Tone Pattern
	 * 
	 * @return
	 */
	public static BbsController shared() {
		if (bbsController == null) {
			bbsController = new BbsController();
		}
		return bbsController;
	}

	/**
	 * 입력함수
	 * 
	 * @param bbs
	 */
	public void create(Bbs bbs) {
		bbs.setBbsno(++bbsno);
		bbs.setDatetime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		database.add(bbs);
	}

	/**
	 * bbs데이터 읽기
	 * 
	 * @param bbsno
	 * @return
	 */
	public Bbs read(int bbsno) {
		return database.read(bbsno);
	}

	/**
	 * bbs데이터 전체 읽기
	 * 
	 * @return
	 */
	public ArrayList<Bbs> readAll() {
		return database.readAll();
	}

	/**
	 * bbs데이터 수정
	 * 
	 * @param bbs
	 */
	public void update(Bbs bbs) {
		database.update(bbs);
	}

	/**
	 * bbs데이터 삭제
	 * 
	 * @param bbsno
	 */
	public void delete(int bbsno) {
		database.delete(bbsno);
	}

}
