package quiz;

public class B12_BruteForce {

	/*
	 * ������ �ӽ� ��й�ȣ�� ���⶧���� ��� ��й�ȣ�� �����ϰ� �����ϴ� ���α׷�
	 */
	public static void main(String[] args) {
		
		String password = "";
		for(int i=0;i<4;i++) {
			char ran =(char)(Math.random()*94+33);
			System.out.println(ran);
			password+=ran;
			//System.out.println(password);
		}
		System.out.println("���� �ӽ� ��й�ȣ�� " +password+"�Դϴ�.");
		/* ���ڵ�
		String words = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "`~!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
		
		
		String com_pw;
		for(;;) { // ���ϸ鼭 ���������� �ݺ��ϴϱ� ���ѹٺ�
			com_pw = ""; // �ʱ�ȭ (���⼭ �ϴ°� �´��� �𸣰���)
			for(int i=0;i<94;i++) {  // õ�� �ڸ� �ݺ�
				char ran =(char)(words.charAt(i));
				com_pw += ran;
				for(int j=0;j<94;j++ ) {
					ran =(char)(words.charAt(j));
					com_pw += ran;
					for(int t=0;t<94;t++ ) {
						ran =(char)(words.charAt(t));
						com_pw += ran;
						for(int r=0;r<94;r++ ) {
							ran =(char)(words.charAt(r));
							com_pw += ran;
							com_pw.charAt(com_pw.length())="";
							System.out.println(com_pw);
							if(true){
								break;
							}
							
						}
					}
				}
			}
			System.out.println(com_pw);
			if(com_pw.charAt(0)==password.charAt(0)
				&&com_pw.charAt(1)==password.charAt(1)
				&&com_pw.charAt(2)==password.charAt(2)
				&&com_pw.charAt(3)==password.charAt(3)) {
				break;
			}
						
		}
		
		System.out.println("���� ��й�ȣ " + password+"�� ������ ��й�ȣ�� " + com_pw +"�Դϴ�.");
		*/
		String symbols = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "`~!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
	
		
		//System.out.println((long)Math.pow(symbols.length(), 4)); // ��й�ȣ�� 4�ڸ��϶� ���� �� �ִ� ����� ��  94*94*94*94
		
		double max_index = Math.pow(symbols.length(), 4);
		
		/*
		 �� ���ڿ��� ����� ���� +=���� ���ڿ��� �� ���ھ� �ϼ���Ű�� ���� �ſ������
		 ���ڿ��� �� ���ھ� �ϼ���ű ���� ���� StringBuilder��� Ŭ������ ����Ѵ�
		 
		 append() : +=���� ���ڸ� �� ���� �ǵڿ� �߰��ϴ� �Ͱ� ���� ȿ���� ���� �޼���(�Լ�)
		 insert() : �ش� ���ڿ��� �� �տ� ���ڸ� �߰��ϴ� �޼���
		 */
		
		
		
		for(int i =0;i<max_index; i++) {
			StringBuilder brutepassword_builder = new StringBuilder();
			int bruteindex = i;
			for(int j=0;j<4;j++) {
				brutepassword_builder.insert(0, symbols.charAt(bruteindex % symbols.length()));
				bruteindex/=symbols.length();
			}
			//stringBuilder�� ������� ����� ���ڿ��� ������
			String brutepassword = brutepassword_builder.toString();
			System.out.println(brutepassword);
		}
		
		
		
		
		
		
		
		
		/* �ι�° �ڵ� ����
		 * 93����
		 * brute	symbol index	index
		 * aaaa		0001			0
		 * aaab		0002			1
		 * aaaj		0009			9
		 * aaak		000(10)			10
		 * aaa\		000(92)			92
		 * aaba		0010			93 -> 93%92
		 * aabb		0011			94
		 */
		
		/*	����� �ι�° �ڵ�
		for(int i =0;i<max_index; i++) {
			String brutepassword = "";
			int bruteindex = i;
			for(int j=0;j<4;j++) {
				brutepassword += symbols.charAt(bruteindex%symbols.length());
				bruteindex/=symbols.length();
			}
			//brutepassword += symbols.charAt(i%symbols.length());
			//brutepassword += symbols.charAt(i/symbols.length() %symbols.length());
			//brutepassword += symbols.charAt(i/symbols.length()/symbols.length() %symbols.length());
			//brutepassword += symbols.charAt(i/symbols.length()/symbols.length()/symbols.length() %symbols.length()); //
			
			System.out.println(brutepassword);
		}
		*/
		
		
		
		/*	����� ù���� �ڵ�
		for( int i = 0;i < symbols.length();i++) {
			String temp= "";
			temp+=symbols.charAt(i);
			for( int j =0;j<symbols.length();j++) {
				String temp2;
				temp2=temp + symbols.charAt(j);
				for(int k =0;k<symbols.length();k++){
					String temp3;
					temp3= temp2+symbols.charAt(k);
					for(int l =0;l<symbols.length();l++){
						String temp4;
						temp4=temp3+symbols.charAt(l);
						System.out.println(temp4);
						if(temp4.equals(password)) {
							System.out.println(password + "�� ������ ��й�ȣ�� " + temp4 +"�Դϴ�.");
						}
						
					}
				}
			}
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
	}
}
/*
char ran =(char)(words.charAt(i));
//System.out.println(ran);
com_pw.charAt(i)=ran;*/