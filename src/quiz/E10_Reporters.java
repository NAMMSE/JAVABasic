package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E10_Reporters {

	/*
	  reporters.txt�� ����� ���ڵ��� ������ ���� ��
	  �� ���ڵ��� ������ ����ִ� files/reporters/�̸�_�Ź���(�о�).rep ���Ϸ� �籸���غ�����
	 */
	
	static File makedir = new File("files/reporters");
	
	public static void readReporters(File text) {
		makeDirectory();
		try(
				FileReader fin = new FileReader(text);
				BufferedReader in = new BufferedReader(fin);
		){
			String line;
			String[] info=null;
			while(true) {
				while((line = in.readLine())!=null) {
					info = line.split("\t");	//����
					if(info.length==4)
						break;
				}
				makeReporters(info);
				if(line==null)
					break;
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void makeReporters(String[] info) {
//		if(info[1].contains("/")) {
//			String[] cut = info[1].split("/");
//			info[1] = cut[0]+cut[1];
//			//System.out.println(info[1]);
//		}
		info[1] = info[1].replace('/', '��');
		File repinfo = new File("files/reporters/"+info[2]+'_'+info[0]+'('+info[1]+')'+".rep");
//		String[] title = info[1].split("/");
//		info[1]=title[0]+(char)92+(char)92+title[1];
//		//System.out.println(repinfo);
//		String path = repinfo.getPath();
//		System.out.println(path);
		
		
		try(
				FileWriter fout = new FileWriter(repinfo);
				BufferedWriter out = new BufferedWriter(fout);
		){
			out.write("");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void makeDirectory() {
		System.out.println(makedir.mkdir() ? "reporters ������ ����" : "reporters ������ ����");
	}
	
	public static void main(String[] args) {
		File reporters = new File("files/reporters.txt");
		readReporters(reporters);
		
	}
}
