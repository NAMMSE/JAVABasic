import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class D07_HashMap {

	/*
	  # Map
	  
	   - �����͸� Key-Value �� ������ �����ϴ� ����� �ڷᱸ��
	   - index ��ȣ ��� key�� ���� �����Ϳ� �����Ѵ�
	   - key�� �ߺ��� ������� �ʴ´�
	   
	 */
	
	public static void main(String[] args) {
		// �ؽ����� ���׸� Ÿ���� �ݵ�� ����������Ѵ�/ �� �� �������� ������ <object,object>�� ��
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		// put(K, V) : �ش� Ű�� ���� �����Ѵ�
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
		
		// get(K) : �ش� Ű���� �ش��ϴ� ���� ������. �ش� Ű �Ǵ� ���� ������ null
		System.out.println(map1.get("Score"));
		System.out.println(map1.get("cash"));
		System.out.println(map1.get("Scor"));
		System.out.println(map2.get(3));
		System.out.println(map2.get(4));
		
		HashMap<String, String> nav = new HashMap<>();
		
		nav.put("�츮��", "������ ������");
		nav.put("ȸ��", "������ ��â��");
		nav.put("�ŷ�ó1", "������ ���õ�");
		
		// �̹� �����ϴ� Ű�� put�� �ϸ� ���� �����
		nav.put("ȸ��", "����� ������");
		System.out.println(nav);
		System.out.println(nav.get("�츮��"));
		
		//putIfAbsent(K,V) : �ش� Ű ���� ��������� ���� �ְ� null�� ����
		String value = nav.putIfAbsent("����1", "������ �ٻ굿 11");
		System.out.println(nav);
		System.out.println(value); // ���� �ְ� ����ϸ� 
		
		//�ش� Ű ���� �̹� ���� �����Ѵٸ� ���� ���� �ʰ� ����ִ� ���� ����
		value = nav.putIfAbsent("����1", "�Ƶ�����");
		System.out.println(nav);
		System.out.println(value);// �ٻ굿 11 ���
		
		System.out.println("==========");
		// Map�� �÷����� �ƴ�����, key �Ǵ� value�� Set �Ǵ� List�� ������ �� �ִ�
		
		
		// key�鿡 ���ؼ��� �ߺ��� ������� �ʱ� ������ Set���� �ް� value���� �ߺ��� ������ �����Ƿ� �÷������� �޴´�
		// map.KeySet() : �ش� ���� Ű��θ� �̷���� Set�� ��ȯ�Ѵ� - Set
		Set<String> keys = nav.keySet();
		System.out.println("set : "+keys);
		
		// ���� key���� �ݺ������� Ȱ���� �� �ִ�
		for(String key : keys) {
			//System.out.println(nav.get(key));
			System.out.println(key);
		}
		
		// map.values() : �ش� ���� ����θ� �̷���� �÷����� ��ȯ�Ѵ�
		Collection<String> values = nav.values();
		List<String> valuelist = new ArrayList<>(values);
		
		Collections.sort(valuelist);
		System.out.println(valuelist);
		
		for(String val : values) {
			System.out.println(val);
		}
		
	}
}
