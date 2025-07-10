package test2;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 자바 배열 문자 출력 연습문제
*/

public class Test02 {
	public static void main(String[] args) {
		int[] arr = {17,92,18,33,58,7,26,42};
		int maxNum = arr[0];
		
		for(int i=0;i<8;i++) {
			if(maxNum < arr[i]) { // 0 < 17, 17 < 92
				maxNum = arr[i]; //maxNum = 17, maxNum = 92
			}
		}
		System.out.println("배열 arr에서 가장 큰 수: " + maxNum);
	}
}
