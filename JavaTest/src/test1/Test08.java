package test1;

/*
	날짜: 2025/07/09
	이름: 윤종인
	내용: 자바 반복문 연습문제
*/

public class Test08 {
	public static void main(String[] args) {
		int n = 5;
		
		for(int i=0;i<n;i++) { // 0 1 2 3 4
			for(int j=n-1;j>i;j--) { // 4 3 2 1
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++) { // 0 2 4 6 8
				System.out.print("*"); // 0~0까지 일때 1개, 0~2일때 3개, 0~4일때 5개, 0~6일때 7개, 0~8일때 9개
			}
			System.out.print("\n");
		}
	}
}
