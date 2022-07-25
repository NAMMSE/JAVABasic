import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class E09_BufferedStream {

	/*
	 
	  # Buffer (데이터를 한번에 모아둘수 있는 장소)
	  
	   - 데이터를 한개씩 여러번 전달하는 것보다 모아서 한꺼번에 전달하는 방식이 훨씬 처리속도가 빠르다
	   - 버퍼가 미리 구현된 스트림 클래스들은 앞에 Buffered라는 이름이 붙어있다
	   - BufferedInputStream, BufferedReader....
	 */
	
	static File book = new File("files/frankenstein.txt");
	
	
	/** 한 글자씩 읽기*/
	public static void read1() {
		FileReader in = null;
		try {
			in = new FileReader(book);
			
			int ch;
			
			while((ch = in.read()) != -1){
				System.out.print((char)ch);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/** 버퍼 방식으로 읽기 (1024) */
	public static void read2() {
		FileInputStream in = null;
		try {
			in = new FileInputStream(book);
			
			byte[] buffer = new byte[1024];
			int ch;
			
			while((ch = in.read(buffer)) != -1){
				System.out.println(new String(buffer, 0, ch));
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/** 버퍼 방식으로 읽기 (1024) */
	public static void read6() {
		FileInputStream in = null;
		try {
			in = new FileInputStream(book);
			
			byte[] buffer = new byte[2048];
			int ch;
			
			while((ch = in.read(buffer)) != -1){
				System.out.println(new String(buffer, 0, ch));
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/** 버퍼 방식으로 읽기 (2048) */
	public static void read3() {
		FileReader in = null;
		try {
			in = new FileReader(book);
			
			char[] buffer = new char[1024];
			int ch;
			
			while((ch = in.read(buffer)) != -1){
				System.out.println(new String(buffer, 0, ch));
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//BufferedReader 사용
	public static void read4() {
		//BufferedReader in = new BufferedReader(new FileReader(book)); 
		FileReader fin = null;
		BufferedReader bin =null;
		
		try {
			fin = new FileReader(book);
			bin = new BufferedReader(fin);
			
			//BufferedReader에는 readLine() 메서드가 있어서 한 줄씩 읽기 편하다
			// 알아서 먼저 버퍼로 읽고 한줄씩 잘라서 읽기때문에 버퍼로만 읽는 것보다 살짝 느리다
			String line;
		
			int cnt=0;
			while((line = bin.readLine()) != null) {
				System.out.println(line);
			}
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try { // 가장 최근에 열었던 순서대로 닫아줄 것
				bin.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		read4();
		System.out.println("\n걸린시간 : " + (System.currentTimeMillis() - start) + "ms");
		
	}
}
