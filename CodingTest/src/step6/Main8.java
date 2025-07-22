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
		double hap1 = 0,hap2 = 0;
		
		for(int i=0;i<20;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			double b = Double.parseDouble(st.nextToken());
			String c = st.nextToken();
			
			if(c.equals("A+")) {
				hap1 += b * 4.5;
				hap2 += b;
			} else if(c.equals("A0")) {
				hap1 += b * 4.0;
				hap2 += b;
			} else if(c.equals("B+")) {
				hap1 += b * 3.5;
				hap2 += b;
			} else if(c.equals("B0")) {
				hap1 += b * 3.0;
				hap2 += b;
			} else if(c.equals("C+")) {
				hap1 += b * 2.5;
				hap2 += b;
			} else if(c.equals("C0")) {
				hap1 += b * 2.0;
				hap2 += b;
			} else if(c.equals("D+")) {
				hap1 += b * 1.5;
				hap2 += b;
			} else if(c.equals("D0")) {
				hap1 += b * 1.0;
				hap2 += b;
			} else if(c.equals("F")) {
				hap1 += b * 0.0;
				hap2 += b;
			}
		}
		System.out.println(hap1/hap2);
	}
}
