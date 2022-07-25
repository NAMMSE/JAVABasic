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
	  files 폴더 내부의 모든 내용을
	  files_copy 폴더로 복사해보세요
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
//				if(Pattern.matches("\\w+[.]+\\w+", f[i])) { // 경로에서 파일명 자르고 확장자가 없으면 폴더이므로 파일과 폴더 구분하는 if문
//					copy(fileslist[i], test2[i]);
//				}
//				else {
//					File dir2 = new File("files_copy/",f[i]);
//					System.out.println(dir2.mkdir() ? "폴더 생성에 성공" : "폴더 생성에 실패"); 
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
//		// 1. 원본 File, 복사할 File 준비
////		File file = new File("D:\\example\\text_file.txt");
////		File newFile = new File("D:\\example\\new_text_file.txt");
//		// 2. FileInputStream, FileOutputStream 준비
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
//		// 3. 한번에 read하고, write할 사이즈 지정
//		byte[] buf = new byte[1024];
//		// 4. buf 사이즈만큼 input에서 데이터를 읽어서, output에 쓴다.
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
//			System.out.println(filesCopy.mkdir() ? "files_copy 생성에 성공" : "files_files_copy 생성에 실패"); 
//		}
//	}
}






















