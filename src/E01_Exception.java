import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_Exception {

	/*
	  # 예외 (Exception)
	  
	   - 우리가 에러라고 생각했던 빨간 글씨들을 예외라고 부른다
	   - 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러(자바 문법 오류)라고 부른다
	   - 프로그래머는 발생할 예외를 미리 예측하고 대비해 둘 수 있다(예외처리)
	   - 예외 발생 시 기본 동작은 프로그램의 강제 종료이다 ( 기본동작이 강제종료인 것이므로 강제종료 하지 않고 프로그램을 실행하는 것이 예외처리)
	   
	  # 예외 처리
	  
	   - 예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다
	   - try문 내부에서 예외가 발생하지 않으면 모두 정상 실행된다
	   - try문 내부에서 예외가 발생하면 즉시 try문의 실행을 중단하고 발생한 예외에 해당하는 catch문으로 
	   - catch문은 여러번 쓸 수 있다
	   - 예외 발생시 catch문으로 발생한 예외에 대한 자세한 정보를 담고있는 인스턴스가 전달된다
	     (catch(Exception e) 라고 쓸 때 e를 말하는 것)
	   
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		// arr[10] = 123; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:  예외 에러가 뜸
		
		try {
			//arr[10] = 123;
			arr[0] = 1;
			arr[12] = 100; // 여기서 예외가 발생되면 남은 줄은 실행안하고 즉시 캐치문으로 넘어간다 
			arr[1] = 3;
			System.out.println("try문 실행 완료!");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 인덱스 범위를 벗어났습니다.");
		}
		System.out.println(Arrays.toString(arr)); // try문에서 0번째에 1넣고 그 다음 예외처리 발생했으므로 나머지는 다 0으로 초기화
		System.out.println("hello");
		
		//-------------------------------------------------//
		
		//예외처리로 스캐너 사용하기
		Scanner sc = new Scanner(System.in);
		int num; // try문에서 초기화하면 try문 밖에서 사용할 때 에러가 발생하니 먼저 초기화 해주는 것이 좋다
		try {// 숫자 입력하는 프로그램에서 숫자를 입력하지 않았을때
			System.out.print("반드시 숫자를 입력하세요 >>");
			num = sc.nextInt();
			num = 10/ num;
			
		
		}
		catch(InputMismatchException e) { // int형에 문자를 넣었을때의 예외
			System.out.println("반드시 숫자만 입력하라고 했을텐데");
			
			// 어디서 에러가 발생했는지 추적해볼 수 있는 메서드
			e.printStackTrace(); // 실행하면 콘솔창에 Scanner 부터 main 까지 어느클래스의 몇번째 줄을 실행하는지가 순서대로 출력된다
			num =-1;
		}
		catch(ArithmeticException e) { // 정수를 0으로 나눴을때의 예외 / 이렇게 예외별로 세부적으로 지정해줘도 괜찮은데
			System.out.println("num에는 0을 넣어서는 안됩니다");
			num =-2;
		}
		catch(Exception e) {// 모든 예외는 Exception에 해당되므로 try문에서 일어나는 모든 예외들에 대해서 그냥 일괄 처리 하고싶으면 Exception 사용하면 된다
			System.out.println("Exception클래스는 모든 예외의 부모이기 때문에 나머지 모든 예외를 한번에 처리할 수 있습니다.");
			num = -3;
		}finally { // catch문 뒤에 쓰고 finally는 무조건 실행한다
			System.out.println("        /)/)        ");
			System.out.println("       (  ..)       ");
			System.out.println("       (  >♡        ");
			System.out.println("이 토끼는 예외가 발생하던 안하던 무조건 등장합니다.");
		}
		
		
		
		System.out.println("입력한 숫자는 : "+num);
		
	}
}
