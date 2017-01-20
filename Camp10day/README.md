# 패스트캠퍼스 10일차
## inode == file record
inode는 unix시스템에서 파일의 위치? 파일을 가르키는 번호이다.

파일(용량)이 작은거는 디스크에 저장이 되지 않고, file record에 저장이 된다.
* * *
## try with절
<pre><code>
try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	String line;
	while((line = br.readLine()) != null) {
    	System.out.println(line);
	}
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
</code></pre>
> `br.close()`를 자동으로 실행 해준다.
* * *
## `File.separator`
OS에 맞게 경로의 `/` 인지 `\` 인지 구별을 해줘서 써준다.
## `file.mkdirs()`
해당 경로까지의 디렉토리를 모두 만들어 준다.
* * *
## IO vs NIO

* IO
  * 스트림 방식
  * non buffer
  * 비동기 지원안함
  * 블로킹만 지원
  * File를 사용함

> 스트림 기반 
> 스트림은 입력 스트림과 출력 스트림으로 구분되어 있기 때문에 데이터를 읽기 위해서는 입력 스트림을 생성해야 하고,
> 데이터를 출력하기 위해서는 출력 스트림을 생성해야 합니다.
> 예를 들어 하나의 파일에서 데이터를 읽고 저장하는 작업을 모두 해야 한다면
> FileInputStream 과 FileOutputStream을 별도로 생성해야 합니다.

  > 연결 클라이언트가 많다.
  >
  > 전송되는 데이터가 대용량이면서 순차적으로 사용될 필요성이 있는 경우.

* NIO
  * 채널방식
  * 버퍼방식
  * 비동기 지원
  * 블로킹, 논블로킹 지원
  * Path를 사용함으로 File를 사용하지 않아도 된다.

> 채널 기반
> 채널은 스트림과 달리 양방향으로 입력과 출력이 가능 
> 그렇기 때문에 입력과 출력을 위한 별도의 채널을 만들 필요가 없다.
> 예를 들어 하나의 파일에서 데이터를 읽고 저장하는 작업을 모두 해야 한다면 FileChannel 하나만 생성하면 됩니다.

   > 클라이언트 수가 많다.
   >
   > 하나의 입출력 처리 작업이 오래 걸리지 않는 경우.

|  | IO | NIO |
| :------: | :------:| :------: |
| 입출력 방식 | 스트림(stream) 방식 | 스트림(stream) 방식 |
| 버퍼 방식 | 넌버퍼(non-buffer) | 버퍼(buffer) |
| 비동기 방식 | 지원 안 함 | 지원 |
| 블로킹 / 넌블로킹 방식 | 블로킹 방식만 지원 | 블로킹 / 넌 블로킹 모두 지원 |

스트림 VS 채널
> 속도는 채널이 빨라서 NIO가 속도가 빠르다.

* * *
[오늘 작업한 소스](https://github.com/timejp/FAST/tree/63788e2d63ef0b0e946be7cd81a06beb73976ae4/Project/BBS)
