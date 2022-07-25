import java.io.File;

public class E06_File {

	/*
	  # java.io.File
	  
	   - ���� �ý��ۿ� ����� ���� �Ǵ� ���丮�� ������ ���� �� �ִ� Ŭ����(���� �ý��� : �ϵ带 ȿ�������� �ٷ� �� �ִ� ��)
	   - �ν��Ͻ��� ����ִ� ������ �������� ���� �ý����� ���� ������ �� �ִ�
	   - 
	   
	 */
	
	public static void main(String[] args) {
		File f1 = new File("files");
		File f2 = new File("files/abc.txt");
		File f3 = new File("notExistFile.abcd"); // �������� �ʴ� ���ϵ� ���� ��ü�� ���� �� �ִ�
		
		System.out.println("f1�� ���� ���: "+f1.getAbsolutePath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f3.getAbsolutePath()); // �������� �ʴ� ���ϵ� ��ΰ� ���´�
		
		// canRead(), canWrite(), canExecute() : �ش� ������ ���� Ȯ�� �޼���
		System.out.println(f1.canRead());
		System.out.println(f2.canRead());
		System.out.println(f3.canRead()); // ���������ʴ� ������ ���� ���� �����Ƿ� false
		
		// �ش� ��ΰ� ���� ������� Ȯ���ϴ� �޼���
		File f4 = new File("D:\\javaAWS(psh)\\workspace\\javabasic\\files"); // files�� ������
		
		System.out.println("���� ��δ�? "+ f1.isAbsolute());
		System.out.println("���� ��δ�? "+ f4.isAbsolute());
		
		// ���丮, ����, ���� ���� Ȯ�� �޼���
		System.out.println("f1�� ���丮(����)��? "+ f1.isDirectory());
		System.out.println("f1�� �����ΰ���?? "+ f1.isFile());
		System.out.println("f2�� �����ΰ���?? "+ f2.isFile());
		System.out.println("f3�� �����ΰ���?? "+ f3.isFile());
		System.out.println("f4�� �����ΰ���?? "+ f4.isFile());
		
		System.out.println("f1�� �����ϴ�?? "+ f1.exists());
		System.out.println("f3�� �����ϴ�?? "+ f3.exists());
		
		// mkdir() : �ش� ��θ� ���� ���丮�� ���� �����ϴ� �޼��� (���� ���丮�� �������� ������ ���� �Ұ���)
		File dir1 = new File("files2");
		
		// ���丮�� ����µ� �����ϸ� true �����ϸ� false
		// �����ϸ� javabasic�� ������ ������ ó�������ϸ� �����̶� �߰� �������� �̹� ������ �ֱ⶧���� ���з� ���
		System.out.println(dir1.mkdir() ? "files2 ������ ����" : "files2 ������ ����"); 
		
		File dir2 = new File("test/test/dir2");
		// ���� ���丮(test, test)�� ���������ʱ⋚���� false��ȯ
		System.out.println(dir2.mkdir() ? "files2 ������ ����" : "files2 ������ ����");
		
		//mkdirs() : ���� ���丮�� �������� �ʾƵ� ��λ� ��� �θ� ���丮�� ����
		// ���� ���丮���� ����鼭 true ��ȯ
		System.out.println(dir2.mkdirs() ? "files2 ������ ����" : "files2 ������ ����");
	}
}
