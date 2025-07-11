package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 4단계 10번 문제 - 평균
*/

public class Main10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double m = 0;
		double[] arr = new double[n];
		double sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			if(m < arr[i])
				m = arr[i];
		}
		
		for(int i=0;i<n;i++) 
			sum += arr[i] / m * 100;
		System.out.println(sum / n);
	}
}
