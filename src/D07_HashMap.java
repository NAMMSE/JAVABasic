import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class D07_HashMap {

	/*
	  # Map
	  
	   - 데이터를 Key-Value 한 쌍으로 저장하는 방식의 자료구조
	   - index 번호 대신 key를 통해 데이터에 접근한다
	   - key는 중복을 허용하지 않는다
	   
	 */
	
	public static void main(String[] args) {
		// 해쉬맵은 제네릭 타입을 반드시 지정해줘야한다/ 둘 다 지정하지 않으면 <object,object>로 들어감
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		// put(K, V) : 해당 키에 값을 저장한다
		map1.put("Age", 10);
		map1.put("Score", 1000);
		map1.put("qty", 5);
		map1.put("cash", 5000);
		System.out.println(map1.size());
		
		map2.put(11,"Age");
		map2.put(13,"Score");
		map2.put(3,"qty");
		map2.put(5,"cash");
		System.out.println(map1);
		System.out.println(map2);
		
		// get(K) : 해당 키값에 해당하는 값을 꺼낸다. 해당 키 또는 값이 없으면 null
		System.out.println(map1.get("Score"));
		System.out.println(map1.get("cash"));
		System.out.println(map1.get("Scor"));
		System.out.println(map2.get(3));
		System.out.println(map2.get(4));
		
		HashMap<String, String> nav = new HashMap<>();
		
		nav.put("우리집", "구리시 교문동");
		nav.put("회사", "구리시 인창동");
		nav.put("거래처1", "구리시 수택동");
		
		// 이미 존재하는 키에 put을 하면 값을 덮어쓴다
		nav.put("회사", "서울시 강남구");
		System.out.println(nav);
		System.out.println(nav.get("우리집"));
		
		//putIfAbsent(K,V) : 해당 키 값이 비어있으면 값을 넣고 null을 리턴
		String value = nav.putIfAbsent("맛집1", "남양주 다산동 11");
		System.out.println(nav);
		System.out.println(value); // 값을 넣고 출력하면 
		
		//해당 키 값에 이미 값이 존재한다면 값을 넣지 않고 들어있던 값을 리턴
		value = nav.putIfAbsent("맛집1", "맥도날드");
		System.out.println(nav);
		System.out.println(value);// 다산동 11 출력
		
		System.out.println("==========");
		// Map은 컬렉션이 아니지만, key 또는 value를 Set 또는 List로 꺼내올 수 있다
		
		
		// key들에 대해서는 중복을 허용하지 않기 때문에 Set으로 받고 value들은 중복이 있을수 있으므로 컬렉션으로 받는다
		// map.KeySet() : 해당 맵의 키들로만 이루어진 Set을 반환한다 - Set
		Set<String> keys = nav.keySet();
		System.out.println("set : "+keys);
		
		// 꺼낸 key들을 반복문으로 활용할 수 있다
		for(String key : keys) {
			//System.out.println(nav.get(key));
			System.out.println(key);
		}
		
		// map.values() : 해당 맵의 값들로만 이루어진 컬렉션을 반환한다
		Collection<String> values = nav.values();
		List<String> valuelist = new ArrayList<>(values);
		
		Collections.sort(valuelist);
		System.out.println(valuelist);
		
		for(String val : values) {
			System.out.println(val);
		}
		
	}
}
