package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class E06_Copy_t {
	/*
	 * 0520 금요일
	  files 폴더 내부의 모든 내용을
	  files_copy 폴더로 복사해보세요
	  폴더안에 폴더 만들고 사진파일까지 하나 넣어서 하기
	 */
	
	// int depth;
	
	// 해쉬맵 전역에 설정하지 않는 이유 : 만약 files를 복사하고 다른 폴더를 또 복사할 경우 새로 맵을 만드는 것이 아니라 기존 copyMap을 사용하는데
	// 이미 copyMap안에 files에 대한 정보가 남아있기때문이다
	//HashMap<File, File> copyMap = new HashMap<>();// 키 : 원래 경로에 있는 파일 / 값 : 복사할 경로에 있을 파일
	
	public void copy(File src, File dst){ // 파일 내용 복사 사진은 사진 복사
		try {
			FileInputStream in = new FileInputStream(src); // FileWriter, FileReader가 편하긴한데 2바이트씩 읽고 쓰기 때문에 사진파일같은경우 처리할수 없다
			FileOutputStream out = new FileOutputStream(dst);// 인풋아웃풋 스트림은 1바이트 단위이므로 사진까지 처리가 가능해서 이걸 사용
			
			byte[] buffer = new byte[1024]; // 바이트 1024로 설정하는 이유는 딱히 없고 만약 그림 파일의 크기가 20만바이트면 그걸 1024개씩 계속 옮기는것
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
	//=====================

	public File getCopyPath(File src) {
		String path = src.getPath();
		
		int sep = path.indexOf('\\'); // files의 경로중에서 \가 처음으로 나오는 인덱스 구하기
		
		String before = path.substring(0, sep) + "_copy"; // 만드려는 폴더명이 files_copy이므로  0번부터 files까지 자르고 _copy 붙이기
		String after = path.substring(sep);// 첫 \다음으로는 그대로 files_copy에 복사해야하므로 그대로 저장
		
		return new File(before + after); // 비포애프터 합한 문자열을 경로로 하는 파일을 리턴
	}
	//======================
	
	void addAllPathToMap(Map<File, File> map, File dir) { // HashMap이나 그냥 Map이나 차이가 없다
		for(File f : dir.listFiles()) {
			if(f.isDirectory()) {
				addAllPathToMap(map, f); // 여기서 재귀로 폴더안에 폴더안에 더이상 폴더가 없을때까지 돌린다
			}else if(f.isFile()) {
				map.put(f, getCopyPath(f)); // files_copy를 만들고 거기에 복사한 경로들을 비어있는 새 맵에 저장
			}
		}
	}
	
	public HashMap<File, File> findAllPath(File dir) { // files에 있는 모든 디렉토리와 파일들의 경로를 확인하는 메서드
		HashMap<File, File> copyMap = new HashMap<>(); // 키 : 원래 경로에 있는 파일 / 값 : 복사할 경로에 있을 파일 / 해쉬맵을 여기서 선언
		if(!dir.isDirectory()) {
			System.out.println("디렉토리만 탐색할 수 있습니다");
			return null;
		}
//				System.out.println("찾은 파일 : "+f);
//				System.out.println("복사 경로 : "+getCopyPath(f));
//				// 이렇게하면 files 내부에 filesflower 같은 폴더가 있을 경우 files_copyflower가 돼서 쓰면 안됨
//				//System.out.println("복사 경로 : "+f.getPath().replace("files", "files_copy")); 
				
		addAllPathToMap(copyMap, dir); // 원래는 findAllPath 메서드 안에 재귀 포문 돌렸는데 해쉬맵 전역변수로 안하려고 따로 이 메서드를 만듬
		
		return copyMap;
	}
	//======================
	
	public void copyAll(File dir) { // 찾은 파일들을 복사하는 메서드
		HashMap<File, File> foundMap = findAllPath(dir);
		
		for(File src : foundMap.keySet()) {
			File dst = foundMap.get(src);
			
			if(!dst.getParentFile().exists()) {
				dst.getParentFile().mkdirs();
			}
			copy(src, dst);
		}
	}
	
	public static void main(String[] args) {
	
		E06_Copy_t copy = new E06_Copy_t();
		copy.copyAll(new File("files"));
	}
}
		

















































//		File src = new File("files/rps.log");
//		File dir = new File("files_copy");
//		File dst = new File(dir, "rps.log"); // 경로, 파일
//		
//		System.out.println(dst);
//		System.out.println(dst.getAbsolutePath());
//		
//		if(!dir.exists()) {
//			dir.mkdir();
//		}
//		
//		copy("files /rps.log", "files_copy/rps.log");
// 	}
//}


//	public void copyAll(String srcDir) { // 재귀함수 개념 써야됨 폴더안에 폴더안에 
//		String copyDir;
//		if(depth==0) {
//			copyDir = srcDir+"_copy";
//		}else
//			copyDir = srcDir;
//		depth++;
//		
//		File src = new File(srcDir);
//		File dst = new File(copyDir);
//		// 해당 파일 내부의 모든 파일 및 디렉토리 목록을 문자열배열로 반환한다
//		if(!dst.exists()) {
//			dst.mkdir();
//		}
//		// list() : 해당 파일 내부의 모든 파일 및 디렉토리 목록을 문자열 배열로 반환한다
//		// listFile() : 해당 파일 내부의 모든 파일 및 디렉토리 목록을 파일 배열로 반환한다
//		for(String path : src.list()) {
//			File innerFile = new File(src, path);
//			File copyPath = new File(dst, path);
//			
//			if(innerFile.isDirectory()) {
//				//copyAll(innerFile.getPath());
//				System.out.println(innerFile + "은 디렉토리 입니다"+innerFile.getPath());
////				System.out.println("복사 경로는 "+copyPath);
////			
//			}else {
//				copy(innerFile, copyPath);
//				System.out.println(innerFile + "은 " + copyPath + "로 복사되었습니다.");
//			}
//
//
//			
//		}
//		
//	}