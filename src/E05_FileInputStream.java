import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class E05_FileInputStream {

	public static void main(String[] args) {
		
		// ���Ϸκ��� �����͸� �о���̴� ���
		
		//FileInputStream in = new FileInputStream("files/abc.txt"); // �̰� ���� ġ�� �����߸� �ι�° �ذ��� ������
		try {
			File f = new File("files/abc.txt");
			FileInputStream in = new FileInputStream(f);
			//FileInputStream in = new FileInputStream("files/abc.txt"); // ù�� ���� OT ���� files�� �����ϱ�
			
			// read() : �����͸� 1byte�� �о��ִ� �޼��� 
				 	  //�� ����Ʈ�� �б� ������ �ѱ� ���� 2����Ʈ ���ڷ� ���� ��ġ�Ⱑ ��ƴ�
			int ch;
			while((ch=in.read())!= -1) {
				System.out.print((char)ch);
			}
			
			System.out.println("======");
			// read(byte[]) : ������ byte[]�� �����͸� ����ش�. ���� ���̸� ��ȯ�Ѵ�.
			// 				  ������ ������ ��� ������ -1�� ��ȯ�Ѵ�
			byte[] buffer = new byte[10]; // �޸��� ������ ����Ʈ�� 10�� ������ �о���̱� ���� 10��¥�� �迭�� �ʱ�ȭ 
			int len; 
			while((len=in.read(buffer))!= -1){
				System.out.println(Arrays.toString(buffer)+"�̹��� ���� ����Ʈ ����: "+len); // abc �޸��峻�� abcdefghijklmnop�� ���������� ���ڷ� ǥ��
				// �ؿ� �� �����ϸ� 10�������� �о���̴µ� ���� �޸��� ������ 16�����̸� �տ� 10���ڴ� �迭�� �����ϰ� �ڿ� 6���ڴ� ���� �迭�� �տ������� �ٽ� ä�� �ֱ� ������ �ڿ� ���� 4�ڸ����� �տ� �����ߴ� �ڿ� 4�ڸ��� �״�� �����ִ�
				//System.out.print(new String(buffer)); 
				// �� ������ �ذ����ִ°� �ؿ��ִ� �����ε��̴�
				//System.out.print(new String(buffer, 0, len));
			}
			
			
			// readAllBytes() : �ѹ��� ������ ��� �����͸� byte[]�� �д´�
			byte[] allBytes = in.readAllBytes(); // �̰͵� �����ߴµ� �ι�° �ַ�� ������
			// byte ������ �������� �ִ� ���ڿ��� ��ĥ �� charSet���� �ٸ� ������� ��ģ��.
			// �� �������� ���ڰ� ���� �� �ִ�
			String fileDataStr = new String(allBytes, Charset.forName("UTF-8")); // �޸����� byte������ �ɰ��ٰ� �ٽ� ��ĥ�� �޸����� �԰�(�޸��� �����ϴ� UTF-8)�� �ٽ� ���ľ� ���������� ������ ��µȴ� 
			System.out.println(fileDataStr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
