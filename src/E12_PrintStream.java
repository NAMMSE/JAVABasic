import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E12_PrintStream {

	
	/*
	  # PrintStream, PrintWriter
	  
	   - 데이터들을 편리하게 출력할 수 있는 메서드들이 추가된 스트림 클래스
	   - PrintStream에는 OutputStream을 등록해 사용할 수 있고, 
	     PrintWriter에는 Writer를 등록해 사용할 수 있다
	   - printf, println 등의 편리한 메서드들이 구현되어 있다
	   
	   
	  # 책에서 추가로 공부하면 좋을 것들 ( 이것이 자바다)
	  
	   - 678p 람다
	   - 782p 스트림과 병렬 처리
	   - 576p 멀티 스레드
	   - 1082p 보조 스트림, 네트워크 기초, TCP 네트워크 , UDP 
	 */
	
	public static void main(String[] args) {
//		PrintStream out = System.out;
//		
//		out.println(" /)/)");
//		out.println("(  ..)");
//		out.println("(  >$)");
		
		// 연습 : reporters 폴더 내부의 기자들 중 랜덤으로 10명을 선택하여 A01의 형식의 파일로 만들어보세요 
		
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
			out.println("        #### 기자 정보 ####");
			out.println("==================================");
			out.println("이름\t\t\t소속\t\t\t분야");
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
