package quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class D07_CountFruits {

	/*
	  �迭�� ���� ������ �������� 1000�� �߰��� �Ŀ� �� ������ �� ���� �����ߴ��� ���� ���α׷�
	 */
	
	private static String[] fruitnames = {"apple", "banana", "orange", "kiwi","grape","peach","strawberry"};
	
	public static void main(String[] args) {
		
//		//�� �ڵ�
//		ArrayList<String> fruit = new ArrayList<>();	// ���� õ�� ������ ��Ʈ���� �迭
//		
//		for(int i=0 ;i<1000;i++) { 
//			fruit.add(fruitnames[(int)(Math.random()*fruitnames.length)]); // ���� õ�� ����
//		}		
//		
//		HashMap<String,String> fruits = new HashMap<>(); //�� ���Ͽ� Ű �� ������ �ؽ��� ���� ����
//		for(int i=0;i<fruitnames.length;i++) {	 // ���� �迭 ���̸�ŭ 0���� Ű�� �����ϰ� �� ���� �̸��� ������ ���� 
//			fruits.put("fruit "+i, fruitnames[i]);
//		}
//		System.out.println(fruits);
//		
//		int[] cnt = new int[fruitnames.length]; // �� ������ ���� Ƚ���� ������ ���� �迭������ �迭
//		
//		for(int j=0;j<fruitnames.length;j++) { // j��° Ű���� 1000�� ���ϸ鼭
//			for(int i=0;i<1000;i++) {		   // �ش� Ű�� �ش��ϴ� value�� ���� �Ǿ��ִ� ���� �̸��� ������
//				String f = fruit.get(i);
//				if(f.equals(fruits.get("fruit "+j))) //equals 
//					cnt[j]++;					// ����Ƚ�� ������ �迭 j��°�� ���� 
//			}
//			System.out.printf("%s�� ���� : %d \n",fruits.get("fruit "+j),cnt[j]);
//		}
		
		// ����� �ڵ�
		
		HashMap<String, Integer> fruitCountMap = new HashMap<>();
		String[] fruits = new String[1000];
		
		for(int i=0;i<fruits.length;i++) {
			fruits[i] = (fruitnames[(int)(Math.random()*fruitnames.length)]);
		}
		
		List<String> fruitList = Arrays.asList(fruits); // �̰� �ٽ� Ȯ��
		
		for(int i=0;i<fruitnames.length;i++) { // �̰� ���ϰ��� * 1000�� �� Ȯ���ϴ°Ŷ� ������ ������
			fruitCountMap.put(fruitnames[i],Collections.frequency(fruitList, fruitnames[i]));
		}
		for(String fruit : fruits) { // �̰� 1000���� Ȯ���ϸ� �����°Ŷ� ������ ����
			// Map���� �����̸��� �ش��ϴ� ���� ������ ������
			// �ش� ���� �̸��� ��ϵǾ����� �ʴٸ� get�� ���� �� null�� ������ ���� �̿��Ѵ�
			//Integer cnt = fruitCountMap.get(fruit);
			
			// cnt�� null�̶�� ó�� ���� �����̹Ƿ� ���� 1�� ����Ѵ�
//			if(cnt==null) {
//				fruitCountMap.put(fruit, 1); // �� ���� �̸��� Ű ���̹Ƿ� �ߺ��� �ȵǴϱ� 1�� ������ �� �ִ°�
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
