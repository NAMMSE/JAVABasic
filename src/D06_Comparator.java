import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_Comparator {

	/*
	  # Comparable
	  
	   - 이 인터페이스를 구현한 클래스는 서로 크기 비교가 가능한 클래스가 된다
	   
	  # Comparator
	  
	   - 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다
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
		System.out.println((int)'갈');
		System.out.println((int)'길');
		
		grapes.add(new Grape(2800, 55, 2, "프랑스"));
		grapes.add(new Grape(3000, 33, 1, "프랑"));
		grapes.add(new Grape(3200, 28, 3, "칠칠"));
		grapes.add(new Grape(3000, 33, 1, "가나"));
		grapes.add(new Grape(3000, 33, 1, "대한민국"));
		grapes.add(new Grape(3100, 28, 3, "스위스위스"));
		grapes.add(new Grape(3200, 31, 1, "칠레"));
		grapes.add(new Grape(3300, 50, 1, "스페인"));
		grapes.add(new Grape(3300, 51, 0, "우루과이"));
		grapes.add(new Grape(3100, 28, 3, "스위스"));
		grapes.add(new Grape(3200, 31, 1, "칠레"));
		//System.out.println(grapes);
		// Integer에는 sort의 기준이 있지만, Grape에는 기준을 직접 작성해야한다.
		// Collections.sort(grapes); 내가 만든 클래스는 기준이 없기 때문에 sort가 안됨
		System.out.println(grapes);
		Collections.sort(grapes);
		System.out.println(grapes);
		System.out.println(grapes.get(0).compareTo(grapes2.get(0)));
		
		//다른 Comparator 사용하기
		Collections.sort(grapes, new 포도분류기());
		System.out.println(grapes);
		
		
	}
}

class 포도분류기 implements Comparator<Grape>{
	public int compare(Grape g1, Grape g2) {
		return g1.price != g2.price ? g1.price - g2.price : (g2.qty-g1.qty);
	}
}
						// Comparable 인터페이스는 제네릭 타입을 지정하지 않으면 기본적으로 매개변수로 object를 받고 지정해주면
						// 따로 컴페어투 메서드에서 매개변수를 Grape타입으로 다운캐스팅 하지 않아도 됨
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
		  # compareTo의 규칙
		   
		   - 현재 인스턴스와 매개변수로 전달되는 다음 인스턴스를 비교한다
		   - 두 인스턴스의 비교 결과에 따라 알맞은 정수를 리턴해야한다
		   - 현재 인스턴스가 매개변수로 전달된 인스턴스보다 왼쪽에 있어야 한다면 -1을 리턴해야한다 (또는 음수)
		   - 현재 인스턴스가 매개변수로 전달된 인스턴스보다 오른쪽에 있어야 한다면 1을 리턴해야한다 (또는 양수)
		   - 두 인스턴스의 크기가 같다면 0을 리턴해야 한다
		 */
		
		// 클래스 선언부에서 제네릭 타입 지정해주면 안해줘도 된다
		Grape g = (Grape)o; // 비교는 포도끼리 하기때문에 매개변수인 o를 grape으로 다운캐스팅  
		
		// 연습문제 : 가격 기준으로 오름차순 정렬되게 바꾸기 / 가격이 같을 때는 개수 기준으로 내림차순 정렬
		// 심화문제 : 원산지 이름 기준으로 오름차순 정렬
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
		//내코드
//		char[] tori = this.origin.toCharArray();
//		char[] gori = g.origin.toCharArray();
//		if(tori.length<gori.length) {// 앞 원산지의 길이보다 뒤 원산지의 길이가 길때
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
//		else if(tori.length>gori.length) {// 앞 원산지의 길이보다 뒤 원산지의 길이가 짧을때
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
//		else {// 앞 원산지의 길이와 뒤 원산지의 길이가 같을때
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
	// Integer, String 등의 기본 클래스들은 Comparable이 구현되어 있기 때문에 직접 구현할 필요가 없다
		@Override
		public int compareTo(Grape o) {
			return origin.compareTo(o.origin);
		}
	
}


