package myobj;

public class C09_PublicClass {
	
	public int a1 = 10;
	protected int a2 = 11;
	int a3 = 12;
	private int a4 = 13;
	
	public void m1() { 
		System.out.println(a4);
	}
	protected void m2() { 
		System.out.println(a4);
	}
	void m3() {
		System.out.println(a4);
	}
	private void m4() {
		System.out.println(a4);
	}

}
