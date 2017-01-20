package com.timejh.bbs;

import java.io.IOException;
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
	}
	
	private void updateBbsno() {
		bbsno = database.getLastBbsno();
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
		updateBbsno();
		try {
			bbs.setBbsno(++bbsno);
			bbs.setDatetime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			database.setLastBbsno(bbsno);
			database.add(bbs);
		} catch (IOException e) {
			error(e);
		}
	}

	/**
	 * bbs데이터 읽기
	 * 
	 * @param bbsno
	 * @return
	 */
	public Bbs read(int bbsno) {
		try {
			return database.read(bbsno);
		} catch (IOException e) {
			error(e);
		}
		return null;
	}

	/**
	 * bbs데이터 전체 읽기
	 * 
	 * @return
	 */
	public ArrayList<Bbs> readAll() {
		try {
			return database.readAll();
		} catch (IOException e) {
			error(e);
		}
		return null;
	}

	/**
	 * bbs데이터 수정
	 * 
	 * @param bbs
	 */
	public void update(Bbs bbs) {
		try {
			bbs.setDatetime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			database.update(bbs);
		} catch (IOException e) {
			error(e);
		}
	}

	/**
	 * bbs데이터 삭제
	 * 
	 * @param bbsno
	 */
	public void delete(int bbsno) {
		try {
			database.delete(bbsno);
		} catch (IOException e) {
			error(e);
		}
	}
	
	private void error(Exception e) {
		System.out.println("\n\n\n--------------------------------------------");
		System.out.println(e);
		System.out.println("데이터에 오류가 있습니다." + Resources.FILEPATH + Resources.FILENAME + "에 오류가 있는지 확인해 주세요.\n종료합니다.");
		System.exit(1);
	}
}
