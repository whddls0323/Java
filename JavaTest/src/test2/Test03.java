package test2;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 자바 배열 문자 출력 연습문제
*/

public class Test03 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<10;i++) {
			System.out.print(arr[i] + ", "); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		}
		
		System.out.print("\n");
		
		for(int j=0;j<5;j++) {
			int temp = arr[j]; //temp = 1, temp = 2, temp = 3
			arr[j] = arr[9-j]; //arr[j] = 10, arr[j] = 9, arr[j] = 8
			arr[9-j] = temp;    //arr[9-j] = 1, arr[9-j] = 2, arr[9-j] = 3
		}
		
		for(int n : arr) {
			System.out.print(n + ", ");
		}
	}
}
