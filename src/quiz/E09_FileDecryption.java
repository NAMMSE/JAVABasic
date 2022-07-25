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
	  # ��ȣȭ �� ������.txt�� ����� ���� ����
	  
	   1. ��ȣ�� ������ ó�� 10���� 1 ~ 25������ Ű�� ��� ��ȣȭ�� ����� ����ڿ��� ��� 
	   2. ����ڴ� �ش� ����� ���� �˸��� Ű�� �����Ͽ� ��ȣȭ�� ������ �� ����
	   3. ��ȣȭ ����� ����ĵ_decrypted.txt�� ����
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
				 System.out.printf("Ű �� : %d\n",j);
				 for(int i=0; i<10;i++) {
					 //line = in.readLine();
					 //System.out.println(line);
					 System.out.printf("%d��° �� ��� \n",i+1);
					 decryption(in.readLine(), j);
				 }
				 System.out.println("-----------------------------------");
			 }
			 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("Ű ���� �Է��ϼ��� >>");
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
