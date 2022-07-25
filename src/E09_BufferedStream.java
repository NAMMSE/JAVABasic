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
	 
	  # Buffer (�����͸� �ѹ��� ��ƵѼ� �ִ� ���)
	  
	   - �����͸� �Ѱ��� ������ �����ϴ� �ͺ��� ��Ƽ� �Ѳ����� �����ϴ� ����� �ξ� ó���ӵ��� ������
	   - ���۰� �̸� ������ ��Ʈ�� Ŭ�������� �տ� Buffered��� �̸��� �پ��ִ�
	   - BufferedInputStream, BufferedReader....
	 */
	
	static File book = new File("files/frankenstein.txt");
	
	
	/** �� ���ھ� �б�*/
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
	
	/** ���� ������� �б� (1024) */
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
	
	/** ���� ������� �б� (1024) */
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
	
	
	/** ���� ������� �б� (2048) */
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
	
	//BufferedReader ���
	public static void read4() {
		//BufferedReader in = new BufferedReader(new FileReader(book)); 
		FileReader fin = null;
		BufferedReader bin =null;
		
		try {
			fin = new FileReader(book);
			bin = new BufferedReader(fin);
			
			//BufferedReader���� readLine() �޼��尡 �־ �� �پ� �б� ���ϴ�
			// �˾Ƽ� ���� ���۷� �а� ���پ� �߶� �б⶧���� ���۷θ� �д� �ͺ��� ��¦ ������
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
			try { // ���� �ֱٿ� ������ ������� �ݾ��� ��
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
		System.out.println("\n�ɸ��ð� : " + (System.currentTimeMillis() - start) + "ms");
		
	}
}
