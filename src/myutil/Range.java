package myutil;


// public : �տ� ���̸� �ٸ� ��Ű�������� ������ �� �� �ְ� �ȴ�.
public class Range {

	int start;
	int end;
	int incre;
	
	int length;
	public int[] range; // �ش� ������ 1, 2�� ���� ���������� ���ư��� ������ 15, 19��° �� �ۼ� ���� / �ٸ� ��Ű������ �������� ���⿡�� public ����
	
	public Range(int end) {
		this(0,end,end < 0?-1:1); // ���ڰ����� �Ű����� 3���޴� ������(22��° ��)�� �־���
	}
	
	public Range(int start, int end) {
		this(start, end, start>end?-1:1);// �̰͵� ��������
	}
	
	public Range(int start, int end, int incre) {
		this.start=start;
		this.end=end;
		this.incre=incre;
		this.length = length();
		this.range=range2();
	}
	
	int length() { //�Ű������� ���� ������ Ŭ���� ���ο� �ִ� �ʵ� ������ �̿��ϱ� ������
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
