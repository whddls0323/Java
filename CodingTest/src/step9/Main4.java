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
	내용: 백준 9단계 4번 문제 - 소수 찾기
*/

public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<n;i++) {
			List<Integer> list = new ArrayList<>();
			
			if(arr[i] > 1) {
				for(int j=2;j<=arr[i];j++) {
					if(arr[i] % j == 0) {
						list.add(j);
					}
				}
				if(list.size() == 1)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}
