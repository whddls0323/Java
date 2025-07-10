package test2;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 자바 배열 문자 출력 연습문제
*/

public class Test04 {
	public static void main(String[] args) {
		int[] arr = {4,2,1,5,3};
		
		for(int i=0;i<4;i++) { //i=0, i=1,i=2,i=3
			for(int j=i+1;j<5;j++) {//j=1~4
				if(arr[i] > arr[j]) {//i=0 j=1, i=0 j=2 / i=1 j=2 / i=2 j=4 / i=3 j=4
					int temp = arr[j]; //24153 -> 14253 -> 12453 -> 12354 -> 12345
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}
}
