package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 5단계 10번 문제 - 다이얼
*/

public class Main10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int result = 0;
		
		for(int i=0;i<s.length();i++) {
			if('A' <= s.charAt(i) && s.charAt(i) <= 'C')
				result += 3;
			else if('D' <= s.charAt(i) && s.charAt(i) <= 'F')
				result += 4;
			else if('G' <= s.charAt(i) && s.charAt(i) <= 'I')
				result += 5;
			else if('J' <= s.charAt(i) && s.charAt(i) <= 'L')
				result += 6;
			else if('M' <= s.charAt(i) && s.charAt(i) <= 'O')
				result += 7;
			else if('P' <= s.charAt(i) && s.charAt(i) <= 'S')
				result += 8;
			else if('T' <= s.charAt(i) && s.charAt(i) <= 'V')
				result += 9;
			else if('W' <= s.charAt(i) && s.charAt(i) <= 'Z')
				result += 10;
		}
		
		System.out.println(result);
	}
}
