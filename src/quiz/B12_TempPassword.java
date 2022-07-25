package quiz;

public class B12_TempPassword {
	/*
	 6자리의 랜덤 임시 비밀번호를 생성하는 프로그램을 만들어 보세요
	 (비밀번호를 구성하는 문자 - 영어, 숫자, 특수문자)
	 */
	
	public static void main(String[] args) {
		/*for(int i=0;i<6;i++) {
			System.out.print((char)(Math.random()*94+33));
		}*/
		
		String sym = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789"
				+ "~!@#$%^&*()-_=+\\|[]{};:'\",<.>/?";
		//System.out.println(sym);
		//System.out.println(sym.length());
		
		String temp_password = "";
		
		for(int i = 0 ; i < 6 ; ++i) {
			int random_index = (int)(Math.random() * sym.length());
			System.out.println(random_index);
			char random_char = sym.charAt(random_index);
			temp_password += random_char;
		}
		System.out.println(" 생선된 임시 비밀번호 : "+ temp_password);
	}
}
