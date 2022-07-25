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
	   # HashMap�� �̿��� ��ȭ��ȣ�� ����
	   
	    1. [�׷�/��ȭ��ȣ/��������]�� �����ؾ� �Ѵ�
	    2. ��ȭ��ȣ�� �ؽ��ʿ� �׷���� Ű ������ ������ �ش� �׷��� �ؽ����� ���� �� �ִ�
	    3. ���� �ؽ��ʿ� ���Ϲ�ȣ�� Ű ������ ������ �� ����� ���������� ���� �� �ִ�
	    
	   # �����ؾ� �� �޼���
	    
	    1. ���ο� �׷��� �߰��ϴ� �޼���
	    2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ �� ���������� ����ϴ� �޼���
	    3. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
	    4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
	    5. ��ϵ� ��� ������ ���ϴ� �׸� �������� ����/������������ ����ϴ� �޼���
	 */
	
	HashMap<String, HashMap<String, PersonInfo>> phonebook = new HashMap<>();
	public D08_PhoneBook() {
		phonebook.put("�⺻", new HashMap<>());
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
/*   �� �ڵ�
  	static HashMap<String, HashMap<String,String>> phoneBook = new HashMap<>();

	static HashMap<String, String> group = new HashMap<>();
	
	public static void addGroup() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰��� �׷��� �׷���� �Է��ϼ��� >>");
		String group = sc.nextLine();
		phoneBook.put(group, new HashMap<>());
		System.out.println(phoneBook);
	}
	
	public static void addGroupInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ��ȣ�� ���������� ����� �׷���� �Է��ϼ��� >>");
		String gname = sc.nextLine();
		System.out.print("�׷쿡 �߰��� ��ȭ��ȣ�� �Է��ϼ��� (000-0000-0000) >>");
		String pnum = sc.nextLine();
		System.out.print("�׷쿡 �߰��� ���������� �Է��ϼ��� [�̸�/����] >>");
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
		System.out.print("�˻��� ����� �̸��� �Է��ϼ��� >>");
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
		System.out.print("�˻��� ��ȣ�� �Ϻθ� �Է��ϼ��� >>");
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
		phoneBook.put("ģ��", group);
		group.put("010-1234-5678", "ö��/16");
		group.put("010-1256-7811", "�̹�/16");
		group.put("010-1234-5862", "����/14");
		group.put("010-1234-5899", "�μ�/16");
		group.put("010-1234-5812", "����/20");
		group.put("010-1234-5843", "����/27");

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("\n������ ����� �Է��ϼ���\n1. �׷� �߰�\n2. ��ȭ��ȣ �� �������� ���\n3. �̸� �˻�\n4. ��ȭ��ȣ �˻�\n5. ����");
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
