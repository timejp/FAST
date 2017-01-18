package com.timejh;

import java.util.Arrays;

public class Collections {

	public static void main(String[] args) {

//		String myName = "yjh";
//		String palYong = "palYong";
//		String jaeSeock = "jaeSeock";
//		String jaeMin = "JaeMin";
//		String seokYang = "seokYang";
//		
//		ArrayList nameList = new ArrayList();
//		
//		nameList.add(seokYang);
//		nameList.add(palYong);
//		nameList.add(jaeSeock);
//		nameList.add(myName);
//		nameList.add(jaeMin);
//		
//		
//		System.out.println(nameList.get(2));
//		
//		System.out.println("------------------------");
//		
//		// For문
//		for(int i=0;i<nameList.size();i++) {
//			System.out.println("For문 : " + i + "번째 " + nameList.get(i));
//		}
//
//		System.out.println("------------------------");
//		
//		// For each문
//		for(Object name : nameList) {
//			System.out.println("For each문 : " + name.toString());
//		}
//		
//		
//		System.out.println("----------제너릭----------");
//		
//		
//		// 제너릭 (String과 같이 지정(한정)을 해줄 수 있다.)
//		ArrayList<String> nameListString = new ArrayList<String>();
//
//		nameListString.add(seokYang);
//		nameListString.add(palYong);
//		nameListString.add(jaeSeock);
//		nameListString.add(myName);
//		nameListString.add(jaeMin);
//		
//		System.out.println(nameListString.get(2));
//
//		System.out.println("------------------------");
//		
//		// For문
//		for(int i=0;i<nameListString.size();i++) {
//			System.out.println("For문 : " + i + "번째 " + nameListString.get(i));
//		}
//		
//		System.out.println("------------------------");
//		
//		// For each문
//		for(Object name : nameListString) {
//			System.out.println("For each문 : " + name.toString());
//		}
	
		//new Collections().q1(10000000, 8);
		System.out.println(new Collections().q2("was it a cat i saw?"));
		System.out.println(new Collections().q3("fada", "afad"));
	}
	
	/** 1~n까지중 m 이 몇개 들어있나
	 * 
	 * @param n
	 * @param m
	 */
	public void q1(int n, int m) {
		int result = 0;
		long starttime = 0;
		long endtime = 0;
		
		starttime = System.nanoTime();
		for(int i=1;i<=n;i++) {
			char[] buf = (i + "").toCharArray();
			for(int j=0;j<buf.length;j++) {
				if(buf[j]==(char)m + '0') {
					result++;
				}
			}
		}
		endtime = System.nanoTime();
		System.out.println("소요시간 : " + (endtime - starttime));
		System.out.println(m + "의 수는 총 : " + result + "개 입니다.");
		
		result = 0;
		starttime = System.nanoTime();
		for(int i=1;i<=n;i++) {
			String buf = i + "";
			for(int j=0;j<buf.length();j++)
				if(buf.charAt(j)==(char)m+'0')
					result++;
		}
		endtime = System.nanoTime();
		System.out.println("소요시간 : " + (endtime - starttime));
		System.out.println(m + "의 수는 총 : " + result + "개 입니다.");

		result = 0;
		starttime = System.nanoTime();
		for (int i = 1; i <= n; i++) {
			int buf = i;
			while (buf > 0) {
				if (buf % 10 == m)
					result++;
				buf /= 10;
			}
		}
		endtime = System.nanoTime();
		System.out.println("소요시간 : " + (endtime - starttime));
		System.out.println(m + "의 수는 총 : " + result + "개 입니다.");
	}
	
	/** String 반전
	 * 
	 * @param n
	 * @return
	 */
	public String q2(String n) {
		StringBuffer stb = new StringBuffer();
		for(int i=n.length()-1;i>=0;i--)
			stb.append(n.charAt(i));
		return stb.toString();
	}
	
	/** Anagram
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public boolean q3(String n, String m) {
		char[] nn = n.toCharArray();
		char[] mm = m.toCharArray();

		Arrays.sort(nn);
		Arrays.sort(mm);
		
		return Arrays.equals(mm, nn);
	}

}

