import java.io.File;

public class E06_File {

	/*
	  # java.io.File
	  
	   - 파일 시스템에 저장된 파일 또는 디렉토리의 정보를 담을 수 있는 클래스(파일 시스템 : 하드를 효율적으로 다룰 수 있는 것)
	   - 인스턴스에 담겨있는 정보를 바탕으로 파일 시스템을 직접 수정할 수 있다
	   - 
	   
	 */
	
	public static void main(String[] args) {
		File f1 = new File("files");
		File f2 = new File("files/abc.txt");
		File f3 = new File("notExistFile.abcd"); // 존재하지 않는 파일도 파일 객체로 만둘 수 있다
		
		System.out.println("f1의 절대 경로: "+f1.getAbsolutePath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f3.getAbsolutePath()); // 존재하지 않는 파일도 경로가 나온다
		
		// canRead(), canWrite(), canExecute() : 해당 파일의 권한 확인 메서드
		System.out.println(f1.canRead());
		System.out.println(f2.canRead());
		System.out.println(f3.canRead()); // 존재하지않는 파일은 읽을 수가 없으므로 false
		
		// 해당 경로가 절대 경로인지 확인하는 메서드
		File f4 = new File("D:\\javaAWS(psh)\\workspace\\javabasic\\files"); // files의 절대경로
		
		System.out.println("절대 경로니? "+ f1.isAbsolute());
		System.out.println("절대 경로니? "+ f4.isAbsolute());
		
		// 디렉토리, 파일, 존재 여부 확인 메서드
		System.out.println("f1은 디렉토리(폴더)니? "+ f1.isDirectory());
		System.out.println("f1은 파일인가요?? "+ f1.isFile());
		System.out.println("f2은 파일인가요?? "+ f2.isFile());
		System.out.println("f3은 파일인가요?? "+ f3.isFile());
		System.out.println("f4은 파일인가요?? "+ f4.isFile());
		
		System.out.println("f1은 존재하니?? "+ f1.exists());
		System.out.println("f3은 존재하니?? "+ f3.exists());
		
		// mkdir() : 해당 경로를 가진 디렉토리를 새로 생성하는 메서드 (상위 디렉토리가 존재하지 않으면 생성 불가능)
		File dir1 = new File("files2");
		
		// 디렉토리를 만드는데 성공하면 true 실패하면 false
		// 실행하면 javabasic에 폴더가 생성됨 처음실행하면 성공이라 뜨고 다음부턴 이미 폴더가 있기때문에 실패로 뜬다
		System.out.println(dir1.mkdir() ? "files2 생성에 성공" : "files2 생성에 실패"); 
		
		File dir2 = new File("test/test/dir2");
		// 상위 디렉토리(test, test)가 존재하지않기떄문에 false반환
		System.out.println(dir2.mkdir() ? "files2 생성에 성공" : "files2 생성에 실패");
		
		//mkdirs() : 상위 디렉토리가 존재하지 않아도 경로상 모든 부모 디렉토리를 생성
		// 상위 디렉토리까지 만들면서 true 반환
		System.out.println(dir2.mkdirs() ? "files2 생성에 성공" : "files2 생성에 실패");
	}
}
