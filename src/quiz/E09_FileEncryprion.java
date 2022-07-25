package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class E09_FileEncryprion {

	/*
	   # 시저 암호
	   
	    - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 치환하는 암호
	    - 키 값만큼 원문에서 오른쪽으로 이동하여 암호화 암호문에서 키값만큼 왼쪽으로 밀어주면 복호화
	    
	   # files/frankenstein.txt를 원하는 키 값으로 암호화한 파일을 frankenstein_encrypted.txt을 생성하기  
	    ( 알파벳만 암호화하고 그 외의 문자들은 모두 무시)
	    
	    대소문자 구분해서 한글자씩 
	      
	 */
	static File book = new File("files/frankenstein.txt");
	
	/** 버퍼 방식으로 읽기 (1024) */
	public static void read2() {
		FileInputStream in = null;
		try {
			in = new FileInputStream(book);
			
			//byte[] buffer = new byte[1024];
			int ch;
			
			while((ch = in.read()) != -1){
				//System.out.println(new String(buffer, 0, ch));
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
	
	
	public void copy(File src, File dst){ // 파일 내용 복사 한 글자씩
		try {
			FileInputStream in = new FileInputStream(src); 
			FileOutputStream out = new FileOutputStream(dst);
			
			byte[] buffer = new byte[1024]; 
			int len;
			while((len = in.read(buffer))!=-1){
				out.write(buffer,0,len);
			}
			
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void read() {
		FileReader fin = null;
		BufferedReader bin =null;
		ArrayList<String> lineList = new ArrayList<>();
		try {
			fin = new FileReader(book);
			bin = new BufferedReader(fin);
			
			String line;
			while((line = bin.readLine()) != null) { // 텍스트를 라인리스트에 저장
				lineList.add(line);
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
		
//		for(int i=0;i<lineList.size();i++) { 
//			System.out.println(lineList.get(i));
//			System.out.println("111");
//		}
		encryption(lineList);
	}
	
	
	
	public static ArrayList<String> encryption(ArrayList<String> list) {
		//System.out.println((list.get(0).toCharArray())[0]);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("키 값을 입력하세요 >>");
//		int key = sc.nextInt();
		
		int key=3;
		
		for(int i=0, j=0;i<list.get(j).length();i++) {
			if((list.get(j).charAt(i))<='Z'&&(list.get(j).charAt(i))>='A') {
				if((list.get(j).charAt(i))+key>'Z') {
					(list.get(j).toCharArray())[i]=(char)((list.get(j).charAt(i))+key-26);
				}
				list.get(j).toCharArray()[i] = (char)(list.get(j).toCharArray()[i]+key);
				System.out.print(list.get(j).toCharArray()[i]);
			}
			
			else if((list.get(j).charAt(i))<='z'&&(list.get(j).charAt(i))>='a') {
				if((list.get(j).charAt(i))+key>'z') {
					(list.get(j).toCharArray())[i]=(char)((list.get(j).toCharArray())[i]+key-26);
				}
				list.get(j).toCharArray()[i]+=(char)key;
				System.out.print((list.get(j).toCharArray())[i]);
			}
			
			//System.out.println((list.get(0)));
		}
	
		
		System.out.println((list.get(0).toCharArray())[0]+key +"" + 'Z');
		
		return list;
	}
	
	
	public static void main(String[] args) {
		read();
	}
}
