package myobj;

public class Person {

	public String name;
	public int age;
	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	
//	public void sayhi(Person p) {
//		if(p.age<10) {
//			System.out.println("안녕 내이름은 "+ name +"이고 나이는 " + age + "살 이야");
//		}
//		else if(p.age<20) {
//			System.out.println("안녕하세요~ 제 이름은 "+ name +"입니다.");
//		}
//		else if(p.age<30) {
//			System.out.println("안녕하십니까. 제 이름은 "+ name +"입니다.");
//		}
//		
//	}
	
	// 업캐스팅 다운캐스팅 때 하려고 수정한 코드
	public void sayhi() {
		if(age<10) {
			System.out.println("안녕 내이름은 "+ name +"이고 나이는 " + age + "살 이야");
		}
		else if(age<20) {
			System.out.println("안녕하세요~ 제 이름은 "+ name +"입니다.");
		}
		else if(age<30) {
			System.out.println("안녕하십니까. 제 이름은 "+ name +"입니다.");
		}
		
	}
}
