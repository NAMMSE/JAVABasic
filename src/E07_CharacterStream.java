import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class E07_CharacterStream {

	/* 0519 목요일
	  
	   # InputStream / OutputStream
	   
	    - byte 단위로 데이터를 입출력하는 클래스
	    - 불편하다
	    
	   # Reader / Writer
	   
	    - char 단위로 데이터를 입출력하는 클래스
	    - 2byte로 이루어진 문자도 쉽게 입출력 할 수 있다
	    
	   # Charset
	   
	    - ASCII코드까지는 모든 문자셋이 동일하지만 그 이후의 문자 코드는 각 회사마다 다르다
	    - MS949 : Windows에서 사용하는 문자셋
	    - EUC-KR : 이클립스가 기본적으로 사용하는 한국어 문자셋. 유효한 한국어만 들어있다 (꽳뱕훦.. x)
	    - UTF-8 : 가장 표준이 되는 문자셋. 많은 문자를 포함하고 있어서 용량도 크다
	 */
	
	public static void main(String[] args) {
		// 각 다른 문자셋으로 문자열을 byte로 나눈 결과
		System.out.println(Arrays.toString("안녕하세요".getBytes(Charset.forName("MS949"))));
		System.out.println(Arrays.toString("안녕하세요".getBytes(Charset.forName("EUC-KR"))));
		System.out.println(Arrays.toString("안녕하세요".getBytes(Charset.forName("UTF-8"))));
		// 파일 쓰기
		File f = new File("files/filewrite.abc");
		try {
			// FileWriter(file, boolean append)
			// append = true는 내용을 추가
			// append = false(기본값)은 내용을 덮어쓴다
			FileWriter out = new FileWriter(f, Charset.forName("UTF-8"),true); // true로 하고 계속 실행하면 같은 내용 계속 추가함
			
			out.write('한');
			out.write('글');
			out.write('자');
			out.write('씩');
			out.write('\n');
			
			out.write("한번에 여러 글자씩 쓸 수 있다 \nbyte[]로 바꿔야하는 것도 모르고 쓸 수 있다\n");
			
			char[] arr = "\nABCDEFGHIJKLMNOP".toCharArray();
			
			out.write(arr);
			
			// off : 시작 위치, len : 몇 문자를 사용할지
			out.write(arr, 5, 3);
			
			for(int i=0;i<3;i++) { // append는 out.wirte의 toString을 한 것과 같다 / 결국 같은 기능
				out.append("\n        /)/)\n");
				out.append("       (  ..)\n");
				out.append("       (  >♡ \n");
			}
			
			out.write(arr);
			out.write(arr);
			out.write(arr);
			
			out.close();
			System.out.println("파일쓰기완료");
		} catch (IOException e) {
			//e.printStackTrace();
		}
		
		// ------------------------------------------------------
		// 파일 읽기
		
		System.out.println("읽기 시작");
		
		try {
			FileReader in = new FileReader(f, Charset.forName("UTF-8"));
			
			char[] buffer = new char[1024];
			int len;
			while((len = in.read(buffer))!=-1) {
				System.out.println(new String(buffer, 0, len));
			}
			
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
