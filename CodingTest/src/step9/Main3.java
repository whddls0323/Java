package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/24
	이름: 윤종인
	내용: 백준 9단계 3번 문제 - 약수들의 합
*/

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			String s = n + " = ";

			if(n == -1)
				break;
			else {
				for(int i=1;i<n;i++) {
					if(n % i == 0) {
						sum += i;
						if(n == sum) {
							s += i;
						} else {
							s += (i + " + ");
						}
					}
				}
				if(n != sum)
					System.out.println(n + " is NOT perfect.");
				else
					System.out.println(s);
			}
		}
		
	}
}
