package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 4단계 9번 문제 - 바구니 뒤집기
*/

public class Main9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int a=0;a<n;a++) 
			arr[a] = a + 1;
		
		for(int b=0;b<m;b++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			List<Integer> list = new ArrayList<>();
			
			for(int c=i-1;c<=j-1;c++) 
				list.add(arr[c]);
			
			int cnt = 0;
			for(int c=j-1;c>=i-1;c--) {
				arr[c] = list.get(cnt);
				cnt++;
			}
		}
		
		for(int item : arr)
			System.out.print(item + " ");
	}
}
