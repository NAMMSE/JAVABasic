package quiz;

public class B12_TempPassword {
	/*
	 6�ڸ��� ���� �ӽ� ��й�ȣ�� �����ϴ� ���α׷��� ����� ������
	 (��й�ȣ�� �����ϴ� ���� - ����, ����, Ư������)
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
		System.out.println(" ������ �ӽ� ��й�ȣ : "+ temp_password);
	}
}
