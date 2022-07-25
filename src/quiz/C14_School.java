package quiz;

import myobj.student.Average;
import myobj.student.GradeCard;
import myobj.student.MachinelearningStudent;
import myobj.student.NetworkStudent;
import myobj.student.ProgrammingStudent;
import myobj.student.Student;

public class C14_School {

	/*
	   1. ���α׷��� �� �л����� ������ ���� ���� ���� ���α׷��� ��� �ڷᱸ�� �ü�� ������ �ִ�
	   
	   2. ��Ʈ��ũ �� �л����� ������ ���� ���� ������ ��Ʈ��ũ ccna ������ �ִ�
	   
	   3. �ӽŷ��� �� �л����� ������ ���� ���� ���� ����� ���α׷��� ��� ������ �ִ�
	   
	   4. 100���� �л��� �������� �����Ѵ� 
	      ��� �л��� �Ҽ� ��, ���� ������ �̸��� �������� �����Ǿ�� �ϰ� �й��� �ߺ������� ���������� �����Ǿ�� �Ѵ�
	      
	   5. ����ǥ ��� �޼��带 ���� �� �л��� [�̸�/�� ���� ����/����/���]�� �� �� �־�� �Ѵ�
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
		System.out.printf("%d�� �л��� ���� - �̸� : %s / �� : %d  \n ", stunum, name, _class);
	}
}

*/
	
	
	static void printAverage(Average[] arr) {
		for(Average obj : arr) {
			System.out.println(obj);
			System.out.println("���� : "+obj.sum());
			System.out.printf("���: %.2f\n", obj.avg());
		}
	}
	
	static void printGradeCard(GradeCard[] arr) {
		for(GradeCard obj : arr) {
			obj.printGradeCard();
		}
	}


	public static void main(String[] args) {
		//����� �ڵ�
		
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







