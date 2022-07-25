package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

import myobj.rps.Shape;

public class E07_SaveGame_t {

	/* 0519 목요일
	  가위바위보 만들고 종료시 파일에 저장
	  파일로 저장한다는 것 = 하드디스크에 데이터를 새기는 것
	  txt파일은 하드에 새겨진 데이터를 메모장 형식으로 보는 것일 뿐이다
	  
	 */
	
	
	public static void main(String[] args) {
		File saveFile = new File("files/save.rps"); // 하드에 데이터를 새기는 것이기때문에 굳이 txt로 만들지 않아도 됨
		File logFile = new File("files/rps.log"); // 승무패의 로그 기록할 파일
		
		int win=0,draw=0,lose=0;
		try {
			FileReader in = new FileReader(saveFile);
			char[] buffer = new char[50];
			int len = in.read(buffer);
			String data = new String(buffer,0,len);
			String[] record = data.split("/"); // '/'기준으로 자른 값을 문자열 배열에 0부터 저장 > 승 무 패 순으로 저장됨
			win = Integer.parseInt(record[0]); // 그걸 문자열>정수 변환하여 각각 변수에 저장함
			draw = Integer.parseInt(record[1]);
			lose = Integer.parseInt(record[2]);
			
			in.close();
		} catch (FileNotFoundException e1) { // savefile이 없으면 나오는 에러
			System.out.println("세이브 파일을 찾을 수 없어서 처음부터 시작합니다.");
			e1.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		try {
			FileWriter out = new FileWriter(logFile, true);

			for(int i=0;i<10;i++) {
				Shape com = Shape.random();
				Shape user = Shape.random();

				out.write(String.format("컴퓨터 [%4s] vs 유저 [%4s]로",com, user));
				switch(Shape.versus(com, user)) {
				case 1:
					System.out.println("컴퓨터가 이겼습니다");
					out.write("컴퓨터 승리");
					lose++;
					break;
				case -1:
					System.out.println("유저가 이겼습니다");
					out.write("유저 승리");
					win++;
					break;
				case 0:
					System.out.println("비겼습니다.");
					out.write("무승부");
					draw++;
					break;
				}
				out.write("-"+LocalTime.now()+"\n");
			}
			out.close();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			FileWriter out = new FileWriter(saveFile);
			out.append(String.format("%d/%d/%d", win,draw,lose)); // 이렇게 저장해야 '/'기준으로 자르든 뭘하든 불러올때 편하다

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("%d승 %d무 %d패로 10판이 끝났습니다.\n", win, draw, lose);
		System.out.println("전적을 저장합니다.");
	}
}
