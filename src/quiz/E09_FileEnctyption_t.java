package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileEnctyption_t {
	/*
	   # 시저 암호
	   
	    - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 치환하는 암호
	    - 키 값만큼 원문에서 오른쪽으로 이동하여 암호화 암호문에서 키값만큼 왼쪽으로 밀어주면 복호화
	    
	   # files/frankenstein.txt를 원하는 키 값으로 암호화한 파일을 frankenstein_encrypted.txt을 생성하기  
	    ( 알파벳만 암호화하고 그 외의 문자들은 모두 무시)
	    
	    대소문자 구분해서 한글자씩 
	      
	 */
	
	static class NotCaesarKeyException extends RuntimeException{ // 커스텀한 예외 처리
		public NotCaesarKeyException(String msg) {
			super(msg);
		}
	}
	
	
	final static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	final static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	//final static String CHARSET = UPPERCHARSET + LOWERCHARSET;
	public static String encryption(String str, int key) {
		StringBuilder builder = new StringBuilder();
		char[] chs = str.toCharArray();
		
		for(char ch : chs) {
			if(Character.isUpperCase(ch)) {
				int index = ch - 'A';
				builder.append(UPPERCASE[(index + key) % 26]);
			}else if(Character.isLowerCase(ch)) {
				int index = ch -'a';
				builder.append(LOWERCASE[(index + key) % 26]);
			}else {
				builder.append(ch);
			}
		}
		builder.append('\n');
		
		
		return builder.toString();
	}

	public static void encryptFile(File text, int key) { // frankenstein_encrypted.txt 만드는 메서드
		if(key < 0 || key > 26) {
			throw  new NotCaesarKeyException("Caesar key is 1 <= key < 26");
		}
		
		String[] path = text.getPath().split("\\.");
		path[0] = path[0] + "_encrypted";
		
		File crypto = new File(String.join(".", path));
		
		//System.out.println("암호문 경로 : " + crypto);
		FileReader fin = null;
		BufferedReader in = null;
		FileWriter fout = null;
		BufferedWriter out = null;
		
		try {
			fin = new FileReader(text);
			in = new BufferedReader(fin);
			fout = new FileWriter(crypto);
			out = new BufferedWriter(fout);
			
			String line;
			while((line = in.readLine()) != null) {
				out.write(encryption(line, key));
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
				fout.close();
				in.close();
				fin.close();
			}catch(IOException o) {}
			
		}
	}
	public static void main(String[] args) {
		//encryptFile(new File("files/frankenstein.txt"),20);
		
		String path = new File("files/frankenstein.txt").getPath();
	//	System.out.println(path);
	}
}
