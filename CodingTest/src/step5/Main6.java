package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
	날짜: 2025/07/11
	이름: 윤종인
	내용: 백준 5단계 6번 문제 - 알파벳 찾기
*/

public class Main6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr1 = new char[26];
		int[] arr2 = new int[26];
		String s = br.readLine();
		
		for(int i=0;i<26;i++)
			arr1[i] = (char) (96 + i + 1);
		
		for(int i=0;i<26;i++)
			arr2[i] = -1;
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<26;j++) {
				if(s.charAt(i) == arr1[j] && arr2[j] == -1)
					arr2[j] = i;
			}
		}
		
		for(int item : arr2)
			System.out.print(item + " ");
	}
}
