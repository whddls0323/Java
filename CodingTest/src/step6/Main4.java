package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/14
	이름: 윤종인
	내용: 백준 6단계 4번 문제 - 팰린드롬인지 확인하기
*/

public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = "";
		
		for(int i=s1.length()-1;i>=0;i--) 
			s2 += s1.charAt(i);

		if(s1.equals(s2))
			System.out.println(1);
		else
			System.out.println(0);
	}
}
