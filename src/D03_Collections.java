import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Collections {

	/*
	  # java.util.Arrays
	  
	   - �迭�� ���ϰ� �ٷ� �� �ִ� ���(�޼���)���� ���ִ� Ŭ����
	   
	  # java.util.Collections
	  
	   - �÷����� ���ϰ� �ٷ� �� �ִ� ���(�޼���)���� ���ִ� Ŭ����
	 */
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		
		// Collections.addAll() : �ش� �÷��ǿ� �������� �����͸� �ѹ��� ���Ѵ�
		Collections.addAll(list, "pineapple", "pineapple", "red orange", "pear");
		
		list.add("apple");
		list.add("apple");
		list.add("banana");
		list.add("peach");
		list.add("orange");
		
		Collections.addAll(set, "banana","apple","melon");
		
		set.add("melon");
		set.add("melon");
		set.add("watermelon");
		set.add("berry");
		set.add("pepper");
		
		System.out.println(list);
		System.out.println(set);
		
		// Collection.addAll(anotherCollection) : �ش� �÷��ǿ� �ٸ� �÷����� ��� �����͸� ���Ѵ� / ������ ����
		list.addAll(set);
		System.out.println(list);
		
		set.addAll(list);
		System.out.println(set);

		// Collection.removeAll(anotherCollection) : �ش� �÷��ǿ��� �ٸ� �÷����� ��� �����͸� �����
		Set<String> dislike = new HashSet<>();
		
		dislike.add("orange");
		dislike.add("apple");
		
		list.removeAll(dislike);
		System.out.println("removeAll : "+list);
		
		// Collection.retainAll(anotherCollection) : �ش� �÷��ǿ��� �ٸ� �÷��ǿ��� �ִ� ���� �����
		Set<String> friendlike = new HashSet<>();
		friendlike.add("pineapple");
		friendlike.add("apple");
		friendlike.add("banana");
		friendlike.add("watermelon");
		friendlike.add("pear");
		
		list.retainAll(friendlike);
		System.out.println("retainAll : "+list);
		
		//Collections.fill(list, obj) : ������ ����Ʈ�� ���ϴ� ������ ���� ä��� 
		//Collections.fill(list, "default fruit"); // ����Ǫ���� �ּ�ó����
		System.out.println(list);
		
		// Collections.frequency(obj) : �ش� �÷��ǿ� � ���� �� �� ����ִ��� �˾Ƴ��� ��ȯ�Ѵ�
		
		int frq = Collections.frequency(set, "apple");
		System.out.println(frq);
		
		list.set(3,"apple");
		list.set(4,"apple");
		list.set(5,"apple");
		int frq2 = Collections.frequency(list, "apple");
		System.out.println(frq2);
		
		List<myobj.Police> polices = new ArrayList<>();
		
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		
		System.out.println(polices);
		
		
		// Colletions.rotate() : ����Ʈ�� ���ϴ¸�ŭ ��ȯ��Ų�� // set�� �ε����� ��� ��ȯ���� ����
		
		Collections.sort(list);
		
		for(int i=0 ;i<5 ;i++) {
			Collections.rotate(list, -1);
			System.out.printf("rotate%d : %s\n",i,list);
		}
		
		// Collections.shuffle() : ����Ʈ�� �������� �ڼ��´�
		Collections.shuffle(list);
		System.out.println(list);
		
		// Collections.swap() : �ش� ����Ʈ�� �� ���� ���� ��ü�Ѵ�
		System.out.println("��ü�� : "+list);
		Collections.swap(list, 0,3);
		System.out.println("��ü�� : "+list);
		
		// Collections.replaceAll(list, "ineapple", "kiwi") : �ش� ����Ʈ�� ��� ���� �����Ѵ�
		Collections.replaceAll(list, "pineapple", "kiwi");
		System.out.println(list);
		
		
	}
}
