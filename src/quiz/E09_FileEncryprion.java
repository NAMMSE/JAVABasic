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
	   # ���� ��ȣ
	   
	    - ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� ġȯ�ϴ� ��ȣ
	    - Ű ����ŭ �������� ���������� �̵��Ͽ� ��ȣȭ ��ȣ������ Ű����ŭ �������� �о��ָ� ��ȣȭ
	    
	   # files/frankenstein.txt�� ���ϴ� Ű ������ ��ȣȭ�� ������ frankenstein_encrypted.txt�� �����ϱ�  
	    ( ���ĺ��� ��ȣȭ�ϰ� �� ���� ���ڵ��� ��� ����)
	    
	    ��ҹ��� �����ؼ� �ѱ��ھ� 
	      
	 */
	static File book = new File("files/frankenstein.txt");
	
	/** ���� ������� �б� (1024) */
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
	
	
	public void copy(File src, File dst){ // ���� ���� ���� �� ���ھ�
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
			while((line = bin.readLine()) != null) { // �ؽ�Ʈ�� ���θ���Ʈ�� ����
				lineList.add(line);
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
		
//		for(int i=0;i<lineList.size();i++) { 
//			System.out.println(lineList.get(i));
//			System.out.println("111");
//		}
		encryption(lineList);
	}
	
	
	
	public static ArrayList<String> encryption(ArrayList<String> list) {
		//System.out.println((list.get(0).toCharArray())[0]);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Ű ���� �Է��ϼ��� >>");
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
