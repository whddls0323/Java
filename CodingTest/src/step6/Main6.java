package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/15
	이름: 윤종인
	내용: 백준 6단계 6번 문제 - 크로아티아 알파벳
*/

public class Main6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String s = br.readLine();
		
		for(int i=0;i<arr.length;i++) {
			if(s.contains(arr[i]))
				s = s.replace(arr[i], "!");
		}
		System.out.println(s.length());
	}
}
