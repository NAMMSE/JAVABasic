package myobj;

public class Police extends Person{

	public String name;
	public int age;

//	public void hi() {
//		super.sayhi();
//	}
	
	//@Override
	public void sayhi() {
		System.out.println("�ȳ��Ͻʴϱ� !~ " + name +"�Դϴ�.");
	}
	
	public void setName(String name) {
		super.name = name;
	}
	public void setAge(int age) {
		super.age = age;
	}
}
