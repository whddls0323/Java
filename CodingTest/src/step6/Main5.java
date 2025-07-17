package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/14
	이름: 윤종인
	내용: 백준 6단계 5번 문제 - 단어 공부
*/

public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toLowerCase();
		char[] arr1 = new char[26];
		int[] arr2 = new int[26];
		int max = 0;
		String result = "";
		
		for(int i=0;i<26;i++) 
			arr1[i] = (char) (97 + i);
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<26;j++) {
				if(s.charAt(i) == arr1[j])
					arr2[j] += 1;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(max < arr2[i]) {
				max = arr2[i];
				result = arr1[i] + "";
			}
			else if(max == arr2[i]) {
				result = '?' + "";
			}
		}
		System.out.println(result.toUpperCase());
	}
}
