package quiz;

import java.util.Arrays;

public class C01_Range {

	
	
	
	/*
	  # �޼��� �����ε�
	  
	   - �ڹٿ����� ���� �̸��� �޼��带 ������ ������ �� �ִ�
	   - �̸��� ���� �޼��忩�� �Ű������� Ÿ�� �Ǵ� ������ �ٸ��ٸ� �ٸ� �޼���� �����Ѵ�
	   
	 */
	/*
	  1. �ִ밪�� �Ű������� ���޹����� 0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	  	 range �޼��带 ��������
	  	 
	  2. �ּҰ��� �ִ밪�� �Ű������� ���޹����� �ּҰ����� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭 �����Ͽ� ��ȯ�ϴ� 
	  	 range �޼��带 ��������
	  	 
	  	 ex : range(10, 15) = [10, 11, 12, 13, 14]
	  	 	  range(15, 10) = [15, 14, 13, 12, 11]
	  	 	  
	  3. �ּҰ��� �ִ밪�� �������� �Ű������� ���� ������ 
	  	 �ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȭ�ϴ� 
	  	 range �޼��带 ����� ������
	  	 
	  	 ex : range(30, 40, 3) -> [30, 33, 36, 39]
	  	 	  range(40, 45, 5) -> [40]
	  	 	  range(40, 30, -2)-> [40, 38, 36, 34, 32]
	 */
	
	
	// 1�� ������
	public static int[] range(int num) {
		int[] max = new int[num];
		for(int i =0; i<num;i++) {
			max[i]=i;
		}
		return max;
	}
	
	// 2�� ������
//	public static int[] range(int min, int max) {   �� �ڵ�
//		if(min==max) {
//			int[] arr = new int[1];
//			arr[0] = min;
//			return arr;
//		}
//		int[] arr = new int[Math.abs(min-max)];
//		if(min<max) {
//			for(int i=min;i<max;i++) {
//				arr[i-min]=i;
//			}
//		}
//		else if(min>max) {
//			for(int i=min;i>max;i--) {
//				arr[min-i]=i;
//			}
//		}
//		else {
//			arr[0]=min;
//		}
//		return arr;	
//	}
	
	//2�� ������ ����� �ڵ�
	public static int[] range(int start, int end) {
		int[] arr = new int[Math.abs(end-start)];
		
		int incre = start < end ? 1: -1;
		for(int i=start, index = 0; i!=end;i+=incre) {
			arr[index++] = i;
		}
		return arr;
	}
	
	//3�� �迭 ���� ���� �޼���
	public static int arrsize(int min, int max, int cal) {
		int num=0;
		cal=Math.abs(cal);
		int num2=Math.abs(min-max);
		if((num2)%cal ==0) {
			num= (num2)/cal;
		}
		else if((num2)%cal>=1) {
			num=(num2)/cal+1;
		}
		return num;
	}
	
	//3�� �迭 ���� ���� �޼��� ����� �ڵ�
	public static int length(int start, int end, int incre) {
		//diff�� ����� ������ ���� end�� �� ũ�Ƿ� incre�� ������� �Ѵٴ� ���̴�.
		// end �� �̸��� ������ ã�� ���̹Ƿ� incre�� ����϶��� -1�� �ؾ��ϰ�
		// incre�� �����϶��� +1�� �ؾ��Ѵ�
		int diff = (end - start) + (incre >0 ? -1 : 1);
				
		//���̸� ������ ��ŭ ������ ���ڰ� �� �� �����ϴ��� �� ���ִ�
		int length = diff  / incre;
		if(length < 0) {
			System.out.println("length: 0");
			return 0;
		}else {
			length +=1;
		}
		return length;
	}
	//3�� ����� �ڵ�
	public static int[] range2(int start, int end, int incre) {
		int len = arrsize(start, end, incre);
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++) {
			arr[i]=start + incre * i;
		}
		return arr;
	}
	
	//3�� ���ڵ�
	public static int[] range(int min, int max, int cal) {
		int[] arr = new int[arrsize(min, max, cal)];
		cal = Math.abs(cal);
		if(min<max) {
			for(int i=min, j=0 ;i<max;i+=cal) {	
				arr[j++]=i;
			}
		}
		else {
			int j=0;
			for(int i =min;i>max;i-=cal) {
				arr[j]=i;
				j++;	
			}
			
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		
		// forEach�� : ������ �͵��� �ϳ��� ���ʴ�� ������ �ݺ��ϴ� ����
		for(int i:range(10)) {
			System.out.println("i: +"+i);
		}
		for(char c:"Hello, World!".toCharArray()) {
			System.out.println("c: "+c);
		}
		
		System.out.println(Arrays.toString(range(10)));
		System.out.println(Arrays.toString(range(10,15)));
		System.out.println(Arrays.toString(range(15,10)));
		System.out.println(Arrays.toString(range2(30,40,3)));
		System.out.println(Arrays.toString(range2(10,19,2)));
		System.out.println(Arrays.toString(range2(40,45,5)));
		
		
		myutil.Range r = new myutil.Range(10,20);
		myutil.Range r2 = new myutil.Range(30,10,-5);
		
		System.out.println(Arrays.toString(r.range));
		System.out.println(Arrays.toString(r2.range));
	}
}

