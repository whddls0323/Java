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
	내용: 백준 5단계 9번 문제 - 상수
*/

public class Main9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		String c = "", d = "";
		
		for(int i=a.length() - 1;i>=0;i--) 
			c += a.charAt(i);

		for(int i=b.length() - 1;i>=0;i--) 
			d += b.charAt(i);
		int result = Math.max(Integer.parseInt(c),Integer.parseInt(d));
		System.out.println(result);
	}
}
