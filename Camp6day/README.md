# 패스트캠퍼스 6일차
JAVA란 개발언어 - OOP(Object Oriented Programming)

## 컴파일 순서
텍스트 형태의 [파일명.java 파일]을 -> class로 Pre컴파일 -> 각각의 OS로 기계어로 컴파일

* class파일로 변경
  * javac HelloWorld.java —> HelloWorld.class파일이 생긴다.
* class파일을 실행
  * java HelloWorld -> class파일이 실행되어 나온다.
* * *
### HelloWorld.java 내용
<pre>
<code>
 class HelloWorld {
//예약어  클래스이름

     public static void main(String[] args) {

         int a = 15;
         int b = 20;
         int c = a + b;

         System.out.print("HelloWorld");

     }

 }
 </code>
 </pre>
* args는 arguments의 약자이나, 이름은 아무거나 상관없다.
* 들여쓰기는 공백 4개!!
* 로직은 항상 함수 안에 선언!
* 명령어 마지막에는 항상 ; 세미콜론

* * *
## 주의 
Python같은거는 탭이랑 스페이스랑 서로 달라서 통일 시켜야한다.

* calss는 바이너리 파일이다. Magic Number 파일 초반에 어떠한 파일인지 알려주는 파일이다.
* java는 ‘cafe babe’ zip ‘504b 0304’
* 그외에도 java정보를 알려주는 내용을 magic number, minor version등 보여준다.
* * *

### Java파일의 Runtime 컴파일
* Java는 class로 precomplie시켜 vm에서 동작시켜준다.
* class를 각 기기의 기계로 번역하는것.
* JIT : 클래스가 호출되는 순간 기계어로 컴파일 -> 최초 한번은 속도 저하가 생긴다.
  * (Just In Time)
* AOT : 클래스가 설치됐을때 최초 한번 기계어로 컴파일 -> 안드로이드 처럼 설치가 명확한 구조에서만 가능한다.
  * (Ahead Of Time)

> ### Java실행과정
>  HelloWorld.class -> Class Loader <-> Execution Engine -> Native Method Stack
>
>  Library -> Class Loader -> JavaStack
>
>  Garbage Collector -> Heap
>
>  Method Area - Heap - Java Stack - PC Register - Native Method Stack
>
> 코드들은 Method Area에 해당
>
> 실행한다 -> Heap에 올라간다.


<pre>
<code>
소수점 연산 오류 확인
> 지수가수 표기법
a = 0.1515 * 10E1
b = 0.55 * 10E-5

> 풀어쓰기
a = 1.515
b = 0.0000055

> 지수가수 표기법으로 변경 (가수에 할당된 자리수가 7자리일 경우)
a + b = 1.515005(5) = 0.15150055 * 10E1
  > 여기서 0.0000005의 오차 발생
> 가수부가 3자리로 한정되면 아래와 같이 뒷자리가 절삭된다.

a + b = 0.152 * 10E1
</code>
</pre>
* * *
## 쉬프트 연산자
<pre>
<code>
>>>는 
a ->   00000000 00000000 00000000 00000111 -> 7
>> ->  00000000 00000000 00000000 00000011 -> 3
>>> -> 10000000 00000000 00000000 00000011 -> -?
</code>
</pre>
* * *
## 참고
1부터 N까지의 더한값
<pre>
<code>
sum(1~N)
(N + 1) * N /2
1,2,3,4,5,6,7 …. 100
    +
100,99,98,97,96,95,94….1  -> 총 100번 계산함
    +
101,101,101,101,101,101….101

—> (n + 1) * n /2
</code>
</pre>
* * *
## 참고 
n부터 m까지의 더한값
<pre>
<code>
sum(n~m)
int result = (m + n) * (m - n + 1) / 2;
</code>
</pre>
* * *
[소스 확인](https://github.com/timejp/FAST/blob/master/Camp6day/HelloWorld.java)
