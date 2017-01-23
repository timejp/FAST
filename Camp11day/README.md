# 패스트캠퍼스 11일차

## Android Runtime
* Dalvik
  * 기존 JavaVM과 마찬가지로 소스코드가 실행될때 한번 컴파일을 하기 떄문에 실행시 성능 저하의 우려
* ART
  * 설치시 최초 한번만 컴파일 하는 방식인 AOT로 설계 되어있으나 효율성을 위해 AOT와 JIT를 함께 사용하고 있다.
## Android Runtime Architecture
![Android Runtime Architecture](https://lh5.googleusercontent.com/MxH8wXEbpzjhfDzbDY52F8jp87ciFPaQxMPQN6xQvzRitaH_hQNarzkK90O3HYfieEPX8g1J2BlxmlSZwbAs5jrqiKeRNfnSmdW1OCKXG6DDmpDm_xA5XRGYDyuVx_50VA)
* * *
## Gradle
1. Compile - 리눅스 상에서의 Compile 및 Build과정
  * Compile : 소스코드 -> 기계어
  * Link : 기계어 + 라이브러리 연결
2. 안드로이드 Compile -> Dex파일을 생성
3. Build : Dex파일을 apk(설치파일로 변환)
### Build Tools
* Make : 리눅스 빌드 툴 -> 소스코드를 실행파일로 만든다. (플랫폼 의존성 있음)
* Ant : 플랫폼에 독립적이면서, Java IDE의 최초 빌드툴(의존성 관리 도구가 없다.(라이브러리))
* Gradle : 안드로이드에서 사용되는 빌드 툴
* Maven : 기본 규칙(포멧)을 벗어나면 처리가 어렵다
### Gradle
* Groovy DSL
  * Groovy 스타일 언어 지원 -> 컴파일 없이 스트립트 실행(Domain Specific Language 기반)
* Gradle Wrapper
  * Gradle Wrapper 사용으로 실제 머신에 Gradle이 업어도 빌드 가능
* Ant + Maven
1. 별도 Gradle설치 불필요
2. Multi-Project 빌드가 용이함

* `gradlew build`(유닉스에서 : `./gradlew build)
  * gradle에 설정해 놓은 productFlavors별, debug, release별로 apk를 따로 만들어 준다.
* * *
## Lint
Android Code Scanning Tool
* 문법이 이상한것들 검사하고 수정해주는 기능
  * Error : 수정해야 다음으로 넘어감
  * Warning : 경고만 줌 (컴파일 가능)
  * Information : 거의 없음 (TODO)
* * *
## CI(Continuous_Integration) Travis
웹상에서 빌드테스트를 하는 툴이다.
### 설정파일
[.travis.yml](https://github.com/timejp/FAST_Settings/blob/master/.travis.yml)
* * *
[참고 pdf](https://github.com/javafa/2nd_Settings/tree/master/ppt)
* * *
[오늘 작업한 소스](https://github.com/timejp/FAST_Settings/tree/ff8b4831bacc6a044a29400a672601f023a13345)
