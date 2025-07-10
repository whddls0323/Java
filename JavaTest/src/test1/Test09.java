package test1;

/*
	날짜: 2025/07/09
	이름: 윤종인
	내용: 자바 반복문 연습문제
*/

public class Test09 { //다시 보기
	public static void main(String[] args) {
		int count = 0;
		
		for(int i=1;i<=9;i++) { // 1~9
			if(i<=5) { //i가 5보다 작거나 같을때
				count++; //i=1 count=1, i=2 count=2, i=3 count=3, i=4 count=4, i=5 count=5
			} else { //i가 5보다 클때
				count--; //i=6 count=4, i=7 count=3, i=8 count=2, i=9 count=1
			}
			
			for(int j=1;j<=5-count;j++) { // 1~4 0이 4개, 1~3 0이 3개, 1~2 0이 2개, 1~1 0이 1개, i가 5일때 작동 안됨, 
				System.out.print(" ");    // 1~1 0이 1개, 1~2 0이 2개,1~3 0이 3개,1~4 0이 4개
			}
			for(int k=1;k<=2*count-1;k++) { //1~1 별이 1개, 1~3 별이 3개, 1~5 별이 5개, 1~7 별이 7개, 1~9 별이 9개, 
				System.out.print("*");      //1~7 별이 7개, 1~5 별이 5개, 1~3 별이 3개, 1~1 별이 1개
			}
			System.out.print("\n");
		}
	}
}
