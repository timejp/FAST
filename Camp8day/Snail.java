package com.timejh;

public class Snail {

	public static void main(String[] args) {
		Snail snail = new Snail();
		snail.printSnail(snail.makeSnail(5));
	}
	
	/*
	 * 01 02 03 04 05
	 * 16 17 18 19 06
	 * 15 24 25 20 07
	 * 14 23 22 21 08
	 * 13 12 11 10 09
	 * 
	 * 
	 *     00,01,02,03,04 14,24,34,44
	 * x :  0  1  1  1  1  0  0  0  0
	 * y : 0  0  0  0  0  1  1  1  1
	 * 
	 *     10,11,12,13,14,15,16
	 * x4: -1,-1,-1,-1, 0, 0, 0
	 * y4:  0, 0, 0, 0,-1,-1,-1
	 * 
	 *     17,18,19,20,21
	 * x0:  1  1  1 
	 * y1:           1  1
	 * 
	 *     22,23,24
	 * x3: -1,-1
	 * y2:       -1
	 * 
	 *     25
	 * x1: 1
	 * y2:
	 */
	
	public int[][] makeSnail(int size) {
		//달팽이 결과물을 담을 공간
		int [][]result = new int[size][size];
		
		//배열의 좌표
		int x = 0,y = 0;
		
		//실제 배열에 입력되는 값
		int num = 0;
		
		//달팽이를 ㄱ ㄴ 으로 회전시킬때 최초의 한줄 크기
		int distance = size * 2 - 1;
		
		//이동간의 부호
		int sign = 1;

		//반복문은 ㄱ ㄴ 단위로 동작할 때 마다 ㄱ의 길이가 2씩 감소하고 0이 되면 종료된다.
		for(int cnt = distance;cnt >= 0; cnt-=2) {
			//ㄱ 한개 단위가 1씩 증가
			for(int row=0;row<cnt;row++) {
				//가로축이 세로축 보다 1 더 길기 때문에 0 부터 시작하는 좌표는 반으로 나누면 된다.
				if(row <= cnt/2) {
					if(row!=0 || cnt != distance) {
						x = x + sign;	
					}
				} else {
					y = y + sign;
				}
				num = num+1;
				result[y][x] = num;
			}
			sign = sign * -1;
		}
		
		return result;
	}
	
	public void printSnail(int[][] snail) {
		for(int i=0;i<snail.length;i++) {
			for(int j=0;j<snail[i].length;j++) {
				System.out.printf("[%03d]", snail[i][j]);
			}
			System.out.println();
		}
	}
	
}

