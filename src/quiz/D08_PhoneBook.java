package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import myobj.phonebook.PersonInfo;

public class D08_PhoneBook {

	/*
	   # HashMap을 이용해 전화번호부 구현
	   
	    1. [그룹/전화번호/개인정보]를 저장해야 한다
	    2. 전화번호부 해쉬맵에 그룹명을 키 값으로 넣으면 해당 그룹의 해쉬맵을 꺼낼 수 있다
	    3. 꺼낸 해쉬맵에 전하번호를 키 값으로 넣으면 그 사람의 개인정보를 꺼낼 수 있다
	    
	   # 구현해야 할 메서드
	    
	    1. 새로운 그룹을 추가하는 메서드
	    2. 존재하는 그룹에 새로운 전화번호 및 개인정보를 등록하는 메서드
	    3. 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	    4. 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	    5. 등록된 모든 정보를 원하는 항목 기준으로 오름/내림차순으로 출력하는 메서드
	 */
	
	HashMap<String, HashMap<String, PersonInfo>> phonebook = new HashMap<>();
	public D08_PhoneBook() {
		phonebook.put("기본", new HashMap<>());
	}
	
	public boolean addgroup(String groupname) {
		if(!phonebook.containsKey(groupname)) {
			phonebook.put(groupname, new HashMap<>());
			return true;
		}
		else
			return false;
	}
	
	
	
	public static void main(String[] args) {
		
	}
	
	
	
	
	
	
	 //==================================
/*   내 코드
  	static HashMap<String, HashMap<String,String>> phoneBook = new HashMap<>();

	static HashMap<String, String> group = new HashMap<>();
	
	public static void addGroup() {
		Scanner sc = new Scanner(System.in);
		System.out.print("추가할 그룹의 그룹명을 입력하세요 >>");
		String group = sc.nextLine();
		phoneBook.put(group, new HashMap<>());
		System.out.println(phoneBook);
	}
	
	public static void addGroupInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호와 개인정보를 등록할 그룹명을 입력하세요 >>");
		String gname = sc.nextLine();
		System.out.print("그룹에 추가할 전화번호를 입력하세요 (000-0000-0000) >>");
		String pnum = sc.nextLine();
		System.out.print("그룹에 추가할 개인정보를 입력하세요 [이름/나이] >>");
		String pinfo = sc.nextLine();
		
		Set<String> keys = phoneBook.keySet();
	//	Collection<HashMap<String,String>> values = phoneBook.values();
	//	List<HashMap<String,String>> valuelist = new ArrayList<>(values);
		Set<String> groupkey = phoneBook.get(gname).keySet();
		Collection<String> values = phoneBook.get(gname).values();
		List<String> valuelist = new ArrayList<>(values);
		
		for(String key : keys) {
			if(gname.equals(key)) {
				HashMap<String, String> groupinfo = new HashMap<>();
				groupinfo.put(pnum, pinfo);
				for(String gkey : groupkey) {
					for(String groupval : valuelist) {
						groupinfo.put(gkey, groupval);

						phoneBook.put(gname, groupinfo);
					}
				}
			}
		}
		System.out.println(phoneBook.get(gname));
		
		//return phoneBook;
	}
	
	
	public static void showName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 사람의 이름을 입력하세요 >>");
		String name = sc.nextLine();
		Collection<String> values = group.values();
		List<String> valuelist = new ArrayList<>(values);
		for(String val : valuelist) {
			//System.out.println(val);
			if(val.contains(name)) {
				System.out.println(val);
			}
		}
	}
	
	public static void showPhonenum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 번호의 일부를 입력하세요 >>");
		String num = sc.nextLine();
		Set<String> pnum = group.keySet();
		for(String key : pnum) {
			if(key.contains(num)) {
				System.out.println(group.get(key));
			}
		}
		
	}
	
	public static void main(String[] args) {
		//HashMap<String, HashMap<String,String>> phoneBook = new HashMap<>();
		//HashMap<String, String> group = new HashMap<>();
		phoneBook.put("친구", group);
		group.put("010-1234-5678", "철수/16");
		group.put("010-1256-7811", "이민/16");
		group.put("010-1234-5862", "세경/14");
		group.put("010-1234-5899", "민수/16");
		group.put("010-1234-5812", "경주/20");
		group.put("010-1234-5843", "민주/27");

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("\n실행할 기능을 입력하세요\n1. 그룹 추가\n2. 전화번호 및 개인정보 등록\n3. 이름 검색\n4. 전화번호 검색\n5. 종료");
			int fun = sc.nextInt();
			switch(fun) {
			case 1:
				addGroup();
				break;
			case 2:
				addGroupInfo();
				break;
			case 3:
				showName();
				break;
			case 4:
				showPhonenum();
				break;
			case 5:
				return;
			}
		}
	} */
}
