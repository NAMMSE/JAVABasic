import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Collections {

	/*
	  # java.util.Arrays
	  
	   - 배열을 편하게 다룰 수 있는 기능(메서드)들이 모여있는 클래스
	   
	  # java.util.Collections
	  
	   - 컬렉션을 편하게 다룰 수 있는 기능(메서드)들이 모여있는 클래스
	 */
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		
		// Collections.addAll() : 해당 컬렉션에 여러가지 데이터를 한번에 더한다
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
		
		// Collection.addAll(anotherCollection) : 해당 컬렉션에 다른 컬렉션의 모든 데이터를 더한다 / 합집합 개념
		list.addAll(set);
		System.out.println(list);
		
		set.addAll(list);
		System.out.println(set);

		// Collection.removeAll(anotherCollection) : 해당 컬렉션에서 다른 컬렉션의 모든 데이터를 지운다
		Set<String> dislike = new HashSet<>();
		
		dislike.add("orange");
		dislike.add("apple");
		
		list.removeAll(dislike);
		System.out.println("removeAll : "+list);
		
		// Collection.retainAll(anotherCollection) : 해당 컬렉션에서 다른 컬렉션에도 있는 값만 남긴다
		Set<String> friendlike = new HashSet<>();
		friendlike.add("pineapple");
		friendlike.add("apple");
		friendlike.add("banana");
		friendlike.add("watermelon");
		friendlike.add("pear");
		
		list.retainAll(friendlike);
		System.out.println("retainAll : "+list);
		
		//Collections.fill(list, obj) : 전달한 리스트를 원하는 값으로 가득 채운다 
		//Collections.fill(list, "default fruit"); // 문제푸려고 주석처리함
		System.out.println(list);
		
		// Collections.frequency(obj) : 해당 컬렉션에 어떤 값이 몇 개 들어있는지 알아내서 반환한다
		
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
		
		
		// Colletions.rotate() : 리스트를 원하는만큼 순환시킨다 // set은 인덱스가 없어서 순환되지 않음
		
		Collections.sort(list);
		
		for(int i=0 ;i<5 ;i++) {
			Collections.rotate(list, -1);
			System.out.printf("rotate%d : %s\n",i,list);
		}
		
		// Collections.shuffle() : 리스트를 랜덤으로 뒤섞는다
		Collections.shuffle(list);
		System.out.println(list);
		
		// Collections.swap() : 해당 리스트의 두 값을 서로 교체한다
		System.out.println("교체전 : "+list);
		Collections.swap(list, 0,3);
		System.out.println("교체후 : "+list);
		
		// Collections.replaceAll(list, "ineapple", "kiwi") : 해당 리스트의 모든 값을 수정한다
		Collections.replaceAll(list, "pineapple", "kiwi");
		System.out.println(list);
		
		
	}
}
