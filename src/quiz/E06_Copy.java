package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class E06_Copy {

	/*
	  files ���� ������ ��� ������
	  files_copy ������ �����غ�����
	 */
//	public static void main(String[] args) {
//		
//		File files = new File("files");
//		File[] fileslist = files.listFiles();
//		String[] f = files.list();
//		
//		System.out.println(Arrays.toString(f));
//				
//		File filesCopy = new File("D:\\javaAWS(psh)\\workspace\\javabasic\\files_copy");
//		// System.out.println(filesCopy.exists()); 
//		makedir(filesCopy);
//	
//
//		File[] test2 = new File[f.length];
//		for(int i=0;i<f.length;i++) {
//			test2[i] = new File("files_copy/",f[i]);
//			try {
//				if(Pattern.matches("\\w+[.]+\\w+", f[i])) { // ��ο��� ���ϸ� �ڸ��� Ȯ���ڰ� ������ �����̹Ƿ� ���ϰ� ���� �����ϴ� if��
//					copy(fileslist[i], test2[i]);
//				}
//				else {
//					File dir2 = new File("files_copy/",f[i]);
//					System.out.println(dir2.mkdir() ? "���� ������ ����" : "���� ������ ����"); 
//				}
//				System.out.println(test2[i].getAbsolutePath());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			//System.out.println(test2.getAbsolutePath());
//		}
//
//	}
//	
//	public static void copy(File file, File newFile) {
//		// 1. ���� File, ������ File �غ�
////		File file = new File("D:\\example\\text_file.txt");
////		File newFile = new File("D:\\example\\new_text_file.txt");
//		// 2. FileInputStream, FileOutputStream �غ�
//		FileInputStream input;
//		try {
//			input = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		FileOutputStream output;
//		try {
//			output = new FileOutputStream(newFile);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// 3. �ѹ��� read�ϰ�, write�� ������ ����
//		byte[] buf = new byte[1024];
//		// 4. buf �����ŭ input���� �����͸� �о, output�� ����.
//		int readData;
//		try {
//			while ((readData = input.read(buf)) > 0) {
//			output.write(buf, 0, readData);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// 5. Stream close
//		input.close();
//		output.close();
//		}
//	
//	public static void makedir(File filesCopy) {
//		if(!filesCopy.exists()) {
//			System.out.println(filesCopy.mkdir() ? "files_copy ������ ����" : "files_files_copy ������ ����"); 
//		}
//	}
}






















