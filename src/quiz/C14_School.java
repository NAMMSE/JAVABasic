package quiz;

import myobj.student.Average;
import myobj.student.GradeCard;
import myobj.student.MachinelearningStudent;
import myobj.student.NetworkStudent;
import myobj.student.ProgrammingStudent;
import myobj.student.Student;

public class C14_School {

	/*
	   1. 프로그래밍 반 학생들은 각자의 국어 영어 수학 프로그래밍 언어 자료구조 운영체제 점수가 있다
	   
	   2. 네트워크 반 학생들은 각자의 국어 영어 리눅스 네트워크 ccna 점수가 있다
	   
	   3. 머신러닝 반 학생들은 각자의 국어 영어 수학 통계학 프로그래밍 언어 점수가 있다
	   
	   4. 100명의 학생을 랜덤으로 생성한다 
	      모든 학생의 소속 반, 과목별 점수와 이름은 랜덤으로 생성되어야 하고 학번은 중복ㅇ벗이 순차적으로 생성되어야 한다
	      
	   5. 성적표 출력 메서드를 통해 각 학생의 [이름/각 과목 점수/총점/평균]을 볼 수 있어야 한다
	 */
	
	/*public static void main(String[] args) {
		Student[] student = new Student[100];
		for(int i=0; i<100;i++) {
			student[i]._class = 3;//(int)(Math.random()*3);
			student[i].name="123";		
			}
		for(int i=0 ; i<100 ; i++) {
			int newnum = (int)(Math.random()*100+1);
			student[i].stunum=newnum;
			for(int j=0;j<i;j++) {
				if(newnum==student[j].stunum) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<100;i++) {
			student[i].print();
		}
		
		for(int i=0 ; i<100 ; i++) {
			if(student[i]._class==0) {
				student[i].os=3;
			}
			else if(student[i]._class==1) {
				
			}
			else {
				
			}
		}
	}
}
//interface Programming{
//	int korean=0;
//	int english=0;
//	int math=0;
//	int planguage=0;
//	int structure=0;
//	int os=0;
//	
//}
//
//interface Network{
//	int korean=0;
//	int english=0;
//	int linux=0;
//	int network=0;
//}
//
//interface MachineLearning{
//	int korean=0;
//	int english=0;
//	int math=0;
//	int statistics=0;
//	int planguage=0;
//}

class Student implements Programming, Network, MachineLearning{
	public int _class;
	public String name;
	public int stunum;
	
//	public Student(int _class, String name, int stunum) {
//		this._class=_class;
//		this.name=name;
//		this.stunum=stunum;
//	}
	void print() {
		System.out.printf("%d번 학생의 정보 - 이름 : %s / 반 : %d  \n ", stunum, name, _class);
	}
}

*/
	
	
	static void printAverage(Average[] arr) {
		for(Average obj : arr) {
			System.out.println(obj);
			System.out.println("총합 : "+obj.sum());
			System.out.printf("평균: %.2f\n", obj.avg());
		}
	}
	
	static void printGradeCard(GradeCard[] arr) {
		for(GradeCard obj : arr) {
			obj.printGradeCard();
		}
	}


	public static void main(String[] args) {
		//강사님 코드
		
//		Student stu = new ProgrammingStudent();
//		stu.printGradeCard();
//		
//		stu = new NetworkStudent();
//		stu.printGradeCard();
//		
//		stu = new MachinelearningStudent();
//		stu.printGradeCard();
		
//		Student stu;
//		for(int i=0;i<100;i++) {
//			int num = (int)(Math.random()*3);
//			
//			if(num==0) {
//				stu = new ProgrammingStudent();
//				stu.printGradeCard();
//			}
//			else if(num==1) {
//				stu = new NetworkStudent();
//				stu.printGradeCard();
//			}
//			else {
//				stu = new MachinelearningStudent();
//				stu.printGradeCard();
//			}
//			
//		}
		
		Student[] students = new Student[100];
		
		for(int i=0; i<100;i++ ) {
			switch((int)(Math.random()*3)) {
			case 0:
				students[i] = new ProgrammingStudent();
				break;
			case 1:
				students[i] = new NetworkStudent();
				break;
			case 2:
				students[i] = new MachinelearningStudent();
				break;
			}
		}
		printGradeCard(students);
		printAverage(students);
		
	}
}







