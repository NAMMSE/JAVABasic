import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.UnsupportedAddressTypeException;

public class E02_Throw {

	/*
	  # throw
	  
	   - 원하는 예외를 발생시킨다
	   - 내가 만든 기능을 가져다 사용하는 사람에게 처리를 맡길 수 있다
	   
	  # throws
	  
	   - 해당 메서드에서 예외가 발생함을 알리는 문법
	   - 해당 메서든 내부에서 예외가 발생할 때 추가할 수 있는 문법
	   - 해당 메서드 내부의 예외를 직접 처리하지 않고 메서드를 호출하는 프로그래머에게 예외처리를 넘긴다
	   
	  # 꼭 처리하지 않아도 되는 예외 ( RuntimeException)
	  
	   - RuntimeException 클래스를 상속받은 예외들은 반드시 처리하지 않아도 되는 예외이다
	   - 예외 처리를 하지 않아도 컴파일 에러(빨간줄)가 발생하지 않는다
	   
	  # 반드시 처리해야하는 예외 ( exception)
	  
	   - Exception 클래스를 상속받은 예외들은 반드시 처리해야 하는 예외가 된다
	   - 예외 처리를 하지 않으면 컴파일이 불가능하다.
	   - 어딘가에서 반드시 try-catch문으로 처리되어야 컴파일을 진행하할 수 있다
	   - 발생한 곳에서 바로 처리하고 싶지 않은 경우 throws로 경고하여 해당 메서드를 호출하는 곳으로 예외 처리를 떠넘길 수 있다
	  
	    
	 */
	
	public static void method4() throws Throwable {
		switch ((int)(Math.random())*5) {
		case 0:
			throw new ArrayIndexOutOfBoundsException();
		case 1:
			throw new ArithmeticException();
		case 2:
				
			throw new IOException(); // 해당 에러는 반드시 예외처리를 해야하기때문에 메서드 이름뒤에 throws를 붙이거나 메서드내부에서 try catch문을 써야한다
			
		case 3:
			try { 
				throw new ClassNotFoundException(); // 이것도 반드시 처리해야됨
			}catch(ClassNotFoundException e){
				System.out.println("반드시 처리해야 하는 예외");
			}
		case 4:
			throw new UnsupportedEncodingException();
		
			
		}
	}
	
	public static void method3() {
		throw new NullPointerException();
	}
	
	public static void method2() {
		method3();
	}
	
	public static void method1() {
		method2();
	}
	
	
	public static void main(String[] args) throws IOException { //method4를 호출하려면 main에도 throws 해줘야함

		try {
			method1();
			throw new ArrayIndexOutOfBoundsException("그냥 심심해서 던짐");
		}catch(Exception e) {
			System.out.println("발생한 예외의 메세지는 \"" + e.getMessage() + "\"입니다.");
			System.out.println("예외 발생 시점의 스택정보");
			e.printStackTrace();
		}
		
		try {
			// method4(); 이거 주석 지우면 에러 뜨는데 왜 뜨는지 확인
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("hello");
		
		
	}
}
