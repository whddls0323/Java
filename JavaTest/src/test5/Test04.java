package test5;

/*
	날짜 : 2025/07/23
	이름 : 윤종인
	내용 : 자바 문자열 연습문제
*/

public class Test04 {
	public static void main(String[] args) {
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0,idx);
		String ext = fileName.substring(idx + 1);
		
		System.out.println("파일명: " + title);
		System.out.println("확장자: " + ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(", ");
		
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(score);
		}
		
		System.out.println("strScore 총점: " + total);
	}
}
