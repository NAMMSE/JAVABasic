package quiz;

public class B11_WhileQuiz {

	/*
	 while문만 사용하여 다음을 구하시오
	 
	 1. 500 ~ 1200 사이에 있는 모든 3의 배수의 총합
	 2. 30부터 1까지 한 줄에 숫자 5개씩 출력
	 3. 1부터 200까지의 숫자 중에 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
	 
	 */
	
	public static void main(String[] args) {
		
		int i=500, sum=0;
		//1
		while(i<=1200) {
			if(i%3==0) {
				//System.out.printf("%d \n", i);
				sum=sum+i;
			}
			i++;
		}
		System.out.printf("%d \n",sum);
		
		System.out.println("====================");
		
		//2
		i=30;
		
		while(i>=1) {
			System.out.printf("%-4d",i);
			i--;
			if(i%5==0) {
				System.out.println();
			}
		}
		
		System.out.println("====================");
		
		//3
		i=1;
		sum=0;
		while(i<=200) {
			if(i%2!=0 && i%3!=0) {
				//System.out.printf("%d \n", i);
				sum=sum+i;
			}
			i++;
		}
		System.out.printf("%d", sum);
	}
}
