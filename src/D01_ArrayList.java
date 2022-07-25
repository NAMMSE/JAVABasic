import java.util.ArrayList;

public class D01_ArrayList {

	/*
	  # 자료구조
	  
	   - 데이터를 효율적으로 저장하는 방식에 대한 모든 것
	   - 상황마다 최적의 효율을 내는 자료구조가 있다.
	   
	  # Java Collection Interface
	  
	   - 컬렉션은 자바에서 제공하는 자료구조 인터페이스이다
	   - 컬렉션끼리는 언제든지 다른 컬렉션으로 변환이 가능하다
	   - 컬렉션 인터페이스를 구현한 클래스로는 List, set 등이 있다
	   
	  # java.util.ArrayList
	  
	   - 배열과 유사하지만 크기가 자동으로 조절되는 자료구조를 구현한 클래스
	   - 배열처럼 데이터를 순차적으로 저장한다
	   - 모든 데이터를 순서대로 접근하는 속도가 가장 빠른 컬렉션이다
	 */
	
	public static void main(String[] args) {
		
		// 1. 타입을 지정하지 않고 ArrayList 생성하기
		ArrayList list1 = new ArrayList();
		
		// add(item): 리스트의 맨 뒤에 원하는 데이터를 추가한다.
		list1.add(10);// 배열안에 데이터의 타입이 Object타입 (Object)는 모든 데이터의 부모 클래스이므로 못들어가는 타입이 없다 
		list1.add(11);// 반환 값은 boolean 타입이다.
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);		
		list1.add("이");

		
		// list.add(index, item) : 리스트의 원하는 위치에 데이터를 추가한다
		list1.add(3,"휴가");
		
		System.out.println(list1);
		
		// get(index) : 리스트에서 해당 인덱스의 데이터를 하나 꺼내는 메서드
		System.out.println(list1.get(5));
		
		// Object 타입으로 업캐스팅 되어 있는 int
		Object obj = list1.get(0);
		
		//다운 캐스팅 시 타입이 다르면 에러가 발생할 수 있어서 불편하다
		int a = (int)obj;
		
		System.out.println(a);
		
		// 2. 타입을 지정하며 ArrayList 생성하기 (제네릭)
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("강아지");
		list2.add("고양이");
		list2.add("기린");
		list2.add("돼지");
		list2.add(2,"사슴");
		
		System.out.println(list2);
		
		// 제네릭 내부에는 기본형 타입은 사용할 수 없다.(int, short, ....)
		ArrayList<Integer> list3 = new ArrayList();
		
		list3.add(8);
		list3.add(11);
		list3.add(18);
		list3.add(88);
		list3.add(99);
		System.out.println(list3);
		
		ArrayList<Character> list4 = new ArrayList();
		
		list4.add('A');
		list4.add('P');
		list4.add('E');
		list4.add('L');
		list4.add('R');
		System.out.println(list4);
		
		// list.size() : 해당 리스트의 크기를 반환한다
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		System.out.println(list4.size());
		
		// list.contains(item) : 리스트에 해당 값이 포함되어있는지 여부 true false로 반환한다
		System.out.println("리스트에 사자가 있나요? "+list2.contains("사자"));
		
		// list.indexOf(item) : 리스트에서 해당 값의 위치를 반환한다. 찾지 못하면 -1을 반환한다
		System.out.println(list1.indexOf("이"));
		System.out.println(list2.indexOf("기린"));
		
		// list.set(index, item) : 리스트의 해당 위치의 값을 수정한다.
		list2.set(2, "치타");
		System.out.println("수정됨"+list2);
		
		// list.remove(index) : 해당 번째 내용을 삭제하고, 지운 내용을 반환한다
		// list.remove(object) : 해당 내용을 삭제하고, 성공 여부를 반환한다
		
		
		System.out.println(list1.remove(5));
		
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		list2.add("apple");
		
		while(list2.remove("apple")) {
			System.out.println(list2);
		}
		
		for(int i=0 ;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		for(String animal:list2) {
			System.out.println(animal);
		}		
	}
}
