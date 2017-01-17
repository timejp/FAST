# 패스트캠퍼스 7일차

## 참고 알고리즘 공식
sum ((n~m) % 2==0)
n ~ m까지의 숫자중 짝수인 수만 더한값

<pre>
<code>
1,2,3,4,5,6,7,8 …
        +
100,100, ,98, ,96
,102, ,102, ,102

((max + 2) * max / 2) / 2 —> 짝수
if (max%2==1) {
	max -= 1;
	((max + 2) * max / 2) / 2 -> 홀수
}
</code>
</pre>

<pre>
홀수 식
max * max
짝수식
max * max + max
</pre>

* * *
## 알고리즘 소스코드
<pre>
<code>
package com.timejh;

public class DrawPattern {

	public static void main(String[] args) {
		DrawPattern drawPattern = new DrawPattern();
		//drawPattern.shoRectTri(5, "A");
		//drawPattern.showReverseTri(5, "A");
		drawPattern.q3(7, "A");
		System.out.println("");
		drawPattern.q4(7, "A");
		System.out.println("");
		drawPattern.q5(7, "A");
		System.out.println("");
		drawPattern.q6(7, "A");
		System.out.println("");
		drawPattern.q7(7, "A");
		System.out.println("");
		drawPattern.q8(7, "A");
		System.out.println("");
		drawPattern.q9(7, "A");
		System.out.println("");
		drawPattern.q10(7, "A");
		System.out.println("");
		drawPattern.q11(7, "A");
		System.out.println("");
		drawPattern.q12(5, "A");
		System.out.println("");
		drawPattern.q13(7);
		System.out.println("");
	}
	
	/** count 와 unit을 입력받아
	 * 1부터 count의 숫자만큼 
	 * unit 을 출력합니다.
	 * 
	 * 예) count = 5, unit = A
	 * A
	 * AA
	 * AAA
	 * AAAA
	 * AAAAA
	 * 
	 * @param count
	 * @param unit
	 */
	public void shoRectTri(int count, String unit) {
		for (int i=0; i < count; i++) {
			for(int j=0; j <= i; j++) {
				System.out.print(unit);
			}
			System.out.println("");
		}
	}
	
	public void showReverseTri(int count, String unit) {
		/*for (int i = 0; i < count; i++) {
		    for(int j = count - i; j > 1; j--) {
		    	System.out.print(" ");
		    }
			for(int j = 0; j <= i; j++) {
				System.out.print(unit);
			}
			System.out.println("");
		}*/
		for (int i = 0; i < count; i++) {
		    for(int j = 0; j < count; j++) {
		    	if (count - j - 1 > i)
		    		System.out.print(" ");
		    	else
		    		System.out.print(unit);
			}
			System.out.println("");
		}
	}
	
	/**
	 *       A
	 *      AAA
	 *     AAAAA
	 *    AAAAAAA
	 *   AAAAAAAAA
	 *  AAAAAAAAAAA
	 * AAAAAAAAAAAAA
	 * @param count
	 * @param unit
	 */
	public void q3(int count, String unit) {
		for (int i=0; i<count; i++) {
			for(int j=0; j<count + i; j++) {
				if (j < count - i - 1)
					System.out.print(" ");
				else
					System.out.print(unit);
			}
			System.out.println("");
		}
	}
	
	/**
	 *       A
	 *      A A
	 *     A   A
	 *    A     A
	 *   A       A
 	 *  A         A
	 * A           A
	 * @param count
	 * @param unit
	 */
	public void q4(int count, String unit) {
		for (int i=0; i<count; i++) {
			for(int j=0; j<count + i; j++) {
				if (j < count - i - 1)
					System.out.print(" ");
				else if (count - i - 1 < j && j < count + i - 1)
					System.out.print(" ");
				else
					System.out.print(unit);
			}
			System.out.println("");
		}
	}
	
	/**
	 *       A
	 *      A A
	 *     A   A
	 *    A     A
	 *   A       A
	 *  A         A
	 * AAAAAAAAAAAAA
	 * @param count
	 * @param unit
	 */
	public void q5(int count, String unit) {
		for (int i=0; i<count; i++) {
			for(int j=0; j<count + i; j++) {
				if (j < count - i - 1)
					System.out.print(" ");
				else if (i != count - 1 && count - i - 1 < j && j < count + i - 1)
					System.out.print(" ");
				else
					System.out.print(unit);
			}
			System.out.println("");
		}
	}
	
	/**
	 *       A
	 *      AAA
	 *     AAAAA
	 *    AAAAAAA
	 *   AAAAAAAAA
	 *  AAAAAAAAAAA
	 * AAAAAAAAAAAAA
	 *  AAAAAAAAAAA
	 *   AAAAAAAAA
	 *    AAAAAAA
	 *     AAAAA
	 *      AAA
	 *       A
	 * @param count
	 * @param unit
	 */
	public void q6(int count, String unit) {
		for (int i=0; i<count * 2 - 1; i++) {
			for(int j=0; j<count + i; j++) {
				if (i < (count * 2 -1)/2 + 1) {
					if (j < count - i - 1)
						System.out.print(" ");
					else
						System.out.print(unit);
				} else {
					if (j > (count * 2) - Math.abs((count - i) - 3))
						break;
					else if (i - count > j - 1) 
						System.out.print(" ");
					else 
						System.out.print(unit);
				}
			}
			System.out.println("");
		}
	}
	
