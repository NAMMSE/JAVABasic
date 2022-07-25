package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E09_FileDecryption {

	/*
	  # 암호화 된 프랑켄.txt를 사용해 다음 구현
	  
	   1. 암호문 파일을 처음 10줄을 1 ~ 25까지의 키로 모두 복호화한 결과를 사용자에게 출력 
	   2. 사용자는 해당 결과를 보고 알맞은 키를 선택하여 복호화를 진행할 수 있음
	   3. 복호화 결과는 프랑캔_decrypted.txt에 저장
	 */
	
	//final static char[] UPPERCASE = "ZYXWVUTSRQPONMLKJIHGFEDCBA".toCharArray();
	final static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	final static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public static void decryption(String line, int i) {

		StringBuilder builder = new StringBuilder();
		char[] chs = line.toCharArray();
	
			for(char ch : chs) {
				//System.out.print(ch);
				if(Character.isUpperCase(ch)) {
					int index = ch - 'A';
					builder.append(UPPERCASE[(index + i) % 26]);
				}else if(Character.isLowerCase(ch)) {
					int index = ch -'a';
					builder.append(LOWERCASE[(index + i) % 26]);
				}else {
					builder.append(ch);
				//System.out.println("\n");
			}
		}
		System.out.println(builder.toString());

	}

	public static String decryption2(String line, int i) {

		StringBuilder builder = new StringBuilder();
		char[] chs = line.toCharArray();
	
			for(char ch : chs) {
				//System.out.print(ch);
				if(Character.isUpperCase(ch)) {
					int index = ch - 'A';
					builder.append(UPPERCASE[(index + i) % 26]);
				}else if(Character.isLowerCase(ch)) {
					int index = ch -'a';
					builder.append(LOWERCASE[(index + i) % 26]);
				}else {
					builder.append(ch);
				//System.out.println("\n");
			}
				
		}
			builder.append('\n');
		return builder.toString();

	}
	
	public static void decryption10(File text) {
		BufferedReader in;
		FileReader fin;
		FileWriter fout;
		BufferedWriter out;
		
		String[] path = text.getPath().split("_");
		path[0] = path[0] + "_decrypted";
		String[] path2 = path[1].split("\\.");
		
		//path[1] = path[1].split("\\.");
//		System.out.println(path[0]);
//		System.out.println(path[1]);
		File crypto = new File(String.join(".", path));
		
		
		try {
//			 fin = new FileReader(text);
//			 in = new BufferedReader(fin);

			 //String line;
			 
			 for(int j=1;j<26;j++) {
				 fin = new FileReader(text);
				 in = new BufferedReader(fin);
				 System.out.printf("키 값 : %d\n",j);
				 for(int i=0; i<10;i++) {
					 //line = in.readLine();
					 //System.out.println(line);
					 System.out.printf("%d번째 줄 결과 \n",i+1);
					 decryption(in.readLine(), j);
				 }
				 System.out.println("-----------------------------------");
			 }
			 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("키 값을 입력하세요 >>");
			 int key = sc.nextInt();
			 
			 fin = new FileReader(text);
			 in = new BufferedReader(fin);
			 fout = new FileWriter(crypto);
			 out = new BufferedWriter(fout);
				
			 String line;
			 while((line = in.readLine()) != null) {
				 out.write(decryption2(line, key));
			 }
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		decryption10(new File("files/frankenstein_encrypted.txt"));
	}
}
