import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_Exception {

	/*
	  # ���� (Exception)
	  
	   - �츮�� ������� �����ߴ� ���� �۾����� ���ܶ�� �θ���
	   - �ڹ��� ������ Ʋ���� ���� ���ܰ� �ƴ϶� ������ ����(�ڹ� ���� ����)��� �θ���
	   - ���α׷��Ӵ� �߻��� ���ܸ� �̸� �����ϰ� ����� �� �� �ִ�(����ó��)
	   - ���� �߻� �� �⺻ ������ ���α׷��� ���� �����̴� ( �⺻������ ���������� ���̹Ƿ� �������� ���� �ʰ� ���α׷��� �����ϴ� ���� ����ó��)
	   
	  # ���� ó��
	  
	   - ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��
	   - try�� ���ο��� ���ܰ� �߻����� ������ ��� ���� ����ȴ�
	   - try�� ���ο��� ���ܰ� �߻��ϸ� ��� try���� ������ �ߴ��ϰ� �߻��� ���ܿ� �ش��ϴ� catch������ 
	   - catch���� ������ �� �� �ִ�
	   - ���� �߻��� catch������ �߻��� ���ܿ� ���� �ڼ��� ������ ����ִ� �ν��Ͻ��� ���޵ȴ�
	     (catch(Exception e) ��� �� �� e�� ���ϴ� ��)
	   
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		// arr[10] = 123; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:  ���� ������ ��
		
		try {
			//arr[10] = 123;
			arr[0] = 1;
			arr[12] = 100; // ���⼭ ���ܰ� �߻��Ǹ� ���� ���� ������ϰ� ��� ĳġ������ �Ѿ�� 
			arr[1] = 3;
			System.out.println("try�� ���� �Ϸ�!");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭 �ε��� ������ ������ϴ�.");
		}
		System.out.println(Arrays.toString(arr)); // try������ 0��°�� 1�ְ� �� ���� ����ó�� �߻������Ƿ� �������� �� 0���� �ʱ�ȭ
		System.out.println("hello");
		
		//-------------------------------------------------//
		
		//����ó���� ��ĳ�� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int num; // try������ �ʱ�ȭ�ϸ� try�� �ۿ��� ����� �� ������ �߻��ϴ� ���� �ʱ�ȭ ���ִ� ���� ����
		try {// ���� �Է��ϴ� ���α׷����� ���ڸ� �Է����� �ʾ�����
			System.out.print("�ݵ�� ���ڸ� �Է��ϼ��� >>");
			num = sc.nextInt();
			num = 10/ num;
			
		
		}
		catch(InputMismatchException e) { // int���� ���ڸ� �־������� ����
			System.out.println("�ݵ�� ���ڸ� �Է��϶�� �����ٵ�");
			
			// ��� ������ �߻��ߴ��� �����غ� �� �ִ� �޼���
			e.printStackTrace(); // �����ϸ� �ܼ�â�� Scanner ���� main ���� ���Ŭ������ ���° ���� �����ϴ����� ������� ��µȴ�
			num =-1;
		}
		catch(ArithmeticException e) { // ������ 0���� ���������� ���� / �̷��� ���ܺ��� ���������� �������൵ ��������
			System.out.println("num���� 0�� �־�� �ȵ˴ϴ�");
			num =-2;
		}
		catch(Exception e) {// ��� ���ܴ� Exception�� �ش�ǹǷ� try������ �Ͼ�� ��� ���ܵ鿡 ���ؼ� �׳� �ϰ� ó�� �ϰ������ Exception ����ϸ� �ȴ�
			System.out.println("ExceptionŬ������ ��� ������ �θ��̱� ������ ������ ��� ���ܸ� �ѹ��� ó���� �� �ֽ��ϴ�.");
			num = -3;
		}finally { // catch�� �ڿ� ���� finally�� ������ �����Ѵ�
			System.out.println("        /)/)        ");
			System.out.println("       (  ..)       ");
			System.out.println("       (  >��        ");
			System.out.println("�� �䳢�� ���ܰ� �߻��ϴ� ���ϴ� ������ �����մϴ�.");
		}
		
		
		
		System.out.println("�Է��� ���ڴ� : "+num);
		
	}
}
