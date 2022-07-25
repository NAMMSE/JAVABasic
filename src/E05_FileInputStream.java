import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class E05_FileInputStream {

	public static void main(String[] args) {
		
		// 파일로부터 데이터를 읽어들이는 통로
		
		//FileInputStream in = new FileInputStream("files/abc.txt"); // 이거 먼저 치고 에러뜨면 두번째 해결방법 누르기
		try {
			File f = new File("files/abc.txt");
			FileInputStream in = new FileInputStream(f);
			//FileInputStream in = new FileInputStream("files/abc.txt"); // 첫날 적은 OT 파일 files로 복사하기
			
			// read() : 데이터를 1byte씩 읽어주는 메서드 
				 	  //한 바이트씩 읽기 때문에 한글 등의 2바이트 문자로 직접 합치기가 어렵다
			int ch;
			while((ch=in.read())!= -1) {
				System.out.print((char)ch);
			}
			
			System.out.println("======");
			// read(byte[]) : 전달한 byte[]에 데이터를 담아준다. 읽은 길이를 반환한다.
			// 				  파일을 끝까지 모두 읽으면 -1을 반환한다
			byte[] buffer = new byte[10]; // 메모장 내용을 바이트의 10개 단위로 읽어들이기 위해 10개짜리 배열로 초기화 
			int len; 
			while((len=in.read(buffer))!= -1){
				System.out.println(Arrays.toString(buffer)+"이번에 읽은 바이트 개수: "+len); // abc 메모장내용 abcdefghijklmnop로 수정했을때 숫자로 표현
				// 밑에 줄 실행하면 10개단위로 읽어들이는데 만약 메모장 내용이 16글자이면 앞에 10글자는 배열에 저장하고 뒤에 6글자는 같은 배열에 앞에서부터 다시 채워 넣기 때문에 뒤에 남은 4자리에는 앞에 저장했던 뒤에 4자리가 그대로 남아있다
				//System.out.print(new String(buffer)); 
				// 이 문제를 해결해주는게 밑에있는 오버로딩이다
				//System.out.print(new String(buffer, 0, len));
			}
			
			
			// readAllBytes() : 한번에 파일의 모든 데이터를 byte[]로 읽는다
			byte[] allBytes = in.readAllBytes(); // 이것도 에러뜨는데 두번째 솔루션 누르기
			// byte 단위로 나누어져 있던 문자열을 합칠 때 charSet마다 다른 방식으로 합친다.
			// 이 과정에서 문자가 깨질 수 있다
			String fileDataStr = new String(allBytes, Charset.forName("UTF-8")); // 메모장을 byte단위로 쪼갰다가 다시 합칠때 메모장의 규격(메모장 우측하단 UTF-8)로 다시 합쳐야 정상적으로 내용이 출력된다 
			System.out.println(fileDataStr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
