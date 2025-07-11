package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 4단계 8번 문제 - 나머지
*/

public class Main8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<10;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			set.add(arr[i] % 42);
		}
		
		System.out.println(set.size());
	}
}
