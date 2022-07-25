
public class E03_CustomException {

	/*
	  # 원하는 예외 직접 만들어서 사용하기
	  
	   - Exception을 상속 받으면 반드시 처리해야하는 예외
	   - RuntimeException을 상속 받으면 반드시 처리할 필요는 없는 예외
	   
	 */
	
	public static void playCat(Cat cat) throws NotPlaybleCatException {
		// A instanceof B : A가 B의 인스턴스인지 검사하는 비교 연산자
		if(cat instanceof RussianBlueCat) {
			// System.out.println("러시안 블루는 노는걸  싫어합니다"); // 이렇게 말고 예외처리로 하고싶다
			throw new NotPlaybleCatException(); // 이렇게 Exception으로
		}
		else {
			System.out.println("고양이와 놀아줬습니다");
		}
	}
	
	public static void main(String[] args) {
		try { //Exception을 상속받은 예외가 메서드 내부에 있으면 메인에서 반드시 try문으로 예외 처리해줘야함 만약 런타임익셉션을 상속받은 예외면 굳이 try문 안해줘도 된다
			playCat(new Cat());
			playCat(new PersianCat());
			playCat(new RussianBlueCat());
		}catch(Exception e) {
			
		}
		
//		playCat(new Cat());				// RuntimeException 상속받은 클래스를 사용하는 메서드 호출 시 이렇게 해도된다
//		playCat(new PersianCat());
//		playCat(new RussianBlueCat());
	}
}

class Cat{}

class PersianCat extends Cat{}

class RussianBlueCat extends Cat{}


class NotPlaybleCatException extends Exception{ // Exception을 상속받으면 예외가 된다 //여기서 런타임익셉션을 상속받으면 메인에서 굳이 try문으로 예외처리할 필요는 없으나 예외가 뜨긴 뜬다
	public NotPlaybleCatException() {
		super("놀 줄 모르는 고양이 Exception");
	}
}