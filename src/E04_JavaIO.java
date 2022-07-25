import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E04_JavaIO {

	/*0518 수요일
	  이게 메인 이걸 배우기 위해 E01 02 03 배운것
	  # Java I/O (Input/Output)
	  
	   - 자바는 스트림이라는 개념을 이용해 프로그램의 입/출력을 다룬다
	   - 프로그램으로 들어오는 모든 데이터들을 입력(Input)이라고 부른다
	   - 프로그램에서 계산되어 나가는 모든 데이터들을 출력(Output)이라고 부른다
	   
	   
	  # Stream
	  
	   - 데이터들이 오고가는 통로
	   - 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 부른다
	   - 데이터들이 프로그램에서 목적지로 나가는 통로를 OutputStream이라고 부른다
	   - 데이터가 Stream을 지나가기 위해서는 해당 데이터를 byte타입으로 변환시켜야한다
	     (데이터를 자동으로 byte타입으로 분해해주는 클래스들도 있다)
	 */
	
	public static void main(String[] args) {
		//FileOutputStream out = new FileOutputStream("files/abc.txt"); //이렇게 적으면 반드시 처리해줘야하는 예외가있다 (f2누르고 두번쨰 해결방법 누르면 자동으로 try catch절 생성)
		try { // 윗줄 에러 두번째 해결방법 누르면 생기는 try절
			FileOutputStream out = new FileOutputStream("files/abc.txt"); // 이거 실행하려면 javabasic에 마우스 우클릭 new -folder 생성해야 txt파일 만들어짐
			
			out.write(65); // 이 메서드도 반드시 처리해줘야하는 예외가 있어서 에러 메시지 4개중 2번째꺼 눌러줘야함
			out.write(66); // 
			out.write(67);
			out.write('\n');
			
			// str.getBytes() : 해당 문자열을 전송용 바이트 배열로 변환하는 메서드
			out.write("안녕하세요 반갑습니다!!!!!".getBytes());
			
			// 다 쓴 통로는 반드시 닫아줘야 한다( 프로그램 스스로 언제 닫아야할지 결정하지 못한다)
			// 자바는 원래 이걸 알아서 닫아주는데 스트림을 사용할때는 수동으로 일일이 닫아줘야한다 
			out.close();
			
		} catch (FileNotFoundException e) {// FileOutputStream 에러 해결누르면 생기는 catch절
			e.printStackTrace();
		} catch (IOException e) {// 30번재줄 에러 해결 누르면 나오는 catch절
			e.printStackTrace();
		}
		System.out.println("쓰기 완료");
		
	}
}
