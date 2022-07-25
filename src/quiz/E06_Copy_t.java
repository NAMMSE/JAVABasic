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
	 * 0520 �ݿ���
	  files ���� ������ ��� ������
	  files_copy ������ �����غ�����
	  �����ȿ� ���� ����� �������ϱ��� �ϳ� �־ �ϱ�
	 */
	
	// int depth;
	
	// �ؽ��� ������ �������� �ʴ� ���� : ���� files�� �����ϰ� �ٸ� ������ �� ������ ��� ���� ���� ����� ���� �ƴ϶� ���� copyMap�� ����ϴµ�
	// �̹� copyMap�ȿ� files�� ���� ������ �����ֱ⶧���̴�
	//HashMap<File, File> copyMap = new HashMap<>();// Ű : ���� ��ο� �ִ� ���� / �� : ������ ��ο� ���� ����
	
	public void copy(File src, File dst){ // ���� ���� ���� ������ ���� ����
		try {
			FileInputStream in = new FileInputStream(src); // FileWriter, FileReader�� ���ϱ��ѵ� 2����Ʈ�� �а� ���� ������ �������ϰ������ ó���Ҽ� ����
			FileOutputStream out = new FileOutputStream(dst);// ��ǲ�ƿ�ǲ ��Ʈ���� 1����Ʈ �����̹Ƿ� �������� ó���� �����ؼ� �̰� ���
			
			byte[] buffer = new byte[1024]; // ����Ʈ 1024�� �����ϴ� ������ ���� ���� ���� �׸� ������ ũ�Ⱑ 20������Ʈ�� �װ� 1024���� ��� �ű�°�
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
		
		int sep = path.indexOf('\\'); // files�� ����߿��� \�� ó������ ������ �ε��� ���ϱ�
		
		String before = path.substring(0, sep) + "_copy"; // ������� �������� files_copy�̹Ƿ�  0������ files���� �ڸ��� _copy ���̱�
		String after = path.substring(sep);// ù \�������δ� �״�� files_copy�� �����ؾ��ϹǷ� �״�� ����
		
		return new File(before + after); // ���������� ���� ���ڿ��� ��η� �ϴ� ������ ����
	}
	//======================
	
	void addAllPathToMap(Map<File, File> map, File dir) { // HashMap�̳� �׳� Map�̳� ���̰� ����
		for(File f : dir.listFiles()) {
			if(f.isDirectory()) {
				addAllPathToMap(map, f); // ���⼭ ��ͷ� �����ȿ� �����ȿ� ���̻� ������ ���������� ������
			}else if(f.isFile()) {
				map.put(f, getCopyPath(f)); // files_copy�� ����� �ű⿡ ������ ��ε��� ����ִ� �� �ʿ� ����
			}
		}
	}
	
	public HashMap<File, File> findAllPath(File dir) { // files�� �ִ� ��� ���丮�� ���ϵ��� ��θ� Ȯ���ϴ� �޼���
		HashMap<File, File> copyMap = new HashMap<>(); // Ű : ���� ��ο� �ִ� ���� / �� : ������ ��ο� ���� ���� / �ؽ����� ���⼭ ����
		if(!dir.isDirectory()) {
			System.out.println("���丮�� Ž���� �� �ֽ��ϴ�");
			return null;
		}
//				System.out.println("ã�� ���� : "+f);
//				System.out.println("���� ��� : "+getCopyPath(f));
//				// �̷����ϸ� files ���ο� filesflower ���� ������ ���� ��� files_copyflower�� �ż� ���� �ȵ�
//				//System.out.println("���� ��� : "+f.getPath().replace("files", "files_copy")); 
				
		addAllPathToMap(copyMap, dir); // ������ findAllPath �޼��� �ȿ� ��� ���� ���ȴµ� �ؽ��� ���������� ���Ϸ��� ���� �� �޼��带 ����
		
		return copyMap;
	}
	//======================
	
	public void copyAll(File dir) { // ã�� ���ϵ��� �����ϴ� �޼���
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
//		File dst = new File(dir, "rps.log"); // ���, ����
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


//	public void copyAll(String srcDir) { // ����Լ� ���� ��ߵ� �����ȿ� �����ȿ� 
//		String copyDir;
//		if(depth==0) {
//			copyDir = srcDir+"_copy";
//		}else
//			copyDir = srcDir;
//		depth++;
//		
//		File src = new File(srcDir);
//		File dst = new File(copyDir);
//		// �ش� ���� ������ ��� ���� �� ���丮 ����� ���ڿ��迭�� ��ȯ�Ѵ�
//		if(!dst.exists()) {
//			dst.mkdir();
//		}
//		// list() : �ش� ���� ������ ��� ���� �� ���丮 ����� ���ڿ� �迭�� ��ȯ�Ѵ�
//		// listFile() : �ش� ���� ������ ��� ���� �� ���丮 ����� ���� �迭�� ��ȯ�Ѵ�
//		for(String path : src.list()) {
//			File innerFile = new File(src, path);
//			File copyPath = new File(dst, path);
//			
//			if(innerFile.isDirectory()) {
//				//copyAll(innerFile.getPath());
//				System.out.println(innerFile + "�� ���丮 �Դϴ�"+innerFile.getPath());
////				System.out.println("���� ��δ� "+copyPath);
////			
//			}else {
//				copy(innerFile, copyPath);
//				System.out.println(innerFile + "�� " + copyPath + "�� ����Ǿ����ϴ�.");
//			}
//
//
//			
//		}
//		
//	}