	/**
	 *       A
	 *      A A
	 *     A A A
	 *    A A A A
	 *   A A A A A
	 *  A A A A A A
	 * A A A A A A A
 	 *  AAAAAAAAAAA
	 *   AAAAAAAAA
	 *    AAAAAAA
	 *     AAAAA
	 *      AAA
	 *       A
	 * @param count
	 * @param unit
	 */
	public void q7(int count, String unit) {
		for (int i=0; i<count * 2 - 1; i++) {
			int unitcount = 0;
			for(int j=0; j<count + i; j++) {
				if (i < (count * 2 -1)/2 + 1) {
					if (j < count - i - 1)
						System.out.print(" ");
					else {
						if (unitcount % 2 ==0)
							System.out.print(unit);
						else
							System.out.print(" ");
						unitcount++;
					}
				} else {
					if (j > (count * 2) - Math.abs((count - i) - 3))
						break;
					else if (i - count > j - 1) 
						System.out.print(" ");
					else 
						System.out.print(unit);
				}
			}
			System.out.println("");
		}
	}
	
	/**
	 *       A
	 *      A A
	 *     A   A
	 *    A     A
	 *   A       A
	 *  A         A
	 * A           A
 	 *  A         A
	 *   A       A
	 *    A     A
	 *     A   A
	 *      A A
	 *       A
	 * @param count
	 * @param unit
	 */
	public void q8(int count, String unit) {
		for (int i=0; i<count * 2 - 1; i++) {
			for(int j=0; j<count + i; j++) {
				if (i < (count * 2 -1)/2 + 1) {
					if (j < count - i - 1)
						System.out.print(" ");
					else if (count - i - 1 < j && j < count + i - 1)
						System.out.print(" ");
					else
						System.out.print(unit);
				} else {
					if (j > (count * 2) - Math.abs((count - i) - 3))
						break;
					else if (i - count > j - 1) 
						System.out.print(" ");
					else if (i - count + 1 < j && j < (count * 2 - 2) - i + count - 1)
						System.out.print(" ");
					else 
						System.out.print(unit);
				}
			}
			System.out.println("");
		}
	}
	
	/**
	 * A           A
	 *  A         A
	 *   A       A
	 *    A     A
	 *     A   A
	 *      A A
	 *       A
	 *      A A
	 *     A   A
	 *    A     A
	 *   A       A
	 *  A         A
	 * A           A
	 * @param count
	 * @param unit
	 */
	public void q9(int count, String unit) {
		for (int i=0;i<count * 2 - 1; i++) {
			for (int j=0;j<count * 2 - 1; j++) {
				if(i < (count * 2 - 1)/2 + 1) 
					if (j > count * 2 - i - 2)
						break;
					else if (j==i || (count * 2 - 2) - i == j)
						System.out.print(unit);
					else
						System.out.print(" ");
				else
					if (j > i)
						break;
					else if (j==(count * 2 - 2) - i || j==i)
						System.out.print(unit);
					else
						System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	/**
	 * AAAAAAA
	 * A     A
	 * A     A
	 * A     A
	 * A     A
	 * A     A
	 * AAAAAAA
	 * @param count
	 * @param unit
	 */
	public void q10(int count, String unit) {
		for (int i=0;i<count; i++) {
			for (int j=0;j<count; j++) {
				if (i==0||i==count-1 || j==0 || j==count-1)
					System.out.print(unit);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	/**
	 * A      A      A      A      A      A      A
	 *       A     A     A     A     A     A
	 *            A    A    A    A    A
	 *                A   A   A   A
	 *                   A  A  A
	 *                     A A
	 *                      A
	 * @param count
	 * @param unit
	 */
	public void q11(int count, String unit) {
		int blank = 0;
		for(int i=0;i<count;i++) {
			for(int j=0;j<blank;j++){
				System.out.print(" ");
			}
			blank += count-i-1;
			System.out.print(unit);
			for(int j=1;j<count-i;j++) {
				for(int k=count-i-1;k>0;k--) {
					System.out.print(" ");
				}
				System.out.print(unit);
			}
			System.out.println("");
		}
	}
	
	/**
	 *           A          A
	 *       A                  A
	 *    A                        A
	 *  A                            A
	 * A                              A
	 * @param count
	 * @param unit
	 */
	public void q12(int count, String unit) {
		int blank = count * 2;
		int blank2 = blank;
		for(int i=0;i<count;i++) {
			for(int j=0;j<blank;j++) {
				System.out.print(" ");
			}
			blank -= (count - i - 1);
			System.out.print(unit);
			for(int j=0;j<blank2;j++) {
				System.out.print(" ");
			}
			blank2 += ((count-i-1)*2);
			System.out.print(unit);
			System.out.println("");
		}
	}
	
	/**
	 *   1  2  3  4  5  6  7
	 *  24 25 26 27 28 29  8
 	 *  23 40 41 42 43 30  9
 	 *  22 39 48 49 44 31 10
	 *  21 38 47 46 45 32 11
	 *  20 37 36 35 34 33 12
	 *  19 18 17 16 15 14 13
	 * @param count
	 */
	public void q13(int count) {
		int[][] room = new int[count][count];
		int num=2;
		int x=0,y=0;
		room[y][x]=1;
		while(num <= count * count) {
			while(ismoveable(room, y,x+1,count))
					room[y][++x] = num++;
			while(ismoveable(room, y+1, x, count))
				room[++y][x] = num++;
			while(ismoveable(room, y, x-1, count))
				room[y][--x] = num++;
			while(ismoveable(room, y-1, x, count))
				room[--y][x] = num++;
		}
		
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				System.out.printf("%3d", room[i][j]);
			}
			System.out.println("");
		}
	}
	
	boolean ismoveable(int[][] room, int y, int x, int r) {
		return -1<y&&y<r && -1<x&&x<r && room[y][x] == 0;
	}
}
</code>
</pre>

