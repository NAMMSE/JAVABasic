package quiz;

public class B02_ConditionQuiz {

	/*/
	 1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
	 1. int�� ���� b�� ¦���� �� true
	 1. int�� ���� c�� 7�� ����϶� true
	 1. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
	 1. int�� ���� d�� e�� ���̰� 30�� �� true
	 1. int�� ���� year�� 400���� ������ �������ų� �Ǵ� 4�� ������ �������� 100���γ����� �������� ������ true
	 1. �μ��� ö������ ������ 3�� ������ �� true
	 1. boolean�� ���� powerOn�� false�� �� true
	 1. ���ڿ� �������� str�� "yes"�� �� true
	 
	 */
	
	public static void main(String[] args) {
		
		int a, b, c, hour, d, e, year, �μ�����, ö������, �μ�����, ö������;
		boolean powerOn;
		String str1, str2;
		
		a= 15;
		System.out.println("1. " + (a>10 && a<20));
		
		b=4;
		System.out.println("2. " +(b%2==0));
		
		c=49;
		System.out.println("3. "+(c%7==0));
		
		hour = 15;
		System.out.println("4. "+((hour>=0 && hour<24) && hour>=12));
		//System.out.println("4. "+(!((hour<0)) && (!(hour>=24)) && hour>=12));
		//System.out.println("4. "+(!(hour<0 || hour>=24) && hour>=12));
		
		
		d=10; e= 40;
		System.out.println("5. "+((d-e==30) || (e-d==30))); //Math.abs()
		
		year = 1000;
		System.out.println("6. "+((year%400==0) || (year%4==0 && year%100!=0)));
		
		
		
		
		�μ����� = 1;
		ö������ = 12;
		�μ����� = 25;//94
		ö������ = 26;//95
		System.out.println("7. "+((�μ�����==ö������ && ö������-�μ�����>=3) || (�μ�����>ö������&&�μ�����-ö������<=9) || (�μ�����<ö������) ));
		
		/*
		 
		 System.out.println((�μ�����+3)%12 == ö������)
		 System.out.println((ö������-3+12)%12 == �μ�����)
		 System.out.println(ö�� - �μ� == 3 || �μ� - ö�� == 9)
		 
		 */
		
		
		
		powerOn = false;
		System.out.println("8. "+(!powerOn));
		
		
		
		str1 = "yes";
		str2 = "yes";
		String str3 = new String("yes");
		System.out.println("9. "+(str1=="yes"));
		System.out.println("9. "+(str1==str2));
		System.out.println("9. "+(str1==str3));
		
		System.out.println("9. "+(str1.equals(str3))); // ���� ���� ���� ��(�ּҰ��� �ƴ� ���� ���� ���� ��)
		
		
		
		// ������ ������ ==���� ���ϸ� �ּҰ��� ���� ���Ѵ�
		// String�� �޸𸮿� �� �� ��ü�� �ƴ� �ش� ���ڿ��� ����ִ� ���� �޸��� ù �ּҸ� ����Ű�� �ֱ� ������ ���ڿ� ��ü�� �ƴ� �ּҰ����� �񱳸� �Ѵ�.
		// ���� ���� ���ڿ��� ������ ���ʿ� ������� ���ڿ��� �ּҰ��� ����ؼ� ����ϰ� �߰������� ���� ���������� ���ڿ��� ���� �� ���� ���ڿ��� �� ���ڿ��� == ���� ���ϸ� �ּҰ��� �ٸ��⶧���� false�� ���´�
		
	}
}
