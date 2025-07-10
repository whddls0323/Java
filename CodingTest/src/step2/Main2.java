package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 백준 2단계 2번 문제 - 시험 성적
*/

public class Main2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(br.readLine());
		
		if(a >= 90)
			System.out.println("A");
		else if(a >= 80)
			System.out.println("B");
		else if(a >= 70)
			System.out.println("C");
		else if(a >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}
}
