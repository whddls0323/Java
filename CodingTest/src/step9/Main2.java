package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/23
	이름: 윤종인
	내용: 백준 9단계 2번 문제 - 약수 구하기
*/

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(n % i == 0)
				list.add(i);
		}
		try {
			System.out.println(list.get(k-1));
		} catch(IndexOutOfBoundsException e) {
			System.out.println(0);
		}
	}
}
