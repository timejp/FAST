# 패스트캠퍼스 8일차

## 참고로 알아 둘것
>### 객체 : 설계단계의 개념화된 앞으로 코딩할 대상
>### 클래스 : 개념화된 객체가 코드로 만들어 진것
>### 인스턴스 : 클래스에 따라서 실행을 하여 객체가 메모리에 올라간 것

* * *
## ArrayList
한 클래스에서 한번은 사용될 정도로 많이 사용된다.
<pre>
	<code>
String myName = "yjh";
String palYong = "palYong";
String jaeSeock = "jaeSeock";
String jaeMin = "JaeMin";
String seokYang = "seokYang";

ArrayList nameList = new ArrayList();
		
nameList.add(seokYang);
nameList.add(palYong);
nameList.add(jaeSeock);
nameList.add(myName);
nameList.add(jaeMin);
		
System.out.println(nameList.get(2));

System.out.println("------------------------");
		
// For문
for(int i=0;i&gtnameList.size();i++) {
	System.out.println("For문 : " + i + "번째 " + nameList.get(i));
}

System.out.println("------------------------");

// For each문
for(Object name : nameList) {
	System.out.println("For each문 : " + name.toString());
}
	</code>
</pre>
### 제너릭 사용
<pre>
	<code>
System.out.println("----------------제너릭----------------");

		
// 제너릭 (String과 같이 지정(한정)을 해줄 수 있다.)
ArrayList<String> nameListString = new ArrayList<String>();

nameListString.add(seokYang);
nameListString.add(palYong);
nameListString.add(jaeSeock);
nameListString.add(myName);
nameListString.add(jaeMin);

System.out.println(nameListString.get(2));

System.out.println("------------------------");

// For문
for(int i=0;i&gtnameListString.size();i++) {
	System.out.println("For문 : " + i + "번째 " + nameListString.get(i));
}

System.out.println("------------------------");

// For each문
for(Object name : nameListString) {
	System.out.println("For each문 : " + name.toString());
}
	</code>
</pre>
* * * 
## String 관련 함수
### 1. 문자열 비교
* compareTo
  * `str1.compareTo(str2)`
* equals
  * `str1.equals(str2)`
  > 두 문자열이 같으면 `true` 다르면 `false`
* ==
  * `str1 == str2`
### 2. 문자열의 인덱스 값
* charAt
  * `str1.charAt(1)`
  > str1의 1번째 문자를 char로 가져온다. (0부터 시작 따라서 두번째임)
### 3. 문자열 합치기
* str1 + str2
### 4. 문자열 파악
* startsWith
  * `str1.startsWith("23")`
  > str1이 `"23"`으로 시작하면 `true`
* endsWith
  * `str1.endsWith("23")
  > str1이 `"23"`으로 끝나면 `true`
* indexOf
  * `str1.indexOf("23")`
  > str1이 `"23"`가 몇번째에 나오는지 `int`로 표현
  >
  > 없으면 `-1`
* length
  * `str1.length()`
  > 문자열의 길이
### 5. 문자열 수정
* replace
  * `str1.replace("1", "x")`
  > str1의 1을 x로 변경
* replaceAll
  * `str1.replaceAll("문자열 패턴 : 정규식", "바꿀 문자")`
* substring
  > `String str1 = "1234567"`
  * `str1.substring(3)`
  > 123
  * `str1.substring(1, 3)`
  > 234
* split
  > `String str1 = "www.naver.com"`
  * `String[] res = str1.split(".")`
  > `res[0] = www`
  >
  > `res[1] = naver`
  >
  > `res[2] = com`
* * * 
## **참고**
> String 은 String table이 따로 있어
>
> `String a = "안녕하세요"`
>
>  `String b = "안녕하세요"`
>  
>  메모리 주소가 a나 b나 똑같음!!
>
>  검색속도를 더 빠르게 한다.

>  `String a = "안" + "녕" + "하"`
>
>  라고 하면 
>
>  "안"을 저장하고
>
>  "녕"을 저장하고
>
>  "하"를 저장하고
>
>  "안녕하"를 저장한다.
>
>  따라서 속도가 매우 느려지니 String Buffer를 사용한다.
* * *

[오늘 작업한 소스](https://github.com/timejp/FAST/tree/master/Camp8day)
