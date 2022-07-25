import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_Comparator {

	/*
	  # Comparable
	  
	   - �� �������̽��� ������ Ŭ������ ���� ũ�� �񱳰� ������ Ŭ������ �ȴ�
	   
	  # Comparator
	  
	   - �� �������̽��� ������ Ŭ������ ũ�� ���� ������ �ȴ�
	 */
	
	public static void main(String[] args) {
		ArrayList<Grape> grapes = new ArrayList<Grape>();
		ArrayList<Grape> grapes2 = new ArrayList<Grape>();
		
		grapes2.add(new Grape(2000,20,1,"6"));
//		ArrayList<Integer> num = new ArrayList<>();
//		
//		num.add(1);
//		num.add(2);
//		num.add(4);
//		num.add(-1);
//		num.add(6);
//		
//		Collections.sort(num); 
//		System.out.println(num);
		System.out.println((int)'��');
		System.out.println((int)'��');
		
		grapes.add(new Grape(2800, 55, 2, "������"));
		grapes.add(new Grape(3000, 33, 1, "����"));
		grapes.add(new Grape(3200, 28, 3, "ĥĥ"));
		grapes.add(new Grape(3000, 33, 1, "����"));
		grapes.add(new Grape(3000, 33, 1, "���ѹα�"));
		grapes.add(new Grape(3100, 28, 3, "����������"));
		grapes.add(new Grape(3200, 31, 1, "ĥ��"));
		grapes.add(new Grape(3300, 50, 1, "������"));
		grapes.add(new Grape(3300, 51, 0, "������"));
		grapes.add(new Grape(3100, 28, 3, "������"));
		grapes.add(new Grape(3200, 31, 1, "ĥ��"));
		//System.out.println(grapes);
		// Integer���� sort�� ������ ������, Grape���� ������ ���� �ۼ��ؾ��Ѵ�.
		// Collections.sort(grapes); ���� ���� Ŭ������ ������ ���� ������ sort�� �ȵ�
		System.out.println(grapes);
		Collections.sort(grapes);
		System.out.println(grapes);
		System.out.println(grapes.get(0).compareTo(grapes2.get(0)));
		
		//�ٸ� Comparator ����ϱ�
		Collections.sort(grapes, new �����з���());
		System.out.println(grapes);
		
		
	}
}

class �����з��� implements Comparator<Grape>{
	public int compare(Grape g1, Grape g2) {
		return g1.price != g2.price ? g1.price - g2.price : (g2.qty-g1.qty);
	}
}
						// Comparable �������̽��� ���׸� Ÿ���� �������� ������ �⺻������ �Ű������� object�� �ް� �������ָ�
						// ���� ������� �޼��忡�� �Ű������� GrapeŸ������ �ٿ�ĳ���� ���� �ʾƵ� ��
class Grape implements Comparable<Grape>{
	static String[] colors = {"0x48258A", "0x00C72E", "0x00C72E", "0x00C72E","0x00C72E"}; 
	
	int price;
	int qty;
	int color;
	String origin;
	
	public Grape(int price, int qty, int color, String origin) {
	
		this.price = price;
		this.qty = qty;
		this.color= color;
		this.origin = origin;
	}
	
	@Override
	public String toString() {
		return String.format("%d/%d/%s/%s\n", price,qty,colors[color],origin);
	}

	
	public int compareTooo(Object o) {
		/*
		  # compareTo�� ��Ģ
		   
		   - ���� �ν��Ͻ��� �Ű������� ���޵Ǵ� ���� �ν��Ͻ��� ���Ѵ�
		   - �� �ν��Ͻ��� �� ����� ���� �˸��� ������ �����ؾ��Ѵ�
		   - ���� �ν��Ͻ��� �Ű������� ���޵� �ν��Ͻ����� ���ʿ� �־�� �Ѵٸ� -1�� �����ؾ��Ѵ� (�Ǵ� ����)
		   - ���� �ν��Ͻ��� �Ű������� ���޵� �ν��Ͻ����� �����ʿ� �־�� �Ѵٸ� 1�� �����ؾ��Ѵ� (�Ǵ� ���)
		   - �� �ν��Ͻ��� ũ�Ⱑ ���ٸ� 0�� �����ؾ� �Ѵ�
		 */
		
		// Ŭ���� ����ο��� ���׸� Ÿ�� �������ָ� �����൵ �ȴ�
		Grape g = (Grape)o; // �񱳴� �������� �ϱ⶧���� �Ű������� o�� grape���� �ٿ�ĳ����  
		
		// �������� : ���� �������� �������� ���ĵǰ� �ٲٱ� / ������ ���� ���� ���� �������� �������� ����
		// ��ȭ���� : ������ �̸� �������� �������� ����
//		if(this.price>g.price) {
//			return 1;
//		}
//		else if(this.price<g.price) {
//			return -1;
//		}
//		else {
//			if(this.qty>g.qty) {
//				return -1;
//			}
//			if(this.qty<g.qty) {
//				return 1;
//			}
//			return 0;
//		}
		//���ڵ�
//		char[] tori = this.origin.toCharArray();
//		char[] gori = g.origin.toCharArray();
//		if(tori.length<gori.length) {// �� �������� ���̺��� �� �������� ���̰� �涧
//			for(int i=0;i<tori.length;i++) {
//				if(((int)tori[i]>(int)gori[i])&&tori[i]!=gori[i]) {
//					return 1;
//				}
//				else if((int)tori[i]<(int)gori[i]&&tori[i]!=gori[i]) {
//					return -1;
//				}
//				else if(tori[i]==gori[i]) {
//					if(i==tori.length-1)
//						return -1;
//					continue;
//				}
//				else
//					return 0;
//			}
//		}
//		else if(tori.length>gori.length) {// �� �������� ���̺��� �� �������� ���̰� ª����
//			for(int i=0;i<gori.length;i++) {
//				if((int)tori[i]>(int)gori[i]&&tori[i]!=gori[i]) {
//					return 1;
//				}
//				else if((int)tori[i]<(int)gori[i]&&tori[i]!=gori[i]) {
//					return -1;
//				}
//				else if(tori[i]==gori[i]) {
//					if(i==tori.length-1)
//						return 1;
//					continue;
//				}
//				else
//					return 0;
//			}
//		}
//		else {// �� �������� ���̿� �� �������� ���̰� ������
//			for(int i=0;i<tori.length;i++) {
//				if((int)tori[i]>(int)gori[i]&&tori[i]!=gori[i]) {
//					return 1;
//				}
//				else if((int)tori[i]<(int)gori[i]&&tori[i]!=gori[i]) {
//					return -1;
//				}
//				else if(tori[i]==gori[i]) {
//					continue;
//				}
//				else
//					return 0;
//			}
//		}
//		return 0;
		
		int len1 =origin.length();
		int len2 =g.origin.length();
		int len = len1<len2 ? len1:len2;
		
		for(int i=0;i<len;i++) {
			char ch1=origin.charAt(i);
			char ch2=g.origin.charAt(i);
			if(ch1>ch2) {
				return 1;
			}
			else if (ch1<ch2) {
				return -1;
			}
		}
		if(len1>len2) {
			return -1;
		}
		else if(len1<len2) {
			return 1;
		}
		return 0;
		
		
	}
	// Integer, String ���� �⺻ Ŭ�������� Comparable�� �����Ǿ� �ֱ� ������ ���� ������ �ʿ䰡 ����
		@Override
		public int compareTo(Grape o) {
			return origin.compareTo(o.origin);
		}
	
}


