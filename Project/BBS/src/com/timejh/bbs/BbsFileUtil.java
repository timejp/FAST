package com.timejh.bbs;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BbsFileUtil {

	public static BbsFileUtil bbsFileUtil;
	private	int bbsno;

	public static BbsFileUtil shared() {
		if (bbsFileUtil == null)
			bbsFileUtil = new BbsFileUtil();
		return bbsFileUtil;
	}

	public ArrayList<Bbs> read() throws IOException {
		if (! new File(Resources.FILEPATH + Resources.FILENAME).exists()) {
			return new ArrayList<>();
		}
		
		Path path = Paths.get(Resources.FILEPATH, Resources.FILENAME);
		byte[] rawData = Files.readAllBytes(path);
		String[] rows = new String(rawData, StandardCharsets.UTF_8).split("\n");
		ArrayList<Bbs> lists = new ArrayList<>();
		bbsno = Integer.parseInt(rows[0]);
		for(int i=1;i<rows.length;i++) {
			lists.add(new Bbs(rows[i]));
		}
		return lists;
	}
	
	public Bbs read(int linenum) throws IOException {
		ArrayList<Bbs> datas = read();
		if (datas.size() <= linenum) {
			return null;
		}
		return datas.get(linenum);
	}

	public void write(ArrayList<Bbs> lists) throws IOException {
		StringBuffer str = new StringBuffer();
		str.append(bbsno + "\n");
		for(Bbs bbs : lists){
			str.append(bbs.toFileString());
		}
		Path path = Paths.get(Resources.FILEPATH, Resources.FILENAME);
		Files.write(path, str.toString().getBytes(StandardCharsets.UTF_8));
	}
	
	public void setLastBbsno(int bbsno) {
		this.bbsno = bbsno;
	}
	
	public int getLastBbsno() {
		return bbsno;
	}
}
