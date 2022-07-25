package quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class D07_CountFruits {

	/*
	  배열에 다음 과일을 랜덤으로 1000개 추가한 후에 각 과일이 몇 번씩 등장했는지 세는 프로그램
	 */
	
	private static String[] fruitnames = {"apple", "banana", "orange", "kiwi","grape","peach","strawberry"};
	
	public static void main(String[] args) {
		
//		//내 코드
//		ArrayList<String> fruit = new ArrayList<>();	// 과일 천개 저장할 스트링형 배열
//		
//		for(int i=0 ;i<1000;i++) { 
//			fruit.add(fruitnames[(int)(Math.random()*fruitnames.length)]); // 과일 천개 저장
//		}		
//		
//		HashMap<String,String> fruits = new HashMap<>(); //각 과일에 키 값 정해줄 해쉬맵 변수 선언
//		for(int i=0;i<fruitnames.length;i++) {	 // 과일 배열 길이만큼 0부터 키로 저장하고 각 과일 이름은 값으로 저장 
//			fruits.put("fruit "+i, fruitnames[i]);
//		}
//		System.out.println(fruits);
//		
//		int[] cnt = new int[fruitnames.length]; // 각 과일의 등장 횟수를 저장할 과일 배열길이의 배열
//		
//		for(int j=0;j<fruitnames.length;j++) { // j번째 키부터 1000번 비교하면서
//			for(int i=0;i<1000;i++) {		   // 해당 키에 해당하는 value와 저장 되어있는 과일 이름이 같으면
//				String f = fruit.get(i);
//				if(f.equals(fruits.get("fruit "+j))) //equals 
//					cnt[j]++;					// 등장횟수 저장할 배열 j번째에 저장 
//			}
//			System.out.printf("%s의 개수 : %d \n",fruits.get("fruit "+j),cnt[j]);
//		}
		
		// 강사님 코드
		
		HashMap<String, Integer> fruitCountMap = new HashMap<>();
		String[] fruits = new String[1000];
		
		for(int i=0;i<fruits.length;i++) {
			fruits[i] = (fruitnames[(int)(Math.random()*fruitnames.length)]);
		}
		
		List<String> fruitList = Arrays.asList(fruits); // 이거 다시 확인
		
		for(int i=0;i<fruitnames.length;i++) { // 이건 과일개수 * 1000번 다 확인하는거라 성능이 안좋음
			fruitCountMap.put(fruitnames[i],Collections.frequency(fruitList, fruitnames[i]));
		}
		for(String fruit : fruits) { // 이건 1000번만 확인하면 끝나는거라 성능이 좋음
			// Map에서 과일이름에 해당하는 과일 개수를 꺼낸다
			// 해당 과일 이름이 등록되어있지 않다면 get을 했을 때 null이 나오는 점을 이용한다
			//Integer cnt = fruitCountMap.get(fruit);
			
			// cnt가 null이라면 처음 나온 과일이므로 값을 1로 등록한다
//			if(cnt==null) {
//				fruitCountMap.put(fruit, 1); // 각 과일 이름이 키 값이므로 중복이 안되니까 1씩 증가할 수 있는것
//			}else {
//				fruitCountMap.put(fruit, cnt + 1);
//			}
			
			Integer cnt = fruitCountMap.putIfAbsent(fruit, 1);
			if(cnt!=null)
				fruitCountMap.put(fruit, cnt+1);
		}
		System.out.println(fruitCountMap);
	}
}
