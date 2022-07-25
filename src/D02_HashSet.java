import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D02_HashSet {

	/*
	  # Set
	  
	   - ������ ������ ���� Ŭ����
	   - ��ҷ� ���� ���� ������ ���� ������� �ʴ´�
	   
	  # Hash
	  
	   - ���� ���� ������ �׻� ������ ���� ������ �ܹ��⼺ �˰���
	   - ��������� ������ ���� �����ϴ� ���� �Ұ����ؾ��Ѵ�
	   - �ߺ� üũ �� ������ ��/���� üũ�� ���� �پ ������ ���δ�
	   - hash�� ������� ������ �������� �ʱ� ������ �ε����� �������� �ʴ´�
	   - Ư�� �������� ������ȣ�� Ȱ��ȴ�
	   
	 */
	public static void main(String[] args) {
		
		//add(item) : List�� Set��� Collection�� �ڽ��̱� ������ ���� ���� �޼��带 ����Ѵ�
		//(add, remove, get �� �������̽�ó�� ����ϴ� ����) 
		HashSet<String> fruits = new HashSet<>();
		ArrayList<String> fruitList = new ArrayList<>(fruits);
		// set���� �ߺ��Ǵ� �����͸� �߰��ص� �˾Ƽ� ���ŵȴ�
		fruits.add("mango");
		fruits.add(new String("mango"));
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("peach");
		fruits.add("soda");
		fruits.add("orange");
		fruits.add("grape");
		fruits.add("grape");
		fruits.add("grape");
		fruits.add("grape");
		fruits.add("grape");
		
		System.out.println(fruits); // ������ ���⶧���� ����ص� add�� ������ ������� �ʴ´�
		
		// HashSet�� �ε����� ��� get()�� ����� �� ���� 
		//fruits.get()
		
		// ������ �Ź� �ٲ� �ε����� �ǹ� ���� ��, ���� ������� ������ ���� �����ϴ�
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("set�� ũ�� : " + fruits.size());
		
		// �÷����� �ٸ� �÷��������� ��ȯ�� �����Ӵ�
		
		
		Collections.sort(fruitList);
		System.out.println(fruitList);
		fruitList.set(1, "apple2");
		System.out.println(fruitList);
		
	}
}
