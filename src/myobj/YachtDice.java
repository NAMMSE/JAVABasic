package myobj;

import java.util.Arrays;

public class YachtDice {
/* ���ڵ�
	int[] dicenum = new int[5];
	public YachtDice(int[] dicenum) {
		this.dicenum = dicenum;
	}
	
	public void Playing(int[] dicenum) {
		
		int cnt;
		int[] index = new int[5];
		for(int i=0;i<5;i++) {
			index[i]=dicenum[i];
		}
		int temp;
		for(int i =0;i<5;i++) {  			// 11333, 11133 ������ �����ؼ� ��
			for(int j=0;j<4;j++) {
				if(index[j]>index[j+1]) {
					temp = index[j];
					index[j]=index[j+1];
					index[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<5;i++) {  
			cnt=0;
			for(int j=i+1 ;j<5;j++) {
				if(index[i]==index[j]) {
					cnt++;
				}
			}
			if(cnt==4) {
				System.out.print("�����մϴ�. Yacht�Դϴ�. \n�ֻ��� ���� : ");
				for(int k=0;k<5;k++) {
					System.out.printf("%d ", dicenum[k]);
				}
				return;
			}
			else if(cnt==3){
				System.out.print("�����մϴ�. 4 ���̽��Դϴ�. \n�ֻ��� ���� : ");
				for(int k=0;k<5;k++) {
					System.out.printf("%d ", dicenum[k]);
				}
				return;
			}
			
			else if(cnt==2) {
				
			}
		}
	}*/
	
	final static int GAME_SIZE = 5;
	final static int DICE_FACES = 6;
	
	int life = 2; //�ι� �ٽ� ������ �����Ƿ� 
	int[] dices; // ���� �ֻ��� ���� 5�� ����
	int[] count = new int[DICE_FACES]; // �ֻ��� ���� 5���� ���� ������� ��� ����� Ȯ��
	String made; // ��� �������� ����ϱ� ���� ���ڿ�
	
	public YachtDice() { 
		dices = new int[GAME_SIZE];
		//Arrays.fill(arr, val) :�迭�� ���ϴ� ������ �ѹ��� ä��� �Լ�
		//Arrays.fill(dices, roll());
		
		for(int i=0;i<dices.length;i++) {
			roll(i);
		}
		check();
	}
	// �ֻ��� ������ ������ ������� count �迭�� ���ϴ� ���ڰ� �ִ��� üũ�ϴ� �޼���
	boolean numberContain(int num) {
		return count[num-1] > 0; 	// 1~6������ ���ڰ� �����ִ��� ��Ÿ���� �迭�̹Ƿ� ���ϴ� ���� �Է½� �ش� ĭ�� 0�̻��̸� 1���̻� ���ڰ� ������
	}
	
	
	// �ֻ��� ������ ������ ������� count �迭�� ���ϴ� Ƚ����ŭ ������ ���ڰ� �ִ��� üũ�ϴ� �޼���
	boolean countContain(int cnt) {
		for( int i =0 ; i< count.length;i++) {
			if(count[i]==cnt) {
				return true;
			}
		}
		return false;
	}
	
	// "245"��� �Է� ������ 2���� 4��° 5��° �ֻ����� �ٽ� ���� ����
	public void reroll(String idxs) {
		
		if(life<1) {
			return;
		}
		for(int i =0;i<idxs.length();i++) {
			// ���ڿ��� ���� '����'���� '����'�� ���� �ƽ�Ű�ڵ� ������ ����Ͽ� ���� 0�� ����� '3'-'0' �� �ƽ�Ű�ڵ尪���� 50-48�̹Ƿ� ���� 2�� ����
			int index = idxs.charAt(i) - '0'; 
			if(index<0 || index>GAME_SIZE) {
				continue;
			}
			else {
				roll( index- 1);
			}
		}
		life--;
		check();
	}
	
	// ���� dices�� ������ � ���ڰ� �� �� �ִ��� ���� �޼���
	void count() {
		// [0,0,0,0,0,0]
		Arrays.fill(count,0);		// ��� �迭 ���� 0���� ����� �ֻ����� ������ ī��Ʈ �ɶ����� 1�� ���� ����
		for(int i=0;i<dices.length;i++) {
			count[dices[i]-1]++; 	// dices 6�� ������ count�迭�� [5]�ڸ��� 1������ -> 6�� �ϳ� �������Ƿ� 1 ī��Ʈ 
		}
	}
	//���� dices�� ���� ���� ����(����)�� �����ϴ� �޼���
	void check() {
		count();
		
		if(countContain(5)) {
			made = "Yacht!";
		}
		else if(countContain(4)) {
			made = "4 dice!";
		}
		else if(countContain(3)&&countContain(2)) {
			made = "Full House!";
		}
		else if(numberContain(2)&&numberContain(3)&&numberContain(4)&& // 2345�� �ϳ��̻� �� ������ �ְ� 1�̳� 6�� ����������
				numberContain(5)&&(numberContain(1)||numberContain(6))) {
			made = "Large Straight!";
		}
		else if(numberContain(3)&&numberContain(4)
					&&((numberContain(1)&&numberContain(2))
					||(numberContain(2)&&numberContain(5))
					||(numberContain(5)&&numberContain(6)))) {
				made = "Small Straight!";
			
		}
		else {
			made = "" + (dices[0]+dices[1]+dices[2]+dices[3]+dices[4]);
		}
	}
	
	
	// ���ϴ� ��°�� �ֻ����� �ٽ� ������ �޼���
	void roll(int index) {
		dices[index] = (int)(Math.random()*6+1);
	}
	/*
	  # Object.toString()
	  
	   - �ش� Ŭ������ ���ڿ��μ� ��µǾ�� �� �� ������ ȣ��Ǵ� �޼���
	   - Object�� ��� Ÿ���� �θ��̱� ������ ��� Ŭ������ toString()�� ���ԵǾ� �ִ�
	   - �������̵��ؼ� ������� ������ �⺻������ �޸𸮻��� �ּҰ��� ����Ѵ�
	 */
	
	
	@Override
	public String toString() {
		// String.format() : printf()ó�� ���ڿ��� ������ �� ����ϴ� �Լ�
		return String.format("���� �ֻ��� : %s\n" + "���� ���� : %s",Arrays.toString(dices),made);
	}
	
	
}















































