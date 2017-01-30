# 패스트캠퍼스 13일차

## APP Components
안드로이드는 App을 구성하는 4개의 핵심 컴포넌트가 있으며 이들은 각각의 독립적인 Life Cycle에 의해서 실행된다.

### Content Resolver
다른 프로세스의 메모리에 접근을 못해주기 때문에 접근 가능하도록 인터페이스를 지정하여 공유 해줄 수 있다.

## Intent
* 명시적(Explicit) Intent
  * Intent를 소스상에서 표현해주면서 클래스 이름을 지정해준다.
  * 명시적 인텐트는 호출되는 대상이 명확하게 지정된 경우를 말한다. 보통 자신의 하위 엑티비티를 호출하기위해 많이 사용된다. 엑티비티를 사용하기 위해서는 메니페스트에 반드시 등록을 해아하며 등록하지 않았다면 오류가 발생한다.
* 암묵적(Implicit) Intent
  * Intent.ACTION_DIAL와 같이 시스템에서 미리 지정해 놓은 Intent값이다.
  * 암시적 인텐트는 호출 대상이 명확하게 정의되어있지 않은 인텐트를 말한다. 
  * 주로 다른 어플리케이션의 컴포넌트를 호출 할 때 사용한다. 안드로이드 운영체제에서 암시적 인텐트에 포함된 정보로 설치된 모든 컴포넌트를 검색하여준다.

## Android Life Cycle
> 화면이 A , B가 있을 때 A 위에 B가 올라오면 onPause()가 되는데, B가 A를 완전히 가려졌을때 onStop()이 호출된다.
>
> 다만 B가 반투명이다 이런 상황에서 A가 화면에 약간이라도 보이면 onPause()만 호출되고, 
>
> 다 가려지면 onStop()이 호출된다.
>
> (A기준)

* * *

[오늘 작업한 소스](https://github.com/timejp/FAST_Widgets)
[오늘 작업한 소스](https://github.com/timejp/FAST/tree/master/Project/ActivityControll)
[오늘 작업한 소스](https://github.com/timejp/FAST/tree/master/Project/ActivityControl2)
