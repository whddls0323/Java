package test2;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 자바 피보나치 수열 재귀 메서드 연습문제
*/

public class Test10 { //피보나치 수열 공식: f(n) = f(n-1) + f(n-2)
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.print(fibo(i) + " "); //fibo(0)~fibo(9) 0,1,2,3,4,5,6,7,8,9
		}
	}
	
	public static int fibo(int n) {
		if(n <= 1) { //fibo(0), fibo(1) 
			return n;// 0 반환, 1 반환
		}
		return fibo(n-1) + fibo(n-2); //fibo(2) = fibo(1) + fibo(0) = 1, fibo(3) = fibo(2) + fibo(1) = 2, fibo(4) = fibo(3) + fibo(2) = 3
	} //fibo(5) = fibo(4) + fibo(3) = 5, fibo(6) = fibo(5) + fibo(4) = 8, fibo(7) = fibo(6) + fibo(5) = 13
}
