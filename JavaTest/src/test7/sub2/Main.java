package test7.sub2;

/*
	날짜 : 2025/07/25
	이름 : 윤종인
	내용 : 자바 총정리 연습문제
*/

public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer("E001","데스크탑",150,10,"삼성전자");
		computer.printProductInfo();
		System.out.println("----------------");
		
		Clothes tshirt = new Clothes("C001","T-Shirt",20,50,"L");
		tshirt.printProductInfo();
		System.out.println("----------------");
	}
}
