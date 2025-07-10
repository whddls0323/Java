package test2;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 자바 배열 문자 출력 연습문제
*/

public class Test01 {
	public static void main(String[] args) {
		char str[] = {'I',' ','L','O','V','E',' ','Y','O','U'};
		int row,col;
		
		for(row=1;row<10;row++) {       // 1    ,2   ,3     ,4
			for(col=0;col<=row;col++) { // I' ',I' 'L,I' 'LO,I' 'LOV
				System.out.print(str[col]);
			}
			System.out.print("\n");
		}
	}
}
