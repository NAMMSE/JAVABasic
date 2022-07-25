package quiz;

import java.util.Arrays;

public class B15_Lotto {

	/*#########################������ �ٽ� Ǯ��#########################
	  1. 1 ~ 45 �� �ߺ� ���� ���� ���� 7���� �����Ͽ� ��÷ ��ȣ�� ��������
	  2. ��÷ �� ������ ��ȣ�� ������ �Ŀ� �� ȸ ���� ��÷ �Ǿ����� ���
	  
	  
	  �ߺ����� 7�� ���� ���� �� �������� ����
	  ������ ������� ���� ���� �� lotto[i]�� dang[i] ��
	  
	 */
	
	public static void main(String[] args) { // ���� 7�� �����ε� �ߺ��� ���� �� ����
		/* ���ڵ�
		int[] lotto = new int[7];
		//boolean[] lonum = new boolean[45];
		for(int i =0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random() * 45 +1);
			System.out.printf("%d: %d \n",i,lotto[i]);
			for(int j=i;j<lotto.length;j++) {
				
			}
		}
		System.out.printf("==================\n\n");
		int temp;
		for(int i =0;i<lotto.length-1;i++) {  // ��÷��ȣ �������� �˰������� ��������
			for(int j=0;j<lotto.length-2-i;j++) {
				if(lotto[j]>lotto[j+1]) {
					temp = lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=temp;
				}
			
			}
			System.out.printf("%d�� ����: %d \n",i+1,lotto[i]);
		}
	
		/* ������ �ڵ�
		 * for(int i= 0;i<7;){
		 * dang[i] = (int)(Matn.random()*45+1);
		 * if(!my_pick[my_num[i]]{
		 * my_pick[my_num[i]]=true;
		 * i++
		 * }
		 */
		
		
		
		
		
   
		
		//����� �ڵ�
		
		int[] win = new int[7];
		for(int i = 0;i<win.length;i++) {
			int newNum=(int)(Math.random() * 45 +1);
		//	System.out.printf("�̹��� ���� ���� ��ȣ : %d = ",newNum);
		//	System.out.printf("%d(i)��° ���� (�̴� ��) \n",i);
			win[i] =newNum;
			for(int j=0;j<i;j++) {
			//	System.out.printf("������ ���ڸ� ���� �� win[%d] : %d \n",j,win[j]);
				
				if(newNum==win[j]) {
			//		System.out.printf("�ߺ� �߰�! %d(i) ��° ���ڸ� �ٽ� �̽��ϴ� \n",i);
					--i; // �ߺ� �߰� �ϸ� i ���ҽ�Ű�� �ݺ��� ����> �ߺ��̿��� ���ڸ� �ٽ� �̰� ��
					break;
				}
			}
			
		}
		//Arrays.toString(arr) : ������ �迭�� ���� ���� ���ڿ��� ����� ��ȯ�Ѵ�
		System.out.println(Arrays.toString(win)); // �ߺ����� ���� ��÷ ����
		
		
	/* ���� ����� ���� ��� �� �ڵ�
		int temp=0;
		for(int i =0;i<win.length;i++) {  // ��÷�� ��ȣ �������� �˰���
			for(int j=0;j<win.length-1-i;j++) {
				if(win[j]>win[j+1]) {
					temp = win[j];
					win[j]=win[j+1];
					win[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(win)); // �������ķ� ��������
		
		int dang[] = new int[7];
		int cnt=0, numcnt=0;;
		while(true) { // 7�ڸ� ���� ���� ��ġ�Ҷ����� �������ϹǷ� ���ѹݺ�
			for(int i = 0;i<dang.length;i++) { // �ߺ����� 7�� ���� ��������
				int newNum=(int)(Math.random() * 45 +1);
				dang[i] =newNum;
				for(int j=0;j<i;j++) {
					if(newNum==dang[j]) {
						--i; // �ߺ� �߰� �ϸ� i ���ҽ�Ű�� �ݺ��� ����> �ߺ��̿��� ���ڸ� �ٽ� �̰� ��
						break;
					}
				}
				
			}
			for(int i =0;i<dang.length;i++) {  // ��÷�� ��ȣ �������� �˰���
				for(int j=0;j<dang.length-1-i;j++) {
					if(dang[j]>dang[j+1]) {
						temp = dang[j];
						dang[j]=dang[j+1];
						dang[j+1]=temp;
					}
				}
			}
			//System.out.println("dang="+Arrays.toString(dang)); // �������ķ� ��������
			cnt=0; // cnt==7 �� �Ǵ� ������ ���� ��ġ�ϴ� �����̱⶧���� ���ڸ� ����� �� �� ���ϱ� �� 0���� �ʱ�ȭ
			for(int i=0; i<win.length;i++) {
				if(win[i]==dang[i]) { // i��° ���� ���ϸ鼭 ������ cnt ++�ϰ� ��ġ���� ���
					cnt++;
					//System.out.printf("%d ��°���� ��ġ.\n",i);
				}
				else {// �ѹ��̶� �ٸ����� �ݺ��� Ż�� �� 7�� ���� �����
					break;
				}
			}
			
			if(cnt==7) {//cnt�� 7�̸� 7�� ���� ��� ��ġ�� ���̹Ƿ� while Ż��(�̰� ���ְ� while �� ���ǿ� cnt<7�ص� ����)
				break;
			}
			numcnt++;// ���� ����� �� �񱳸� ����̳� �ߴ��� ī��Ʈ
			
		}
		System.out.printf("%dȸ ���� ��÷�Դϴ�.\n",numcnt);
		
�������		*/
		
		// ����� �ڵ�
		int autocnt=0;
		while(true) {
			int[] auto = new int[7];
			
			for(int i = 0;i<auto.length;i++) { // �ߺ����� 7�� ���� ��������
				int newNum=(int)(Math.random() * 45 +1);
				auto[i] =newNum;
				for(int j=0;j<i;j++) {
					if(newNum==auto[j]) {
						--i; // �ߺ� �߰� �ϸ� i ���ҽ�Ű�� �ݺ��� ����> �ߺ��̿��� ���ڸ� �ٽ� �̰� ��
						break;
					}
				}
				
			}
			autocnt++;
			
			int cnt=0; // ��ġ�ϴ� ��ȣ ���� ����
			for(int i=0;i<auto.length;++i) {
				for(int j=0;j<win.length;j++) {
					if(auto[i]==win[j]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt==7) {
				System.out.printf("1�� ��÷�Դϴ�.  %dȸ \n",autocnt);
				System.out.println("��÷��ȣ : "+Arrays.toString(win));
				System.out.println("�ڵ���ȣ : "+Arrays.toString(auto));
				break;
				
			}
			else if(cnt==6) {
				System.out.printf("2�� ��÷�Դϴ�.  %dȸ \n",autocnt);
				System.out.println("��÷��ȣ : "+Arrays.toString(win));
				System.out.println("�ڵ���ȣ : "+Arrays.toString(auto));
			}
		}
	}
	
}
