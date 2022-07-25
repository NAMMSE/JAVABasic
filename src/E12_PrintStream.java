import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E12_PrintStream {

	
	/*
	  # PrintStream, PrintWriter
	  
	   - �����͵��� ���ϰ� ����� �� �ִ� �޼������ �߰��� ��Ʈ�� Ŭ����
	   - PrintStream���� OutputStream�� ����� ����� �� �ְ�, 
	     PrintWriter���� Writer�� ����� ����� �� �ִ�
	   - printf, println ���� ���� �޼������ �����Ǿ� �ִ�
	   
	   
	  # å���� �߰��� �����ϸ� ���� �͵� ( �̰��� �ڹٴ�)
	  
	   - 678p ����
	   - 782p ��Ʈ���� ���� ó��
	   - 576p ��Ƽ ������
	   - 1082p ���� ��Ʈ��, ��Ʈ��ũ ����, TCP ��Ʈ��ũ , UDP 
	 */
	
	public static void main(String[] args) {
//		PrintStream out = System.out;
//		
//		out.println(" /)/)");
//		out.println("(  ..)");
//		out.println("(  >$)");
		
		// ���� : reporters ���� ������ ���ڵ� �� �������� 10���� �����Ͽ� A01�� ������ ���Ϸ� �������� 
		
		File rep = new File("files/reporters");
		//Pattern.matches(.*[.][r][e][p], rep);
		String[] reps = rep.list();
		String[] ranrep = new String[10];
		for(int i=0;i<10;i++) {
			ranrep[i] = reps[(int)(Math.random()*reps.length)];
		}
		
		for(String rp : ranrep)
			System.out.println(rp);
		File a01 = new File("files/A01.txt");
		try (
				FileWriter fout= new FileWriter(a01);		
				PrintWriter out = new PrintWriter(fout);
				
		){	
			out.println("        #### ���� ���� ####");
			out.println("==================================");
			out.println("�̸�\t\t\t�Ҽ�\t\t\t�о�");
			out.println("==================================");
			
			for(int i=0;i<10;i++) {
				ranrep[i] = ranrep[i].substring(0, ranrep[i].indexOf(')'));
				String[] name = ranrep[i].split("_");
				//System.out.println(cut1[1]);
				String company, title;
				System.out.println(company = name[1].substring(0, name[1].indexOf(('('))));
				System.out.println(title = name[1].substring(name[1].indexOf(('('))+1, name[1].length()));
				
				out.printf("%s\t\t%s\t\t%s\n",name[0], company, title );
				
				
//				System.out.println(cut1[1]);
			//	String[] cut2 = cut1[1].split("(");
				
//				System.out.println(cut2[0]);
//				System.out.println(cut2[1]);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
