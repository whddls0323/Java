package p224;

/*
	날짜: 2025/07/18
	이름: 윤종인
	내용: 교재 p224 실습하기
*/

class Sample {
	public int a;
	private  int b;
	int c; //default
	protected int d;
}

class Sub extends Sample {
	public void method() {
		d = 10;
	}
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10;
		sample.c = 10;
		
	}
}
