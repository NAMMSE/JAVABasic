import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E04_JavaIO {

	/*0518 ������
	  �̰� ���� �̰� ���� ���� E01 02 03 ����
	  # Java I/O (Input/Output)
	  
	   - �ڹٴ� ��Ʈ���̶�� ������ �̿��� ���α׷��� ��/����� �ٷ��
	   - ���α׷����� ������ ��� �����͵��� �Է�(Input)�̶�� �θ���
	   - ���α׷����� ���Ǿ� ������ ��� �����͵��� ���(Output)�̶�� �θ���
	   
	   
	  # Stream
	  
	   - �����͵��� ������ ���
	   - �����͵��� ���α׷����� ������ ��θ� InputStream�̶�� �θ���
	   - �����͵��� ���α׷����� �������� ������ ��θ� OutputStream�̶�� �θ���
	   - �����Ͱ� Stream�� �������� ���ؼ��� �ش� �����͸� byteŸ������ ��ȯ���Ѿ��Ѵ�
	     (�����͸� �ڵ����� byteŸ������ �������ִ� Ŭ�����鵵 �ִ�)
	 */
	
	public static void main(String[] args) {
		//FileOutputStream out = new FileOutputStream("files/abc.txt"); //�̷��� ������ �ݵ�� ó��������ϴ� ���ܰ��ִ� (f2������ �ι��� �ذ��� ������ �ڵ����� try catch�� ����)
		try { // ���� ���� �ι�° �ذ��� ������ ����� try��
			FileOutputStream out = new FileOutputStream("files/abc.txt"); // �̰� �����Ϸ��� javabasic�� ���콺 ��Ŭ�� new -folder �����ؾ� txt���� �������
			
			out.write(65); // �� �޼��嵵 �ݵ�� ó��������ϴ� ���ܰ� �־ ���� �޽��� 4���� 2��°�� ���������
			out.write(66); // 
			out.write(67);
			out.write('\n');
			
			// str.getBytes() : �ش� ���ڿ��� ���ۿ� ����Ʈ �迭�� ��ȯ�ϴ� �޼���
			out.write("�ȳ��ϼ��� �ݰ����ϴ�!!!!!".getBytes());
			
			// �� �� ��δ� �ݵ�� �ݾ���� �Ѵ�( ���α׷� ������ ���� �ݾƾ����� �������� ���Ѵ�)
			// �ڹٴ� ���� �̰� �˾Ƽ� �ݾ��ִµ� ��Ʈ���� ����Ҷ��� �������� ������ �ݾ�����Ѵ� 
			out.close();
			
		} catch (FileNotFoundException e) {// FileOutputStream ���� �ذᴩ���� ����� catch��
			e.printStackTrace();
		} catch (IOException e) {// 30������ ���� �ذ� ������ ������ catch��
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�");
		
	}
}
