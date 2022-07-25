import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class D13_Time {

	/* 0517 ȭ
	  # java.Time.*
	  
	   - Calendar�� �������� ������ ������ �ð��� �ٷ�� Ŭ����
	   - Calendar�� set()�� add()�� ���� ���� �ν��Ͻ��� ����ؼ� ���������� java.Time ��Ű���� Ŭ�������� ������ �����ϰ� ���ο� �ν��Ͻ��� ��ȯ�Ѵ�
	   - LocalDate, LocalTime, LocalDateTime
	 */
	
	public static void main(String[] args) {
		
		// now() : ���� �ð��� �ν��Ͻ��� ��ȯ�ϴ� �޼���
		System.out.println("��¥�� : "+LocalDate.now());
		System.out.println("�ð��� : "+LocalTime.now());
		System.out.println("��¥�� �ð� : "+LocalDateTime.now());
		
		// of() : ���ϴ� ������ �ν��Ͻ��� ��ȯ�ϴ� �޼���
		System.out.println(LocalDate.of(2002, 5, 10));
		System.out.println(LocalDate.of(2002, Month.MAY, 10));
		System.out.println(LocalTime.of(13, 30, 59, 999999991));
		System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.of(12,50)));
		
		// �ν��Ͻ��κ��� ����� �ν��Ͻ� �����ϱ�
		LocalDate today = LocalDate.now();
		LocalDate nextyear = today.plusYears(1);
		LocalDate nextMonth = today.plusMonths(-5);
		LocalDate minusDays = today.minusDays(10);
		
		//System.out.println(today.plus(Duration.ofDays(10)));
		System.out.println(today.plus(10, ChronoUnit.MONTHS));
		
		
		today.plusYears(1);
		// ������ �����ϰ� ���ο� �ν��Ͻ��� ��ȯ�ϱ� ������ PlusYear ���� �޼��带 ����ص� ������ ������ �ʴ´�
		System.out.println(today); 
		System.out.println(nextyear); 
		System.out.println(nextMonth);
		System.out.println(minusDays); 
		
		
		// java.time.DateTimeFormatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd EEEE");
		System.out.println(dtf.format(today));
		
		LocalDate childrensDay = LocalDate.of(2022, 5, 5);
		System.out.println("������ ��̳� �� �ΰ���? " + today.isAfter(childrensDay));
		System.out.println("������ ��̳� �� �ΰ���? " + today.isBefore(childrensDay));
		System.out.println("������ ��̳��ΰ���? " + today.isEqual(childrensDay));
		
		// Ư�� �ʵ尪 ������(���� : ����)
		DayOfWeek dow = today.getDayOfWeek();
		LocalDate now = LocalDate.of(2022, 5, 16);
		System.out.println(now); // 2022-05-17 �������� ���� ��¥���� ��ȯ
		System.out.println(dow); // DayOfWeek �⺻���� ���� ���� ���� ��ȯ / TUESDAY, MONDAY ...
		
		DayOfWeek now2 = now.getDayOfWeek();
		System.out.println(now2);
		System.out.println(now2.MONDAY);
		System.out.println(now2.TUESDAY);
		
		
		System.out.println("=======================");
		
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.KOREA));
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.KOREA));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.US));
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.US));
		System.out.println(dow.getValue());
		
		// with()���� ��¥ ���ϰ� �����ϱ�
		// - TemporalAdjusters�� ��¥�� ������ �� �ִ� ���� Adjuster���� ���ִ�
		System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));

		System.out.println(today.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));
		System.out.println(today.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(today
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));
		
	}
}
