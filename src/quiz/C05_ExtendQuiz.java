package quiz;

import myobj.Airplane;
import myobj.Car;
import myobj.Train;

public class C05_ExtendQuiz {

	/* 
	  ��������
	  
	  -myobj ��Ű���� ��� ���迡 �ִ� Ŭ�������� �����غ�����
	  -�θ�Ŭ����, �ڽ�Ŭ����, �������̵带 ����� ��
	 */

	public static void main(String[] args) {
		
		Train lovestrain = new Train();
		lovestrain.price=3000;
		lovestrain.name="����ȭȣ";
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
		fly.destination="���ֵ�";
		fly.maxperson = 250;
		fly.name= "ASIANA";
		fly.speed=350;
		
		fly.vehicleinfo();
		
		lovestrain.speedcomp(lovestrain);
		fly.speedcomp(fly);
		bumpercar.speedcomp(bumpercar);
		
		
		
	}
}
