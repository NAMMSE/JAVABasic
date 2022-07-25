import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static int[] createLottoNumber() {// �ߺ����� 6���� ���� ���� ����
		int[] rannum = new int[6]; 
		Random ran = new Random();
		for(int i=0;i<rannum.length;i++) { 
			int newnum = ran.nextInt(45)+1;
			rannum[i]=newnum;
			for(int j=0;j<i;j++) {
				if(newnum==rannum[j]) {
					i--;
					break;
				}
			}
		}	
		return rannum;
	}
	
	public static int[] bubblesort(int[] sorting) {// 7��° ���� ���ʽ� ���ڸ� �����ϰ� ������ ���ڵ��� ���ϱ� ���� �������� �̿��Ͽ� ������������ ����
		
		for(int i=0;i<sorting.length;i++) { 
			int temp;
			for(int j=0;j<sorting.length-1-i;j++) {
				if(sorting[j]>sorting[j+1]) {
					temp=sorting[j];
					sorting[j]=sorting[j+1];
					sorting[j+1]=temp;
				}
			}
		}
		return sorting;
	}
	
	public static void main(String[] args) {
	
		// ���ʽ� ���ڰ� ���Ե� ��÷��ȣ�� ����ؼ� ������ 6�ڸ� ������ ������ �ٸ��Ƿ� 7�ڸ� ��÷���ڻ����� �޼��� ������� ����
		int[] winnum = new int[7]; // ���� 7�� ��÷���� ����
		Random ran = new Random();
		for(int i=0;i<winnum.length;i++) { 
			int newnum = ran.nextInt(45)+1;
			winnum[i]=newnum;
			for(int j=0;j<i;j++) {
				if(newnum==winnum[j]) {
					i--;
					break;
				}
			}
		}	
		for(int i=0;i<winnum.length-1;i++) { // ���ʽ� ���� ���� �������� ����
			int temp;
			for(int j=0;j<winnum.length-2-i;j++) {
				if(winnum[j]>winnum[j+1]) {
					temp=winnum[j];
					winnum[j]=winnum[j+1];
					winnum[j+1]=temp;
				}
			}
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ζǸ� �� �� �����Ͻðڽ��ϱ� >> ");
		int lottnum = sc.nextInt();
		int[][] lottnums = new int[lottnum][6];
		for(int i=0;i<lottnum;i++) { // �ζǹ�ȣ �����ϴ� �ݺ���
			lottnums[i]=createLottoNumber(); 	// ����ڰ� �Է��� Ƚ����ŭ �ζǹ�ȣ ����
			lottnums[i]=bubblesort(lottnums[i]); // ������ ���ÿ� ���ʽ� ��ȣ ���� �������� ����
			//System.out.println(Arrays.toString(lottnums[i]));
		}
	
		int cnt=0;
		int[] win = new int[5];
		for(int i=0;i<lottnum;i++) {
			cnt=0;
			for(int j=0;j<7;j++) {
				for(int k=0;k<6;k++) {
					if(j!=6 && lottnums[i][k]==winnum[j]) {
						cnt++;
						if(cnt==6) {
							System.out.printf("%d��°�� 1�� ��÷�Դϴ�.\n", i+1);
							System.out.println("�ζ� ��ȣ : "+Arrays.toString(winnum));
							System.out.println("��÷ ��ȣ : "+Arrays.toString(lottnums[i]));
							win[0]++;
						}
					}
					else if(cnt==5 && lottnums[i][k]==winnum[6] ) {
						System.out.printf("%d��°�� 2�� ��÷�Դϴ�.\n", i+1);
						System.out.println("�ζ� ��ȣ : "+Arrays.toString(winnum));
						System.out.println("��÷ ��ȣ : "+Arrays.toString(lottnums[i]));
						win[1]++;
						cnt=0;
					}	
				}
			}
			if(cnt==3) {
				System.out.printf("%d��°�� 5�� ��÷�Դϴ�.\n", i+1);
				System.out.println("�ζ� ��ȣ : "+Arrays.toString(winnum));
				System.out.println("��÷ ��ȣ : "+Arrays.toString(lottnums[i]));
				win[4]++;
			}
			else if(cnt==4){
				System.out.printf("%d��°�� 4�� ��÷�Դϴ�.\n", i+1);
				System.out.println("�ζ� ��ȣ : "+Arrays.toString(winnum));
				System.out.println("��÷ ��ȣ : "+Arrays.toString(lottnums[i]));
				win[3]++;
			}
			else if(cnt==5) {
				System.out.printf("%d��°�� 3�� ��÷�Դϴ�.\n", i+1);
				System.out.println("�ζ� ��ȣ : "+Arrays.toString(winnum));
				System.out.println("��÷ ��ȣ : "+Arrays.toString(lottnums[i]));
				win[2]++;
			}
		}
		System.out.println("====================================");
		System.out.printf("�� %dȸ �õ��Ͽ� 1�� %d��, 2�� %d��, 3�� %d��, 4�� %d��, 5�� %d�� ��÷�Ǿ����ϴ�.\n", lottnum, win[0], win[1], win[2], win[3], win[4]);
	}
}
