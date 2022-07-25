package myobj.rps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Rps {

	final public static Rps ROCK = new Rps(0);
	final public static Rps SCISSORS = new Rps(1);
	final public static Rps PAPER = new Rps(2);
	
	final private static Rps[] rpses = {ROCK, SCISSORS, PAPER};
	final private static String[] names = {"바위", "가위", "보"};
	
	private int rps;
	public static Integer[] winlose = {0,0};
	public static Integer win=winlose[0];
	public static Integer lose=winlose[1];
	public static Integer sumwin=0;
	public static Integer sumlose=0;
	
	static byte[] load = new byte[100];
	
	private Rps(int rps) {
		this.rps = rps;
	}
	
	public static Rps random() {
		return rpses[(int)(Math.random()*rpses.length)];
	}
	
	public static int versus(Rps a, Rps b) {
		int left = a.getValue();
		int right = b.getValue();
		
		if(left==right)
			return 0;
		
		if((left+1)%3 == right)
			return -1;
		else
			return 1;
	}
	
	public int getValue() {
		return rps;
	}
	
	public String getName() {
		return names[rps];
	}
	
	public void saveScore(int win, int lose) {
		
		System.out.println("이번게임에서 이긴 횟수 : "+win);
		System.out.println("이번게임에서 진 횟수 : "+lose);
		File f = new File("files/rpsscore.txt");
		try {
			FileWriter save = new FileWriter(f, Charset.forName("UTF-8"));
			save.write("당신의 누적 승리 횟수:");
			save.write(sumWin(win).toString());
			save.write('\n');
			save.write("당신의 누적 패배 횟수:");
			save.write(sumLose(lose).toString());
			save.close();
			System.out.println("전적 저장 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void loadScore() {
		
		try {
			File f = new File("files/rpsscore.txt");
			FileInputStream in = new FileInputStream(f);
			
			load = in.readAllBytes();
			String txt = new String(load, Charset.forName("UTF-8"));
			System.out.println(txt);
			for(int i=0,j=0 ; i<txt.length();i++) {
				if(Character.isDigit(txt.toCharArray()[i])) {
					//winlose[j++]=Integer.parseInt(String.valueOf(txt.toCharArray()[i])); // 젤 중요
					for(int k=i+1;k<txt.length();k++) {
						if(!Character.isDigit(txt.toCharArray()[k]))
							winlose[j++]=Integer.parseInt(txt.substring(i,k));
					}
					
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int loadwin() {
		
		return winlose[0];
	}
	public static int loadlose() {
		
		return winlose[1];
	}
	public static Integer sumWin(Integer win) {
		return win+winlose[0];
	}
	public static Integer sumLose(Integer lose) {
		return lose+winlose[1];
	}
}
