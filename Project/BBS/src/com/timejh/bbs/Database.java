package com.timejh.bbs;

import java.io.IOException;
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
	
	private void reLoadBbsData() throws IOException {
		data = BbsFileUtil.shared().read();
	}
	
	private void updateBbsData() throws IOException {
		BbsFileUtil.shared().write(data);
	}

	public void add(Bbs bbs) throws IOException {
		data.add(bbs);
		updateBbsData();
	}

	public Bbs read(int bbsno) throws IOException {
		reLoadBbsData();
		for (Bbs item : data)
			if (item.getBbsno() == bbsno)
				return item;
		return null;
	}

	public ArrayList<Bbs> readAll() throws IOException {
		reLoadBbsData();
		return data;
	}

	public void update(Bbs bbs) throws IOException {
		boolean isupdated = false;
		for (Bbs item : data)
			if (item.getBbsno() == bbs.getBbsno()) {
				data.add(data.indexOf(item), bbs);
				data.remove(item);
				isupdated = true;
				break;
			}
		if(isupdated) {
			updateBbsData();
			System.out.println("Updated!");
		} else {
			System.out.println("Not Updated!");
		}
	}

	public void delete(int bbsno) throws IOException {
		boolean isdeleted = false;
		for (Bbs item : data)
			if (item.getBbsno() == bbsno) {
				data.remove(item);
				isdeleted = true;
				break;
			}
		if(isdeleted) {
			updateBbsData();
			System.out.println("Deleted!");
		} else {
			System.out.println("Not Deleted!");
		}
	}
	
	public int getLastBbsno() {
		return BbsFileUtil.shared().getLastBbsno();
	}
	
	public void setLastBbsno(int bbsno) {
		BbsFileUtil.shared().setLastBbsno(bbsno);
	}
}
