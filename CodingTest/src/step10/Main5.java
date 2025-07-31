package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
	날짜: 2025/07/31
	이름: 윤종인
	내용: 백준 10단계 5번 문제 - 대지  
*/

public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int xMax = -10000,xMin = 10000;
		int yMax = -10000,yMin = 10000;
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(xMin > x) 
				xMin = x;
			if(xMax < x) 
				xMax = x;		
			if(yMin > y) 
				yMin = y;
			if(yMax < y) 
				yMax = y;
		}

		System.out.println((xMax - xMin) * (yMax - yMin));
	}
}