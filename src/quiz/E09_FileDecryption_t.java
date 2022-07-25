package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class E09_FileDecryption_t {
	final static String ALPHABET ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final static char[] UPPERCASE = ALPHABET.toCharArray();
	final static char[] LOWERCASE = ALPHABET.toLowerCase().toCharArray();
	
	File crypto;
	int sampleLength =10;
	
	public E09_FileDecryption_t(File crypto) {
		this.crypto = crypto;
	}
	
	public E09_FileDecryption_t(File crypto, int sampleLength) {
		this.crypto = crypto;
		this.sampleLength = sampleLength;
	
	}
	
	public String decrypt(String str, int key) {
		StringBuilder builder = new StringBuilder();
		char[] chs = str.toCharArray();
		for(char ch : chs) {
			if(Character.isUpperCase(ch)) {
				int index = ch - 'A';
				builder.append(UPPERCASE[index - key < 0 ? 26+(index-key) : index -key]);
			}else if(Character.isLowerCase(ch)) {
				int index = ch - 'a';
				builder.append(LOWERCASE[index - key < 0 ? 26+(index-key) : index -key]);
			}else {
				builder.append(ch);
			}
		}
		return builder.toString();
	}
	
	public void sample() {
		StringBuilder samplebuilder = new StringBuilder();
		
		// AutoClose 인터페이스가 구현된 클래스들은 try()문을 사용할 수 있다
		// try 옆의 ()에 선언한 객체들은 try문이 끝나면서 자동으로 close()를 실행한다
		try(
				FileReader fin = new FileReader(crypto);
				BufferedReader in = new BufferedReader(fin);
				) {
			for(int i=0; i<10;i++) {
				samplebuilder.append(in.readLine()+ '\n');
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	
		for(int key = 1;key<26;key++) {
			System.out.printf("[key %d]\n\n",key);
			System.out.println(decrypt(samplebuilder.toString(), key));
		}
	}
	
	public void bruteForce() {
		// 10줄씩 보여주기
		sample();
		
		// 골라서 파일 생성하기(bufferedReader를 이용해 콘솔로부터 입력받기)
		// InputStreamReader : byte단위인 inputstream을 char단위인 Reader로 재포장 해주는 클래스
		try(    
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr);
		){
			
			while(true) {
				try {
					System.out.print("원하시는 key 입력>>");
					String userInput = in.readLine();
					int key = Integer.parseInt(userInput);
					execute(key);
					
					break;
				}catch(NumberFormatException o){
					System.out.println("plz input integer number");
				}
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void execute(int key) {
		String[] path = crypto.getPath().split("\\.");
		path[0] = path[0] + "_decrypted";
		
		File decryptFile = new File(String.join(".", path));
		
		try(
				FileReader fin = new FileReader(crypto);
				BufferedReader in =new BufferedReader(fin);
				FileWriter fou = new FileWriter(decryptFile);
				BufferedWriter bout = new BufferedWriter(fou);
				PrintWriter out = new PrintWriter(bout); // 버퍼라이터로 쓰면 느리기 때문에 프린트 라이터 사용
				){
			String line;
			while((line = in.readLine())!=null) {
				//out.write(decrypt(line,key) + '\n');
				// 원래 프린트ln은 시스템에서만 썼지만 프린트 라이트 클래스를 사용하면 메모에다가 출력을 할 수 있다
				out.println(decrypt(line, key)); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//bruteForce(new File("files/frankenstein_encrypted.txt"));
		E09_FileDecryption_t decryption = new E09_FileDecryption_t(new File("files/frankenstein_encrypted.txt"));
		
		decryption.bruteForce();
	}
}
