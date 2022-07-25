package quiz;

import java.util.ArrayList;
import java.util.Collections;

public class D01_ArrayListSort {

	// ArrayList에 100개의 랜덤 값을 채운 후 내림차순으로 정렬하여 출력하기
	public static void main(String[] args) {
		
//		ArrayList<String> animals = new ArrayList<String>();
//		
//		animals.add("Monkey");
//		animals.add("Zibra");
//		animals.add("Giraffe");
//		animals.add("Lion");
//		
//		// Collections.sort(list) : 리스트의 내용을 오름차순으로 정렬해주는 메서드
//		Collections.sort(animals);

		// Collections.reverse(list) : 리스트의 내용을 거꾸로 뒤집어주는 메서드
		//Collections.reverse(animals);
//		System.out.println(animals);
		
		// Q. ArrayList에 100개의 랜덤 정수 값을 채운 후 내림차순으로 정렬하여 출력하기
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<100;i++) {
			a.add(i,(int)(Math.random()*1000+1));
		}
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		
		int temp;
		for(int i=0;i<a.size()-1;i++){// 버블 오름차순
			for(int j=0;j<a.size()-1-i;j++) {
				if(a.get(j)>a.get(j+1)) {
					temp=a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1,temp);	
				}
			}		
		}
		System.out.println(a);
		for(int i=0;i<a.size()-1;i++){ // 버블 내림차순
			for(int j=0;j<a.size()-1-i;j++) {
				if(a.get(j)<a.get(j+1)) {
					temp=a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1,temp);	
				}
			}		
		}
		System.out.println(a);
		
		
		
	}
}
