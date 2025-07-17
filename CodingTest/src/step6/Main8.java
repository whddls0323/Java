package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/17
	이름: 윤종인
	내용: 백준 6단계 8번 문제 - 너의 평점은
*/

public class Main8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double result = 0;
		
		for(int i=0;i<20;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			double b = Double.parseDouble(st.nextToken());
			String c = st.nextToken();
			
			if(c.equals("A+")) {
				result += b * 4.5;
			} else if(c.equals("A0")) {
				result += b * 4.0;
			} else if(c.equals("B+")) {
				result += b * 3.5;
			} else if(c.equals("B0")) {
				result += b * 3.0;
			} else if(c.equals("C+")) {
				result += b * 2.5;
			} else if(c.equals("C0")) {
				result += b * 2.0;
			} else if(c.equals("D+")) {
				result += b * 1.5;
			} else if(c.equals("D0")) {
				result += b * 1.0;
			} else if(c.equals("F")) {
				result += b * 0.0;
			}
		}
		System.out.println(result/19);
	}
}
