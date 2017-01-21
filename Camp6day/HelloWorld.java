package com.timejh;

import java.math.BigDecimal;

/** 설명 : Java 문서를 생성하기 위한 주석 
 * 
 * @author tokijh
 * @version 1.0
 *
 */
public class HelloWorld {
	
	public static void main(String[] args) {
		
		//System.out.println("HelloWorld");
		
		HelloWorld hello = new HelloWorld();

		/*// 더하기 호출
		int a = hello.sum(1, 2);
		hello.print(a);

		// 빼기 호출 
		int b = hello.min(1, 2);
		hello.print(b);

		// 곱하기 호출
		int c = hello.mul(1, 2);
		hello.print(c);

		// 나누기 호출
		int d = hello.div(1, 2);
		hello.print(d);*/
		
		//hello.calculate(10000, 3720);
		
		//hello.condition();
		
		//hello.loop();
		
		System.out.println(hello.q1(3333333333L).toString());
		
		//System.out.println(hello.q2(2, 10));
		
		//hello.ex1();
		
		//hello.q3(33);
		
		//System.out.println(hello.q3_(3));
	}
	
	/** 지불한 금액 payed 에서
	 * 실제 가격 amount 를 빼고 남은
	 * 거스름돈의 개수를 출력하세요.
	 * 
	 *  제약조건
	 *  payed = 10,000원
	 *  amount = 3,720원
	 * 
	 * @param payed
	 * @param amount
	 */
	public void calculate(int payed, int amount) {

		int m5000 = 0; //잔돈중 오천원권 개수
		int m1000 = 0; //잔돈중 천원권 개수
		int m500 = 0; //잔돈중 5백원권 개수
		int m100 = 0; //잔돈중 백원권 개수
		int m50 = 0; //잔돈중 50원권 개수
		int m10 = 0; //잔돈중 10원권 개수
		
		int mReturn = payed - amount;
		
		m5000 = mReturn / 5000;
		mReturn %= 5000;
		
		m1000 = mReturn / 1000;
		mReturn %= 1000;

		m500 = mReturn / 500;
		mReturn %= 500;

		m100 = mReturn / 100;
		mReturn %= 100;
		
		m50 = mReturn / 50;
		mReturn %= 50;
		
		m10 = mReturn / 10;
		mReturn %= 10;
		

		System.out.println("오천원:" + m5000 + "개");
		System.out.println("천원:" + m1000 + "개");
		System.out.println("오백원:" + m500 + "개");
		System.out.println("백원:" + m100 + "개");
		System.out.println("오십원:" + m50 + "개");
		System.out.println("십원:" + m10 + "개");
	}
	
	// 0. JavaDoc
	
	// 1. 연산자
	
	/** 값을 콘솔에 출력하는 함수
	 * 
	 * @param value - 정수형 입력값
	 */
	public void print(int value) {
		System.out.println(value);
	}
	
	/** 입력값 a,b를 더해서 리턴
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	// 접근제어자 //함수명
	public int sum(int a, int b) {
		// 리턴값   //파라미터 들...
		return a + b;
	}
	
	/** 입력값 a,b를 빼서 리턴
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int min(int a, int b) {
		return a - b;
	}
	
	/** 입력값 a,b를 곱해서 리턴
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int mul(int a, int b) {
		return a * b;
	}
	
	/** 입력값 a,b를 나눠서 리턴
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int div(int a, int b) {
		return a / b;
	}
	
	// 2. 조건문
	
	/** 조건문
	 * if
	 * 비교결과가 참인지 거짓인지를 판단하여 해당 블럭 내에 있는 로직을 실행한다.
	 * switch
	 * 입력된 값이 어떤 특정값과 비교하여 해당 블럭내에 있는 로직을 실행한다.
	 */
	public void condition() {
		int a = 15;
		int b = 20;
		int c = 15;

		if ( a > b ) {
			System.out.println("a는 b보다 큽니다.");
		} else if ( a == b ) {
			System.out.println("a는 b와 같습니다.");
		} else {
			System.out.println("a는 b보다 작습니다.");
		}
		
		c = (a==15)? 100 : 0;
		
		switch(a) {
			// case는 if 문의 == 와 같은 역할을 한다.
			case 1:
				System.out.println("a는 1입니다.");
				break;
			case 15:
				System.out.println("a는 15입니다.");
				break;
			case 20:
				System.out.println("a는 20입니다.");
				break;
			default :
				System.out.println("a는 " + a + "입니다.");
		}
	}
	
	// 3. 반복문 

	/** 반복문
	 * for
	 * 특정 범위 내의 값만큼 반복하면서 블럭내의 로직을 실행한다.
	 * 
	 * while
	 * 특정 조건이 만족될 때 블럭내의 로직을 실행한다.
	 */
	public void loop() {
		//  시작값     종료값   증감값
		int i = 0; // 반복문의 시작값
		int limit = 100;
		for (i=0; i < limit; i++) {
			System.out.println("i = " + i);
		}
		
		i = 0;
		while(i < limit) {
			System.out.println("i2 = " + i);
			i = i + 1;
		}
		
		int a = 0; // 시작값
		int a_limit = 10; // 종료값
		
		int b = 0; // 내부 for 문의 시작값
		int b_limit = 10; // 내부 for 문의 종료값
		
		for(a = 0; a < a_limit; a++) {
			for (b = 0; b < b_limit; b++) {
				System.out.println("a = " + a + " b = " + b);
			}
		}
		System.out.println("after a = " + a);
	}
	
	public BigDecimal q1(long max) {
		BigDecimal result = new BigDecimal(0);
		
		BigDecimal bigMax = new BigDecimal(max);
		
		result = result.add(bigMax);
		result = result.add(new BigDecimal(1));
		
		result = result.multiply(bigMax);
		result = result.divide(new BigDecimal(2));
		
		return result;
	}
	
	public int q2(int n, int m) {
		int result = (m + n) * (m - n + 1) / 2;
		return result;
	}
	
	public void ex1() {
		int i;
		int j;
		for(i=1; i<=3; i++) {
			for(j=1; j<=2; j++) {
				if(i<=2)
					continue;
				System.out.println(i + " " + j);
			}
			System.out.println("endj");
		}
		System.out.println("");
		for(i=1; i<=3; i++) {
			for(j=1; j<=2; j++) {
				if(i<=2)
					break;
				System.out.println(i + " " + j);
			}
			System.out.println("endj");
		}
	}
	
	public int q3_(int n) {
		if (n<=1) return 1;
		return n * q3_(n-1);
	}
	
	public void q3(int n) {
		for(int i=1;i<=n;i++){
			for (int j=1;j<=n;j++) {
				System.out.print(i +" x " + j + " = " + i * j + " ");
			}
			System.out.println("");
		}
	}
	
}
