# 패스트캠퍼스 4일차
## 데이터 베이스
  대부분 보조기억장치에서 이루어짐
## 자료구조
  대부분 주기억장치에서 이루어짐

* 관계형 - RDB
* 키-값형
* 객체형
* 문서형
* 컬럼형

### DBMS
  * DataBase Management System
  * DB에 접근할 수 있는 기능을 제공하는 소프트웨어(DB의 OS)
  * 예 : Mysql, PostgreSQL, SQLite….
### SQL
  * Structured Query Language
  * DBMS를 통해 데이터를 관리하기 위한 구조화된 질의문을 작성하기 위한 언어
  * 관계형 데이터베이스 관리 시스템에서 사용


### 네트워크
  * 기기들관의 연결 모양새
### 인터넷
  * 네트워크간의 연결

### LAN
  * 근거리 통신망
  * Local Area Network
  * (건물간)
### MAN
  * 도시권 통신망
  * (도시간)
### WAN
  * 광역 통신망
  * Wide Area Network
  * (국가간)

### 인터넷
  * TCP/IP
      * TCP (Transmission Control Protocol)
      * IP (Internet Protocol)
  * www
      * World Wide Web
      * 문서(웹페이지)들이 있는 정보의 저장소
      * 분산과 연결
  * URL
      * Uniform Resource locator
      * \[Protocol]://[Host]:[Port]/[Path]
      * http://www.naver.com:80/cafe
      * ftp://id:pw@xxx.xxx.xxx.xxx/dir
      * file://localhost/dir
  * Protocol
      * 프로토콜
      * 통신규약
      * 장비 사이에서 메시지를 주고 받는 양식과 규칙의 체계
  * HTTP
      * Hyper Text Transfer Protocol
      * METHOD
        * GET URL에 노출.
        * POST 패킷에 쓰여있어 노출되어있지 않음.
        * PUT
        * DELETE
        * HEAD
        * TRACE
        * OPTION
        * CONNECT
  * FTP
      * FileTransfer Protocol
  * TELNET
      * TErminal NETwork
      * 원격 로그인을 위한 프로토콜
  * SSH
      * Secure Shell
      * 네트워크 상의 다른 컴퓨터에 로그인 하거나 원격시스템에서 명령을 할 수 있도록 해주는 프로그램, 프로토콜
      * TELNET의 대용 목적으로 설계
* * *
## 참고
  TELNET vs SSH = 암호와 사용여부
  * SSL
      * Secure Socket Layer
      * 웹서버와 브라우저 사이의 보안을 위한 프로토콜
  * SMTP
      * Simple Mail Transfer Protocol
      * 전자메일 발송 프로토콜
  * Host
      * 호스트 : 네트워크에 연결된 장치
      * 호스트 이름 : 네트워크에 연결된 장치에 부여되는 고유한 이름
      예) IP주소, 도메인 주소, MAC 주소…
  * IP Address
      * Internet Protocol Address
      * 컴퓨터 네트워크에서 장치들이 서로를 인식하고 통신을 하기 위해서 사용하는 번호
  * Domain Address
      * 네트워크상에서 컴퓨터를 식별하는 호스트이름
  * DNS
      * Domain Name System
      * 호스트의 도메인 이름을 호스트의 네트워크 주소로 바꾸거나 그 반대의 변환을 수행
  * MAC Address
      * Media Access Control Address
      * 네트워크 어댑터에 부착된 식별자
  * Port
      * 가상의 논리적 통신 연결단
      * 번호로 구분
* * *
## OSI 7계층
응용 - 표현 - 세션 - 전송 - 네트워크 - 데이터 링크 - 물리



암호화
  * 대칭키
      * 암호화와 복호화에 같은 암호키를 쓰는 알고리즘
      * DES, AES, SEED
  * 공개키(비대칭키)
      * 공개키로 암호화된 데이터를 비밀키를 사용하여 복호화 할 수 있는 암호화 알고리즘
      * RSA
  * 해시
      * 임의의 데이터(암호 등)를 고정된 길이의 데이터로 매핑하여 원래의 입력값과의 관계를 찾기 어렵게 만든 것
      * SHA, MD5
