package myobj.parking;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;

public class CarFactory { // 0517 화

	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>(); // 오늘 날짜 dow키 값으로 
	
	static {
		limitNumMap.put(DayOfWeek.MONDAY, "16"); // 리미트넘맵에 dow.요일 키 값으로 16, 27 등 출입제한 번호 값들 입력
		limitNumMap.put(DayOfWeek.TUESDAY, "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY, "38");
		limitNumMap.put(DayOfWeek.THURSDAY, "49");
		limitNumMap.put(DayOfWeek.FRIDAY, "50");
	}
	
	static CarType[] types = {Car.babyRide, Car.disabled, Car.lightCar, Car.normal,Car.normal,Car.normal,Car.normal,Car.normal};
	
	public static Car getLimitedTestCar() { // 차량 끝번호에 10개 숫자를 다 넣으면 제한되는 경우가 적어서 아예 제한되도록만 테스트 하기위한 메서드
		String carNum = "12금123"; // 마지막 한자리로 테스트 하므로 테스트용 carnum은 번호가 3자리이다 밑에서 끝자리 넣어줌
		DayOfWeek dow = LocalDate.now().getDayOfWeek(); // 오늘 날짜(2022-05-17)의 요일만 (TUESDAY)를 뽑아서
		String limitNum = limitNumMap.get(dow);// 저장되어있는 리밋넘맵에서 DayOfWeek.TUSEDAY를 의미

		if(limitNum == null) { //리밋넘맵에는 평일 5일치만 넣어서 오늘 날짜가 주말이면 리밋넘은 널이 된다
			System.out.println("오늘은 금지차량을 만들 수 없어서 랜덤 차량을 생성합니다");
			return getRandomTestCar();
		}

		// carNum이 12금123 이므로 마지막 한자리가 부족 > 리밋넘은 요일을 키값으로 뽑기 때문에 16,27,38,49,50 중 하나이고
		// 이걸 charAt으로 뽑아내면 0번째는 12345, 1번째는 67890이다 즉 무조건 제한되는 숫자를 뽑는 것임 
		// 해당 요일에 해당하는 숫자 2개만 나오기때문에 무조건 제한이된다
		return new Car(  											// 일반 차량 5개에 제외차량 포함하여 랜덤으로 테스트 돌릴 수 있게
				carNum + (limitNum.charAt((int)(Math.random()*2))), types[(int)(Math.random()*types.length)]); 
	}					// 리밋넘은 화요일기준 26이고 차량 번호는 2나 6만 나온다
	
	public static Car getRandomTestCar() {
		String carNum = "12테123";
		
		return new Car( // 이건 0~9까지 나오기 때문에 화요일제한이 아닌 숫자가 나올 수 있다
				carNum + (int)(Math.random() *10), types[(int)(Math.random()*types.length)]);
	}
}
