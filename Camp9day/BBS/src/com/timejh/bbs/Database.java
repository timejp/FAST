package com.timejh.bbs;

import java.util.ArrayList;

/**
 * 데이터를 저장하기위한 공간 마련
 * 
 * @author tokijh
 *
 */
public class Database {

	private ArrayList<Bbs> data;

	public Database() {
		data = new ArrayList<>();
	}

	public void add(Bbs bbs) {
		data.add(bbs);
	}

	public Bbs read(int bbsno) {
		for (Bbs item : data)
			if (item.getBbsno() == bbsno)
				return item;
		return null;
	}

	public ArrayList<Bbs> readAll() {
		return data;
	}

	public void update(Bbs bbs) {
		for (Bbs item : data)
			if (item.getBbsno() == bbs.getBbsno()) {
				data.add(data.indexOf(item), bbs);
				data.remove(item);
				return;
			}
	}

	public void delete(int bbsno) {
		for (Bbs item : data)
			if (item.getBbsno() == bbsno) {
				data.remove(item);
				return;
			}
	}
}
