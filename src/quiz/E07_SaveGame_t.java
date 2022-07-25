package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

import myobj.rps.Shape;

public class E07_SaveGame_t {

	/* 0519 �����
	  ���������� ����� ����� ���Ͽ� ����
	  ���Ϸ� �����Ѵٴ� �� = �ϵ��ũ�� �����͸� ����� ��
	  txt������ �ϵ忡 ������ �����͸� �޸��� �������� ���� ���� ���̴�
	  
	 */
	
	
	public static void main(String[] args) {
		File saveFile = new File("files/save.rps"); // �ϵ忡 �����͸� ����� ���̱⶧���� ���� txt�� ������ �ʾƵ� ��
		File logFile = new File("files/rps.log"); // �¹����� �α� ����� ����
		
		int win=0,draw=0,lose=0;
		try {
			FileReader in = new FileReader(saveFile);
			char[] buffer = new char[50];
			int len = in.read(buffer);
			String data = new String(buffer,0,len);
			String[] record = data.split("/"); // '/'�������� �ڸ� ���� ���ڿ� �迭�� 0���� ���� > �� �� �� ������ �����
			win = Integer.parseInt(record[0]); // �װ� ���ڿ�>���� ��ȯ�Ͽ� ���� ������ ������
			draw = Integer.parseInt(record[1]);
			lose = Integer.parseInt(record[2]);
			
			in.close();
		} catch (FileNotFoundException e1) { // savefile�� ������ ������ ����
			System.out.println("���̺� ������ ã�� �� ��� ó������ �����մϴ�.");
			e1.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		try {
			FileWriter out = new FileWriter(logFile, true);

			for(int i=0;i<10;i++) {
				Shape com = Shape.random();
				Shape user = Shape.random();

				out.write(String.format("��ǻ�� [%4s] vs ���� [%4s]��",com, user));
				switch(Shape.versus(com, user)) {
				case 1:
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
					out.write("��ǻ�� �¸�");
					lose++;
					break;
				case -1:
					System.out.println("������ �̰���ϴ�");
					out.write("���� �¸�");
					win++;
					break;
				case 0:
					System.out.println("�����ϴ�.");
					out.write("���º�");
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
			out.append(String.format("%d/%d/%d", win,draw,lose)); // �̷��� �����ؾ� '/'�������� �ڸ��� ���ϵ� �ҷ��ö� ���ϴ�

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("%d�� %d�� %d�з� 10���� �������ϴ�.\n", win, draw, lose);
		System.out.println("������ �����մϴ�.");
	}
}
