package test2;

import java.util.Scanner;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 자바 배열 이진탐색 연습문제
*/

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {5,10,18,22,35,55,75,103,152};
		
		System.out.print("검색할 값 입력: ");
		int value = sc.nextInt();
		
		int start = 0;
		int end = arr.length - 1; //end = 8;
		int loc = 0;
		boolean state = false;
		
		while(start <= end) { // 0<=8, 5<=8
			int mid = (start + end) / 2; //mid=4, mid=6
			
			if(arr[mid] > value) { //35 > 75
				end = mid - 1;
			} else if(arr[mid] < value) { //35 < 75
				start = mid + 1; //start=5
			} else {//arr[mid]와 value의 값이 같은 경우
				loc = mid; //loc=6
				state = true;
				break;
			}
		}
		
		if(state) {
			System.out.printf("찾은 위치: %d번째 있습니다. ",loc + 1);
		} else {
			System.out.println("찾는 숫자가 없습니다.");
		}
	}
}
