package quiz;

import myobj.Airplane;
import myobj.Car;
import myobj.Train;

public class C05_ExtendQuiz {

	/* 
	  연습문제
	  
	  -myobj 패키지에 상속 관계에 있는 클래스들을 정의해보세요
	  -부모클래스, 자식클래스, 오버라이드를 사용할 것
	 */

	public static void main(String[] args) {
		
		Train lovestrain = new Train();
		lovestrain.price=3000;
		lovestrain.name="무궁화호";
		lovestrain.maxperson=300;
		lovestrain.speed=200;
		
		lovestrain.vehicleinfo();
		
		Car bumpercar = new Car();
		bumpercar.car_color= "Blue";
		bumpercar.name = "Tico";
		bumpercar.maxperson = 4;
		bumpercar.speed= 100;
		
		bumpercar.vehicleinfo();
		
		Airplane fly = new Airplane();
		fly.destination="제주도";
		fly.maxperson = 250;
		fly.name= "ASIANA";
		fly.speed=350;
		
		fly.vehicleinfo();
		
		lovestrain.speedcomp(lovestrain);
		fly.speedcomp(fly);
		bumpercar.speedcomp(bumpercar);
		
		
		
	}
}
