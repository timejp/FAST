# 패스트캠퍼스 9일차

## SRP - 단일 책임

>하나의 Class는 하나의 역할만 맡는다.
>
>높은 응집도(연관된 것 끼리의 통신)와 낮은 결합도를 추구한다.

1. 코드 변경의 영향이 미치는 범위가 최소화 된다.
	- Class거 변경되도 다른 Class에 영향을 미치지 않는다.
2. 코드 응집성이 향상된다.
	- 데이터 연관성이 높은것 끼리 인터페이싱이 자주 일어난다.
3. 단위 테스트가 용이하다.
	- 각 Class별 테스트가 가능하다.

## OCP - 개발 폐쇄
> 다른사람들이 내 클래스를 상속하면 그것을 소스가 보이지 않도록 하는 것

## ISP - 인터페이스 분리
> 클라이언트틑 자신이 쓰지않는 인터페이스에 의존하지 않는다.
>
> 특화된 여러개의

## DIP - 의존 관계 역전
> 상위 모듈이 하위 모귤에 의존하면 안된다.


* * *
## Class
> **1.** 첫글자 대문자!

* * *

### Overload
<pre><code>
public void print(int a) {

}

public void print() {

}

public String print(String a) {

}
</code></pre>
하지만 
<pre><code>
public String print() {

}
</code></pre>
는 적용 안됨. 파라미터가 달라야만 한다.

* * *

### 접근 제한자
1. public
    * 모두 접근 가능
2. private
    * 같은 패키지여도 같은 클래스가 아니면 접근을 못한다.
3. default (미입력)
    * 같은 패키지가 아니면 접근을 못한다.
4. protected
    *  같은 패키지(폴더)에 있는 객체와 상속관계의 객체들만 허용
* * *
### Override
> 이미 정의 되어있는 기능을 다시 작성을 하여 바꿔버리는 기능
* * *
### Interface
기능할 이름만 정의 해놓고

implements한 클래스에서 Interface에 대한 기능을 적어준다.
* * *
### inner Class
> 클래스 안에 클래스
>
> 내부 클래스에서 부모 클래스의 변수, 함수 사용가능
>
> 내부 클래스에서는 static 사용 불가
* * *
### static inner class
> static 이란 초기화를 사용하지 않아도 실행이 가능하다.
>
> 속도 빠른데신 클래스가 정의 된 순간 메모리에 올라가기 때문에 메모리 차지를 한다.
* * *

[오늘 작업한 소스](https://github.com/timejp/FAST/tree/356ff7551c5003f55ad2bda05996da0a9d40b10e/Project/BBS)
