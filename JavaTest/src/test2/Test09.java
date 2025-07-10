package test2;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 자바 최대공약수 재귀 메서드 연습문제
*/

public class Test09 {
	public static void main(String[] args) {
		System.out.println("1과 5의 최대공약수: " + gcd(5,1));
		System.out.println("3과 6의 최대공약수: " + gcd(6,3));
		System.out.println("12과 18의 최대공약수: " + gcd(18,12));
		System.out.println("60과 24의 최대공약수: " + gcd(60,24));
		System.out.println("192과 162의 최대공약수: " + gcd(192,162));
	}
	
	public static int gcd(int a,int b) {
		if(a % b == 0) {//5%1==0, 6%3==0, 18%12!=0 -> 12%6==0
			return b;//1, 3, 6
		} else { //18%12!=0
			return gcd(b,a%b); //(12,6)
		}
	}
}
