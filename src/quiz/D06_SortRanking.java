package quiz;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;

public class D06_SortRanking {

	/*
	  ���� ������� ����� ������ �� �ִ� ������ Ŭ������ �ϳ� �����ϰ� �ش� ����� Ŭ���� Ÿ�Ӽ��� ���������� ����� �� �ִ� ���α׷�
	 */
	
	public static void main(String[] args) {
		
//		ArrayList<Data> datas = new ArrayList<>();
//		
//		datas.add(new Data(3,"ö��",40,210));
//		datas.add(new Data(4,"ö��",40,120));
//		datas.add(new Data(3,"����",37,160));
//		datas.add(new Data(2,"����",76,160));
//		datas.add(new Data(5,"ö��",76,50));
//		datas.add(new Data(6,"����",54,300));
//		datas.add(new Data(1,"�̼�",60,280));
//		
//		System.out.println(datas);
//		Collections.sort(datas, new DataSort());
//		System.out.println("==================���� ���� ��===================");
//		System.out.println(datas);
//		System.out.println("==================���� Ŭ����Ÿ�� ��===============");
//		Collections.sort(datas);
//		System.out.println(datas);
		ArrayList<Record> records = new ArrayList<>();
		records.add(new Record("KHJ0", 1000, 33000));
		records.add(new Record("KHJ1", 800, 40000));
		records.add(new Record("KHJ2", 3300, 21000));
		records.add(new Record("KHJ3", 2200, 53000));
		records.add(new Record("KHJ4", 2200, 41000));
		records.add(new Record("KHJ5", 2200, 31000));
		records.add(new Record("KHJ6", 2200, 11000));
		records.add(new Record("KHJ7", 2200, 20000));
		records.add(new Record("KHJ4", 2400, 41000));
		records.add(new Record("KHJ4", 6100, 41000));
		records.add(new Record("KHJ4", 1500, 41000));
		records.add(new Record("KHJ4", 3700, 41000));
		
		Collections.sort(records);
		System.out.println(records);
		
		Collections.sort(records, Record.ORDER_BY_SCORE_DESC);
		System.out.println(records);
		
	}
}

class Record implements Comparable<Record>{
	
	// innerclass �ٽ� ����
	// Record�� ���� �����̹Ƿ� Record �ȿ� �־������ �������� ���� �� �ִ�.
	// ������ : ��� ������ ���õ� / ���� �ִ� �͵鳢�� ������� ����
	public static Comparator<Record> ORDER_BY_SCORE_DESC = new Comparator<>() {
		public int compare(Record r1, Record r2) {
			// ���ھ ��Ʈ���̱� ������ ��Ƽ�� ���� ����ص� �ȴ�
			return Integer.compare(r2.score, r1.score) == 0?
					Integer.compare(r1.time, r2.time) : Integer.compare(r2.score, r1.score);
			//return r1.score != r2.score ? r2.score - r1.score : r1.time - r2.time;
		};
	};
	String name;
	int time;
	int score;
	
	
	public Record(String name, int time, int score) {
		this.name=name;
		this.score=score;
		this.time=time;
	}

	@Override
	public int compareTo(Record r) {
		return time != r.time ? time - r.time : r.score - score; // �ð������� �����ε� �ð��� ������� ���������� ����
	}
	
	@Override
	public String toString() {
	
		return String.format("name: %s, time: %d, score: %d\n", name,time,score);
	}
}

// ���ڵ�
//class Data implements Comparable<Data>{
//	
//	int level;
//	String name;
//	int clear_time;
//	int score;
//	public Data(int level, String name, int clear_time, int score){
//		this.clear_time=clear_time;
//		this.level=level;
//		this.name=name;
//		this.score=score;
//	}
//	
//	public String toString() {
//		return String.format("\n����: %d / �̸�: %s / Ŭ����Ÿ��: %d�� / ����: %d��\n", level,name,clear_time,score);
//	}
//	
//	@Override
//	public int compareTo(Data o) {
//
//		return clear_time - o.clear_time;
//	}
//}
//
//
//class DataSort implements Comparator<Data>{
//	
//	@Override
//	public int compare(Data o1, Data o2) {
//		return o2.score-o1.score;
//	}
//
//}