package quiz;

import java.util.Scanner;

public class B15_ShuffleText {

	/* ##########################������ �ٽ� Ǯ��@@@@@@@@@@@@@@@@@@@@@@
	 ����ڷκ��� ������ �Է¹����� �ش� ������ �������� �ڼ��� ����ϴ� ���α׷�
	 */
	
	public static void main(String[] args) {
		
		/* �� �ڵ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		String str = sc.nextLine();
		
		int[] ran= new int[str.length()];
		ran[0] = (int)(Math.random()*str.length());
		for(int i =0 ; i<str.length()-1;i++) {
			for(int j=i+1;j<str.length()-1;j++) {
				ran[j] = (int)(Math.random()*str.length());
				if(ran[i]==ran[j]) {
					while(ran[i]!=ran[j]) {
						ran[j] = (int)(Math.random()*str.length());
					}
				}
			}
			
			System.out.printf("%d\n",ran[i]);
		}
		//	ran[i] = (int)(Math.random()*str.length());
//			while(true) {
//					ran[i+1]=(int)(Math.random()*str.length());
//					if(ran[i]!=ran[i+1]) {
//						break;
//					}
//			}
		
		
//		char[] word = new char[str.length()];
//		
//		for(int i= 0;i<str.length();i++) {
//			word[i]=word[ran];
//		}
//		
//		System.out.print("�ٲ﹮���� ");
//		for(int i= 0;i<str.length();i++) {
//			
//			System.out.print(word[i]);
//		}
 *
 */
		//����� �ڵ� 1
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] shuffled_text = text.toCharArray();
		for(int i = 0;i<100;i++) { // 100�� ���� ���� �¹ٲ���
			int x = (int)(Math.random() * shuffled_text.length);
			//int y = (int)(Math.random() * shuffled_text.length);
			
			char temp = shuffled_text[x];
			shuffled_text[x] = shuffled_text[0];
			shuffled_text[0] = temp;
		}
		System.out.println(shuffled_text);
		
		//1. �Է¹��� ������ char[]�� ��ȯ
		char [] original_text = text.toCharArray();//���󺹱�
		//2. ������ ���̿� ���� ������ boolean �迭�� ����(�̾Ҵ� ���ڴ� �ٽ� ���� �ʱ����� ǥ���س��� �뵵)
		boolean[] pick = new boolean[shuffled_text.length];
		//3. ���ڿ��� ����� ���� ����
		StringBuilder shuffled_text_builder = new StringBuilder(); // "" �� ����
		//4. ������ ���̰� 0���� �����ϸ鼭 �� ���ھ� �߰��ϹǷ� ���� ����� ���̰� �������� ��� ���ڸ� �߰� �Ϸ��� ���̹Ƿ� �ݺ��� Ż�� (����尡 ""���¿��� �� ���ھ� �߰���)
		while(shuffled_text_builder.length() != original_text.length) {
			int random_index = (int)(Math.random() * original_text.length); // 5. ���� ��ġ(�ε���)�� �ϳ� �̱�
			
			//6. �ش� �ε����� �̾Ҵ� ���� ������ �߰����� ����
			if(!pick[random_index]) {//oick �ε����� Ʈ��� �ݺ��� ��������
				// �Է¹��� �ؽ�Ʈ���� ���� �ε����� �ش��ϴ� ���ڸ� �ٿ���
				shuffled_text_builder.append(original_text[random_index]);
				// �ش� �ε����� �ٽ� ������ ��쿡 if���� ���� �ʾƾ� �ϹǷ� pick�ε����� true�� �ٲ���
				pick[random_index] = true;
			}
		}
		System.out.println(shuffled_text_builder);
		
		
		
	}
}
//char [] original_text = text.toCharArray();//���󺹱�
//boolean[] pick = new boolean[shuffled_text.length];
//StringBuilder shuffled_text_builder = new StringBuilder(); // "" �� ����
//while(shuffled_text_builder.length() != original_text.length) {
//	int random_index = (int)(Math.random() * original_text.length); // 5. ���� ��ġ(�ε���)�� �ϳ� �̱�
//	if(!pick[random_index]) {//oick �ε����� Ʈ��� �ݺ��� ��������
//		shuffled_text_builder.append(original_text[random_index]);
//		pick[random_index] = true;
//	}
//}
//System.out.println(shuffled_text_builder);

	
	