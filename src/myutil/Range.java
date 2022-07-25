package myutil;


// public : 앞에 붙이면 다른 패키지에서도 가져가 쓸 수 있게 된다.
public class Range {

	int start;
	int end;
	int incre;
	
	int length;
	public int[] range; // 해당 로직이 1, 2번 문제 대입했을때 돌아가기 때문에 15, 19번째 줄 작성 가능 / 다른 패키지에서 쓰기위해 여기에만 public 붙임
	
	public Range(int end) {
		this(0,end,end < 0?-1:1); // 인자값들은 매개변수 3개받는 생성자(22번째 줄)로 넣어줌
	}
	
	public Range(int start, int end) {
		this(start, end, start>end?-1:1);// 이것도 마찬가지
	}
	
	public Range(int start, int end, int incre) {
		this.start=start;
		this.end=end;
		this.incre=incre;
		this.length = length();
		this.range=range2();
	}
	
	int length() { //매개변수가 없는 이유는 클래스 내부에 있는 필드 값들을 이용하기 때문에
		int diff = (end - start) + (incre >0 ? -1 : 1);
		int length = diff  / incre;
		if(length < 0) {
			System.out.println("length: 0");
			return 0;
		}else {
			length +=1;
		}
		return length;
	}
	
	int[] range2() {
		int[] arr = new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=start + incre * i;
		}
		return arr;
	}
}
