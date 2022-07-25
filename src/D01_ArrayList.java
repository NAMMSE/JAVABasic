import java.util.ArrayList;

public class D01_ArrayList {

	/*
	  # �ڷᱸ��
	  
	   - �����͸� ȿ�������� �����ϴ� ��Ŀ� ���� ��� ��
	   - ��Ȳ���� ������ ȿ���� ���� �ڷᱸ���� �ִ�.
	   
	  # Java Collection Interface
	  
	   - �÷����� �ڹٿ��� �����ϴ� �ڷᱸ�� �������̽��̴�
	   - �÷��ǳ����� �������� �ٸ� �÷������� ��ȯ�� �����ϴ�
	   - �÷��� �������̽��� ������ Ŭ�����δ� List, set ���� �ִ�
	   
	  # java.util.ArrayList
	  
	   - �迭�� ���������� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ���� ������ Ŭ����
	   - �迭ó�� �����͸� ���������� �����Ѵ�
	   - ��� �����͸� ������� �����ϴ� �ӵ��� ���� ���� �÷����̴�
	 */
	
	public static void main(String[] args) {
		
		// 1. Ÿ���� �������� �ʰ� ArrayList �����ϱ�
		ArrayList list1 = new ArrayList();
		
		// add(item): ����Ʈ�� �� �ڿ� ���ϴ� �����͸� �߰��Ѵ�.
		list1.add(10);// �迭�ȿ� �������� Ÿ���� ObjectŸ�� (Object)�� ��� �������� �θ� Ŭ�����̹Ƿ� ������ Ÿ���� ���� 
		list1.add(11);// ��ȯ ���� boolean Ÿ���̴�.
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);		
		list1.add("��");

		
		// list.add(index, item) : ����Ʈ�� ���ϴ� ��ġ�� �����͸� �߰��Ѵ�
		list1.add(3,"�ް�");
		
		System.out.println(list1);
		
		// get(index) : ����Ʈ���� �ش� �ε����� �����͸� �ϳ� ������ �޼���
		System.out.println(list1.get(5));
		
		// Object Ÿ������ ��ĳ���� �Ǿ� �ִ� int
		Object obj = list1.get(0);
		
		//�ٿ� ĳ���� �� Ÿ���� �ٸ��� ������ �߻��� �� �־ �����ϴ�
		int a = (int)obj;
		
		System.out.println(a);
		
		// 2. Ÿ���� �����ϸ� ArrayList �����ϱ� (���׸�)
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("������");
		list2.add("�����");
		list2.add("�⸰");
		list2.add("����");
		list2.add(2,"�罿");
		
		System.out.println(list2);
		
		// ���׸� ���ο��� �⺻�� Ÿ���� ����� �� ����.(int, short, ....)
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
		
		// list.size() : �ش� ����Ʈ�� ũ�⸦ ��ȯ�Ѵ�
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		System.out.println(list4.size());
		
		// list.contains(item) : ����Ʈ�� �ش� ���� ���ԵǾ��ִ��� ���� true false�� ��ȯ�Ѵ�
		System.out.println("����Ʈ�� ���ڰ� �ֳ���? "+list2.contains("����"));
		
		// list.indexOf(item) : ����Ʈ���� �ش� ���� ��ġ�� ��ȯ�Ѵ�. ã�� ���ϸ� -1�� ��ȯ�Ѵ�
		System.out.println(list1.indexOf("��"));
		System.out.println(list2.indexOf("�⸰"));
		
		// list.set(index, item) : ����Ʈ�� �ش� ��ġ�� ���� �����Ѵ�.
		list2.set(2, "ġŸ");
		System.out.println("������"+list2);
		
		// list.remove(index) : �ش� ��° ������ �����ϰ�, ���� ������ ��ȯ�Ѵ�
		// list.remove(object) : �ش� ������ �����ϰ�, ���� ���θ� ��ȯ�Ѵ�
		
		
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
