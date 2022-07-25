import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class D10_Tree {

	/* 0516 월
	  # TreeSet, TreeMap
	  
	   - Tree : 데이터를 추가하면서 자기 자리를 찾아가는 자료구조 방식
	   - 데이터를 추가하는 동시에 미리 정렬이 되어있기 때문에 추가로 정렬할 필요가 없다
	   - 추가 시 정렬을 해야 하기 때문에 Hash보다는 느리다
	   - 정렬이 되어있기 때문에 Hash와는 다르게 인덱스를 사용할 수 있다
	   
	 */
	public static void main(String[] args) {
		//TreeSet<Integer> numbers = new TreeSet<>();
		TreeSet<Integer> numbers = new TreeSet<>(new Comparator<Integer>() { // 트리셋은 넣으면서 정렬을 하기 때문에 컴퍼레이터로 정렬기준을 따로 정해줄 수 있다
			@Override
			public int compare(Integer o1, Integer o2) {// 내림차순으로 정렬
				return o2.compareTo(o1);
			}
		});
		
//		numbers.add(4);
//		numbers.add(11);
//		numbers.add(5);
//		numbers.add(100);
//		numbers.add(1);
//		numbers.add(60); // 이렇게 막무가내로 넣어도 추가 시 알아서 정렬이 됨
		
		for(int i=0;i<100;i++) {
			numbers.add((int)(Math.random()*1000));
		}
		System.out.println(numbers);
		
		// headset(toElement) : 맨 앞부터 기준점(인덱스 아니고 값)까지의 모든 값들로 이루어진 부분집합을 반환한다
		System.out.println(numbers.headSet(900)); 
		
		// tailSet() : 기준점부터 맨 뒤까지 모든 값들로 이루어진 부분집합을 반환한다
		System.out.println(numbers.tailSet(50));
		
		// subset() : 해당 범위의 부분집합을 반환한다
		System.out.println(numbers.subSet(200, 100));
		
		// pollFirst() : 맨 앞의 값을 삭제하면서 뽑는다
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
		
		System.out.println("50과 가장 가까운 왼쪽 값 : " +numbers.floor(50));
		System.out.println("50과 가장 가까운 오른쪽 값 : " +numbers.ceiling(50));
		
		// TreeMap은 값과 상관없이 키 값을 기준으로 정렬해서 넣는다 (값을 정렬 기준으로 삼을 수 없다)
		TreeMap<String, Integer> treeMap = new TreeMap<>(); // 컴퍼레이터를 넣으려 해도 키값의 데이터 타입 기준으로만 만들 수 있다
		
		treeMap.put("Apple", 1);
		treeMap.put("apple", 5);
		treeMap.put("cat", 12);
		treeMap.put("dog", 1);
		treeMap.put("Mango", 13);
		
		System.out.println(treeMap);
		
		// TreeSet과 유사한 메서드들이 있다
		System.out.println(treeMap.subMap("a", "e")); // 키가 a로 시작하는 키부터 e로 시작하는 키 전까지의 키와 값을 출력함 
		
	}
}




























