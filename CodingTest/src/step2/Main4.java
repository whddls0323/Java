package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 2단계 4번 문제 - 사분면 고르기
*/

public class Main4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x > 0 && y > 0)
			System.out.println(1);
		else if(x < 0 && y > 0)
			System.out.println(2);
		else if(x < 0 && y < 0)
			System.out.println(3);
		else if(x > 0 && y < 0)
			System.out.println(4);
	}
}

