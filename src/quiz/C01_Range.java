package quiz;

import java.util.Arrays;

public class C01_Range {

	
	
	
	/*
	  # 메서드 오버로딩
	  
	   - 자바에서는 같은 이름의 메서드를 여러개 선언할 수 있다
	   - 이름이 같은 메서드여도 매개변수의 타입 또는 개수가 다르다면 다른 메서드로 인지한다
	   
	 */
	/*
	  1. 최대값을 매개변수로 전달받으면 0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는
	  	 range 메서드를 만들어보세요
	  	 
	  2. 최소값과 최대값읆 매개변수로 전달받으면 최소값부터 최대값 미만의 모든 값을 포함하는 int 배열 생성하여 반환하는 
	  	 range 메서드를 만들어보세요
	  	 
	  	 ex : range(10, 15) = [10, 11, 12, 13, 14]
	  	 	  range(15, 10) = [15, 14, 13, 12, 11]
	  	 	  
	  3. 최소값과 최대값과 증가값을 매개변수로 전달 받으면 
	  	 최소값부터 최대값 미만까지 증가값만큼 증가하는 int 배열을 생성하여 반화하는 
	  	 range 메서드를 만들어 보세요
	  	 
	  	 ex : range(30, 40, 3) -> [30, 33, 36, 39]
	  	 	  range(40, 45, 5) -> [40]
	  	 	  range(40, 30, -2)-> [40, 38, 36, 34, 32]
	 */
	
	
	// 1번 레인지
	public static int[] range(int num) {
		int[] max = new int[num];
		for(int i =0; i<num;i++) {
			max[i]=i;
		}
		return max;
	}
	
	// 2번 레인지
//	public static int[] range(int min, int max) {   내 코드
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
	
	//2번 레인지 강사님 코드
	public static int[] range(int start, int end) {
		int[] arr = new int[Math.abs(end-start)];
		
		int incre = start < end ? 1: -1;
		for(int i=start, index = 0; i!=end;i+=incre) {
			arr[index++] = i;
		}
		return arr;
	}
	
	//3번 배열 개수 세는 메서드
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
	
	//3번 배열 개수 세는 메서드 강사님 코드
	public static int length(int start, int end, int incre) {
		//diff의 결과가 양수라는 것은 end가 더 크므로 incre가 양수여야 한다는 뜻이다.
		// end 값 미만의 개수를 찾는 것이므로 incre가 양수일때는 -1을 해야하고
		// incre가 음수일때는 +1을 해야한다
		int diff = (end - start) + (incre >0 ? -1 : 1);
				
		//차이를 증가값 만큼 나누면 숫자가 몇 개 등장하는지 알 수있다
		int length = diff  / incre;
		if(length < 0) {
			System.out.println("length: 0");
			return 0;
		}else {
			length +=1;
		}
		return length;
	}
	//3번 강사님 코드
	public static int[] range2(int start, int end, int incre) {
		int len = arrsize(start, end, incre);
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++) {
			arr[i]=start + incre * i;
		}
		return arr;
	}
	
	//3번 내코드
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
		
		// forEach문 : 나열된 것들을 하나씩 차례대로 꺼내며 반복하는 문법
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

