import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class D10_Tree {

	/* 0516 ��
	  # TreeSet, TreeMap
	  
	   - Tree : �����͸� �߰��ϸ鼭 �ڱ� �ڸ��� ã�ư��� �ڷᱸ�� ���
	   - �����͸� �߰��ϴ� ���ÿ� �̸� ������ �Ǿ��ֱ� ������ �߰��� ������ �ʿ䰡 ����
	   - �߰� �� ������ �ؾ� �ϱ� ������ Hash���ٴ� ������
	   - ������ �Ǿ��ֱ� ������ Hash�ʹ� �ٸ��� �ε����� ����� �� �ִ�
	   
	 */
	public static void main(String[] args) {
		//TreeSet<Integer> numbers = new TreeSet<>();
		TreeSet<Integer> numbers = new TreeSet<>(new Comparator<Integer>() { // Ʈ������ �����鼭 ������ �ϱ� ������ ���۷����ͷ� ���ı����� ���� ������ �� �ִ�
			@Override
			public int compare(Integer o1, Integer o2) {// ������������ ����
				return o2.compareTo(o1);
			}
		});
		
//		numbers.add(4);
//		numbers.add(11);
//		numbers.add(5);
//		numbers.add(100);
//		numbers.add(1);
//		numbers.add(60); // �̷��� ���������� �־ �߰� �� �˾Ƽ� ������ ��
		
		for(int i=0;i<100;i++) {
			numbers.add((int)(Math.random()*1000));
		}
		System.out.println(numbers);
		
		// headset(toElement) : �� �պ��� ������(�ε��� �ƴϰ� ��)������ ��� ����� �̷���� �κ������� ��ȯ�Ѵ�
		System.out.println(numbers.headSet(900)); 
		
		// tailSet() : ���������� �� �ڱ��� ��� ����� �̷���� �κ������� ��ȯ�Ѵ�
		System.out.println(numbers.tailSet(50));
		
		// subset() : �ش� ������ �κ������� ��ȯ�Ѵ�
		System.out.println(numbers.subSet(200, 100));
		
		// pollFirst() : �� ���� ���� �����ϸ鼭 �̴´�
		TreeSet<Integer> subset = new TreeSet<>(numbers.subSet(300, 200));
		System.out.println("##### subset pollFirst() #####");
		System.out.println(subset);
		while(subset.pollFirst()!=null) {
			System.out.println(subset);
		}
		
		TreeSet<Integer> subset2 = new TreeSet<>(numbers.subSet(300, 200));
		System.out.println("##### subset pollLast() #####");
		System.out.println(subset2);
		while(subset2.pollLast()!=null) {
			System.out.println(subset2);
		}
		
		System.out.println("50�� ���� ����� ���� �� : " +numbers.floor(50));
		System.out.println("50�� ���� ����� ������ �� : " +numbers.ceiling(50));
		
		// TreeMap�� ���� ������� Ű ���� �������� �����ؼ� �ִ´� (���� ���� �������� ���� �� ����)
		TreeMap<String, Integer> treeMap = new TreeMap<>(); // ���۷����͸� ������ �ص� Ű���� ������ Ÿ�� �������θ� ���� �� �ִ�
		
		treeMap.put("Apple", 1);
		treeMap.put("apple", 5);
		treeMap.put("cat", 12);
		treeMap.put("dog", 1);
		treeMap.put("Mango", 13);
		
		System.out.println(treeMap);
		
		// TreeSet�� ������ �޼������ �ִ�
		System.out.println(treeMap.subMap("a", "e")); // Ű�� a�� �����ϴ� Ű���� e�� �����ϴ� Ű �������� Ű�� ���� ����� 
		
	}
}




























