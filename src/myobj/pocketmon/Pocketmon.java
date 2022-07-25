package myobj.pocketmon;

import java.util.Scanner;

public class Pocketmon {

	int hp;
	int atk;
	int def;
	int sAtk;
	int sDef;
	int spd;
	String name;
	
	public Pocketmon(int hp, int atk, int def, int sAtk, int sDef, int spd, String name) {
		this.atk=atk;
		this.def=def;
		this.hp=hp;
		this.sAtk=sAtk;
		this.sDef=sDef;
		this.spd=spd;
		this.name = name;
	}
	
	public static String nickname(String defaultName) {
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임을 정하시겠습니까? [Y/N] ");
		char select = sc.nextLine().charAt(0);
		String nickname = defaultName;
		if(select == 'Y') {
			System.out.print("닉네임을 입력하세요..");
			nickname = sc.nextLine();
		}
		return nickname;
	}
	
	public void printStats() {
		System.out.printf("[%s's stats]\n"
				+ "HP\t%d\n"
				+"ATK\t%d\n"
				+"DEF\t%d\n"
				+ "S.ATK\t%d\n"
				+ "S.DEF\t%d\n"
				+ "SPD\t%d\n",
				name, hp, atk, def, sAtk, sDef, spd);
	}
	
	public int getTotalStats() {
		return hp + atk + def + sAtk + sDef + spd;
	}
	
}
