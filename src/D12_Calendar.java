import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class D12_Calendar {

	/* 0516 ��
	  # java.util.calender
	  
	   - �޷��� ������ Ŭ����
	   - ��¥ �� �ð��� ���� ����� �� �ִ� �پ��� ��ɵ��� ���ִ�
	   - ������ ��� getInstance()��� ����ƽ �޼��带 ����Ѵ�
	   - Ÿ������  ������ �ٸ� ������ �ð��� �� �� �ִ�
	 */
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(Locale.FRENCH);
		System.out.println(now);
		
		// get(field) : �ش� �ν��Ͻ����� ���ϴ� �ʵ��� ���� ���� �� �ִ�
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1); // ���� 0�� 1���̴�..
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.HOUR)); // HOUR : 12�� ����
		System.out.println(now.get(Calendar.HOUR_OF_DAY)); // HOUR_OF_DAY : 24�� ����
		System.out.println(now.get(Calendar.SECOND));
		System.out.println(now.get(Calendar.MILLISECOND));
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // DAY_OF_WEEK : ���� (1~7) �Ͽ����� 1
		
		// add(field, value) : �ش� �ʵ��� ���� ���Ѵ� (���� �Է½� ����)
		now.add(Calendar.HOUR, 5);
		now.add(Calendar.DATE, -300);
		
		// set(field, value) : �ش� �ʵ尪 ����
		now.set(Calendar.MONTH, 0);  // ���⼭ 1���� �ٲ��
		now.set(Calendar.MONTH, -3); // ���⼭ - �Է��ϸ� ������ �۳����� �Ѿ
		
		Calendar cal2 = Calendar.getInstance();
		
		cal2.set(2022, 6, 50, 13, 50, 55);
		
		System.out.println("now�� cal2���� ���� �ð��Դϱ�?"+now.after(cal2));
		System.out.println("now�� cal2���� ���� �ð��Դϱ�?"+now.before(cal2));
		
		System.out.printf("%d�� %d�� %d�� %d:%d:%d\n"
				,now.get(Calendar.YEAR)
				,now.get(Calendar.MONTH)+1
				,now.get(Calendar.DATE)
				,now.get(Calendar.HOUR)
				,now.get(Calendar.MINUTE)
				,now.get(Calendar.SECOND));
		

		//-------------------------------------------------------------------------------------------//
		Calendar now2 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Dublin"));
		System.out.println("������ ��¥ : "+now2.get(Calendar.DATE));
		System.out.println("������ �ð� : "+now2.get(Calendar.HOUR_OF_DAY));

		// SimpleDateFormat : Date�� ���� ����ϱ� ���� Ŭ����

		// �� �����ϸ� ���� ���� �ش� ���� ǥ���� �� �ִ�.(Locale Ŭ���� Ȱ��)
		SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss.SSS a EEEE", Locale.getDefault()); // E�� ������ ���� ��, �����Ϸ� ǥ����
		// Ÿ������ �����ϸ� ���ϴ� ������ �ð����� ����� �� �ִ�
		myDateFormat.setTimeZone(TimeZone.getTimeZone("EUROPE/Dublin"));
		
		
		// �ð��� �����ϱ�
		// ��� ������ ID�� ����
//		for(String id : TimeZone.getAvailableIDs()) { // Ÿ���� id�� ���
//			System.out.println(id);
//		}
		
		
		/*
		  # SimpleDateFormat�� ���� ���ڵ�
		  
		   y : ��
		   M : ��
		   d : ��
		   D : �� (1~365)
		   H : 24��
		   h : 12��
		   m : ��
		   s : ��
		   S : �и���
		   E : ����
		   a : ���� / ����
		 */
		
		
		// SimpleDateFormat���� DateŸ�� �Ǵ� ���н� Ÿ���� �����ؾ��Ѵ�
		// Calendar�� getTime() �Ǵ� getTimeInMillis() �޼��带 Ȱ���Ѵ�
		String formatResult = myDateFormat.format(Calendar.getInstance().getTime());
		formatResult = myDateFormat.format(1131321513543L);
		formatResult = myDateFormat.format(Calendar.getInstance().getTimeInMillis());
		formatResult = myDateFormat.format(now2.getTime());
		System.out.println(formatResult);
		
	}
}
