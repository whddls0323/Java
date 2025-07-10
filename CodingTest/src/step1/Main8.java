package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 1단계 8번 문제 - 1998년생인 내가 태국에서는 2541년생?!
*/

public class Main8 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		System.out.println(y - 543);
	}
}