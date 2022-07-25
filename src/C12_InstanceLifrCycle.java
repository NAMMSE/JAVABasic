
public class C12_InstanceLifrCycle {

	/*
	 # 인스턴스 생성시 실행 순서
	 
	  1. (첫 실행시) 스태틱 블록이 실행
	  2. 인스턴스 생성
	  3. 인스턴스 블록 실행
	  4. 생성자 호출
	 */
	public static void main(String[] args) {
		
		new InstanceLife(); // 굳이 변수에 저장하지않고 사용 가능 메서드 사용하고싶으면 .찍고 메서드 적으면 메서드 호출 가능
		new InstanceLife();// 두번째부터 static 블록은 실행되지 않음
	}
}

class InstanceLife{

	// static 블록
	static { // 스태틱 영역은 무조건 메모리에 실어놓는 것이 아니라 해당 클래스가 최초로 사용되는 시점에 메모리에 실리게 된다.
		System.out.println("1. 스태틱 블록 실행");
	}
	
	// 그냥 블록
	
//	try	
//	{
//		System.out.println("2. 인스턴스 블록 실행");
//	}
//	
	// 생성자 
	public InstanceLife() {
		System.out.println("3. 생성자 블록 실행");
	}
}