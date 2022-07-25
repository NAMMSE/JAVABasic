
public class C02_OOP {

	/*
	  # ��ü�������α׷�(Object Oriented Programming)
	  
	   - ���� �����ϴ� ��� ��(��ü)���� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	   - ������ �Լ��� ���к��ϰ� ����ϴ� �ͺ��� ���ǿ� �����ϴ� ��ü ������ ��� ǥ���ϴ� ���� �����ڵ��� ȿ���� ���δ�
	   - �ش� ��ü�� �����ϴ� ������ �������, �ʵ�(Field), �Ӽ�(Attribute) ������ �θ���
	   - �ش� ��ü�� �ʵ带 ��ȭ��ų �� �ִ� ��ü ������ �Լ����� �޼����� �θ���
	   
	   ex : ���
	   
	    - ����� ���� : ũ��, ����, �絵, Į�θ�, ���, ������ ...
	    - ����� �޼��� (������ ��ȭ��Ű�� �͵�)
	      ����� �Դ´� : ũ�� �� Į�θ� �� ���� ����� Į�θ� ��
	      ����� ������ : ����� ũ��� �浵�� �˸´� �������� ���Ѵ�
	      ����� �����Ѵ� : ����� ��������� õõ�� �����Ѵ�
	      
	  # Ŭ����(class)
	  
	   - ������ ��ü�� ���α׷��� ���� ǥ���� ����
	   - Ŭ������ �ش� ��ü�� ���赵 ������ �Ѵ� 
	   - Ŭ������ ������ ���������� ��ü�� ����
	   - Ŭ������ �̿��� ���� ���� ��ü�� '�ν��Ͻ�(instance)'��� �θ���
	   - Ŭ������ �̿��� �ν��Ͻ��� ������ ���� new�� ����Ѵ�
	   - ��� Ŭ������ ������ ���� Ÿ���̴�
	   - ���� ��Ű�� ���ο��� ������ �̸��� Ŭ������ ������ �� ����
	  
	 */
	public static void main(String[] args) {
		
		// ��� Ŭ������ ��� �ν��Ͻ� ����
//		Apple a1 = new Apple();
//		Apple a2 = new Apple();
//		// .�� �� �ش� �ν��Ͻ��� �ʵ尪�� ����� �� �ִ�.
//		a1.size = 20;
//		a1.sweet = 8;
//		a1.color = "red";
//		a1.calrorie = 200.0;
//		
//		a1.eat();
//		
//		System.out.println("a1�� size : "+a1.size );
//		System.out.println("a1�� �絵 : " + a1.sweet);
//		System.out.println("a1�� Į�θ� : "+a1.calrorie);
//		System.out.println("a2�� Į�θ� : "+a2.calrorie);
//		
//		a1.info();
//		a2.info();
//		
//		a2.setColor("Black");
		
//		Me i = new Me();
//		
//		i.age = 27;
//		i.weight = 68;
//		i.height = 175;
//		i.name = "�ڼ���";
//		i.sex = '��';
//	
//		i.info();
//		i.diet();
//		i.info();
//		
		//------------------------------------------------------
		
//		Subway sub1 = new Subway();
//		Subway sub2 = new Subway();
//		
//		sub1.line = 1;
//		sub1.current_station=3;
//			
//		sub2.line = 7;
//		sub2.current_station=0;
//	
//		sub1.info();
//		sub2.info();
//		
//		for(int i =0; i<10 ; i++) {
//			sub1.next();
//			sub1.info();		
//		}
		
		Me i2 = new Me(27,76,176,"�ڼ���",'��');
		Me i3 = new Me();
		
		i2.print();
		i3.print();
		
	}	
	
}


class Apple{
	/*
	  # �ν��Ͻ� ����
	   
	   - Ŭ���� ���ο� ������ ����
	   - �� �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ����
	   - aka. �ʵ�, �Ӽ�, ���, ����, ...
	 */
	int size;
	int sweet;
	double calrorie;
	String color;
	
	/*
	  # �ν��Ͻ� �޼���
	  
	   - Ŭ���� ���ο� ������ �Լ�
	   - �ַ� �ش� �ν��Ͻ� ������ ��ȭ��Ű�� ������ �Ѵ�
	   
	  # this
	  
	   - ���� �ν��Ͻ� �ڱ� �ڽ��� ����Ű�� ����
	   - ������ �����ϴ�
	 */
	
	void eat() {
		size--;
		calrorie-=-5;
	}
	
	//�ʵ��� �޼����� �Ű��������� ������ �̸��� ���� �� this�� ����� �ݵ�� ��������� �Ѵ�
	void setColor(String color) {
		this.color = color;
	}
	
	void info() {
		System.out.println(" - - - �� ����� ���� - - -");
		System.out.println("ũ��\t: "+size);
		System.out.println("�絵\t: "+sweet);
		System.out.println("Į�θ�\t: "+calrorie);
		System.out.println("����\t: "+color);
		
	}
	
}


/*
  ���� ���� : ���ǿ� �����ϴ� ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� �ν��Ͻ��� �����ϰ� ������ ����غ�����
 */

class Me{
	
	int age;
	int weight;
	int height;
	String name;
	char sex;
	
	Me(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	Me(int age, int weight, int height, String name, char sex){
		this.age=age;
		this.name=name;

		this.height=height;
		this.weight=weight;
		this.sex=sex;

	}
	
//	Me(){
//		age=27;
//		weight=68;
//		height=175;
//		name="�ڼ���";
//		sex='��';
//	}
	
	Me(){
		this(30,79,178,"���ƹ�",'��');
	}
	
	void print() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("������ : "+weight);
		System.out.println("Ű : "+height);
		System.out.println("���� : "+sex);
	}
	
	void diet() {
		weight--;
	}
	
	
	void info() {
		System.out.println("- - - ���� ���� - - -");
		System.out.println("���� ����: " + age);
		System.out.println("���� ������: " + weight);
		System.out.println("���� Ű: " + height);
		System.out.println("���� �̸�: " + name);
		System.out.println("���� ����: " + sex);
	}
	
	
}

class Subway{
	String[] subway_color = {"����","���","��Ȳ��","�ϴû�","�����","����","£�����"};
	
	String[][] subway_map = {
			{"��õ","����õ","����","������","��ȭ","�־�","����","����","���"},
			{"��ġ��","�����װŸ�","��õ��û","����õ","����","�ŵ���"},
			{},
			{},
			{},
			{},
			{"�����","�Ŵ���Ÿ�","��¹��","��","���Ǵ��Ա�","����"}
	};
	
	
	int line;
	int current_station;
	boolean direction = true;
	
	void next(){
		
		//�����ϴ� ������ �� �� ������ ���̰ų�
		// �����ϴ� ������ �� �� ���� ���̶�� ������ �ٲ۴�.
		if(direction && current_station + 1 == subway_map[line-1].length|| (!direction && current_station == 0)) {
			direction = !direction;
		}
		
		
		if(direction) {
			current_station++;
		}
		else {
			current_station--;
		}
		
	}
	
	
	void info() {
		System.out.println("[���� ����]");
		System.out.println("line : "+line +"ȣ��");
		System.out.println("���� : " + subway_color[line-1]);
		System.out.println("���� ������ : "+subway_map[line-1][current_station]);
	}
	
}
























