package com.timejh;

public class Array {

	public static void main(String[] args) {
		
		// 배열 선언
		int array[] = new int[6];
		
		// 배열 입력
		array[0] = 434;
		array[1] = 434234;
		array[5] = 43412;
		
		//범위를 넘어셨기 때문에 오류
		//array[6] = 947;

		System.out.println(array[1]);
		System.out.println(array[2]);
		
		//2차원 배열
		int array2[][] = new int[3][2];
		array2[0][0] = 1;
		array2[0][1] = 2;
		array2[1][0] = 3;
		array2[1][1] = 4;
		array2[2][0] = 5;
		array2[2][1] = 6;
		
		int x,y,z;
		for(y=0;y<3;y++) {
			System.out.print(y + "번째 줄 : ");
			for(x=0;x<2;x++) {
				System.out.print("["+ array2[y][x] +"]");
			}
			System.out.println("");
		}
		
		//3차원 배열
		x=5;
		y=10;
		z=7;
		
		int array3[][][] = new int[z][y][x];
		
		array3[3][5][2] = 383;
		array3[2][0][3] = 534;
		array3[6][9][1] = 634;

		int zIndex = 0;
		int yIndex = 0;
		int xIndex = 0;
		
		for(zIndex=0;zIndex<z;zIndex++) {
			for(yIndex=0;yIndex<y;yIndex++) {
				for(xIndex=0;xIndex<x;xIndex++) {
					System.out.print("[" + array3[zIndex][yIndex][xIndex] + "]");
				}
				System.out.println("");
			}
			System.out.println("----------------------------------");
		}
	}

}

