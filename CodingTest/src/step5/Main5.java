package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 5단계 5번 문제 - 숫자의 합
*/

public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		arr = br.readLine().split("");
		int sum = 0;
		
		for(String item : arr) 
			sum += Integer.parseInt(item);
		System.out.println(sum);
	}
}
