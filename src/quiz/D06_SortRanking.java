package quiz;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;

public class D06_SortRanking {

	/*
	  여러 사람들의 기록을 저장할 수 있는 데이터 클래스를 하나 설계하고 해당 기록을 클리어 타임순과 점수순으로 출력할 수 있는 프로그램
	 */
	
	public static void main(String[] args) {
		
//		ArrayList<Data> datas = new ArrayList<>();
//		
//		datas.add(new Data(3,"철수",40,210));
//		datas.add(new Data(4,"철새",40,120));
//		datas.add(new Data(3,"영수",37,160));
//		datas.add(new Data(2,"영희",76,160));
//		datas.add(new Data(5,"철민",76,50));
//		datas.add(new Data(6,"공주",54,300));
//		datas.add(new Data(1,"이수",60,280));
//		
//		System.out.println(datas);
//		Collections.sort(datas, new DataSort());
//		System.out.println("==================높은 점수 순===================");
//		System.out.println(datas);
//		System.out.println("==================빠른 클리어타임 순===============");
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
	
	// innerclass 다시 보기
	// Record의 정렬 기준이므로 Record 안에 넣어놓으면 응집도를 높일 수 있다.
	// 응집도 : 모듈 내부의 관련도 / 관련 있는 것들끼리 묶어놓은 정도
	public static Comparator<Record> ORDER_BY_SCORE_DESC = new Comparator<>() {
		public int compare(Record r1, Record r2) {
			// 스코어가 인트형이기 때문에 인티저 컴페어를 사용해도 된다
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
		return time != r.time ? time - r.time : r.score - score; // 시간순으로 정렬인데 시간이 같을경우 점수순으로 정렬
	}
	
	@Override
	public String toString() {
	
		return String.format("name: %s, time: %d, score: %d\n", name,time,score);
	}
}

// 내코드
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
//		return String.format("\n레벨: %d / 이름: %s / 클리어타임: %d초 / 점수: %d점\n", level,name,clear_time,score);
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