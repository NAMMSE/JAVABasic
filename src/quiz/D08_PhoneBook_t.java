package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import myobj.phonebook.PersonInfo;

public class D08_PhoneBook_t {
	
	HashMap<String, HashMap<String, PersonInfo>> phonebook = new HashMap<>();
	public D08_PhoneBook_t() {
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
	
	public boolean addPerson(PersonInfo info) {
		String group = info.getGroup();
		String number = info.getnumber();
		
		if(phonebook.containsKey(info.getGroup())) {
			HashMap<String, PersonInfo> groupmap = phonebook.get(group);
			groupmap.put(number, info);
			return true;
		}
		else {
			System.out.println("�ش� �׷��� ���������ʽ��ϴ�. �׷��� ���� �������ּ���.");
			return false;
		}
	}
	
	public void searchByName(String query) {
		for(HashMap<String, PersonInfo> group :phonebook.values()) {
			for(PersonInfo info : group.values()){
				if(info.checkByName(query)) {
					System.out.println(info);
				}
			}
		}
	}
	
	public void searchByNumber(String query) {
		for(HashMap<String, PersonInfo> group :phonebook.values()) {
			for(PersonInfo info : group.values()){
				if(info.checkByNumber(query)) {
					System.out.println(info);
				}
			}
		}
	}
	
	public void printAll(int column, boolean asc) {
		ArrayList<PersonInfo> allInfo = new ArrayList<>();
		
		for(HashMap<String, PersonInfo> group : phonebook.values()) {
			allInfo.addAll(group.values());
		}
		
		Comparator<PersonInfo> comparator = PersonInfo.getComparator(column, asc);
		Collections.sort(allInfo, comparator);
		
		for(PersonInfo info : allInfo) {
			System.out.println(info);
		}
	}
	
	public static void main(String[] args) {
		D08_PhoneBook_t mybook = new D08_PhoneBook_t();
		
		mybook.addgroup("����");
		
		mybook.addPerson(new PersonInfo("����", "1-2-3", "��ƺ�"));
		mybook.addPerson(new PersonInfo("����", "1-2-4", "�ھ���"));
		mybook.addPerson(new PersonInfo("����", "1-2-6", "�赿��"));
		mybook.addPerson(new PersonInfo("����", "1-2-7", "��ģô"));
		mybook.addPerson(new PersonInfo("����", "1-2-8", "��ģô����"));
		
		mybook.searchByName("��");
		mybook.searchByNumber("3");
		
	}
	
}
