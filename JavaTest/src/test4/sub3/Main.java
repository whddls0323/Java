package test4.sub3;

/*
	날짜 : 2025/07/17
	이름 : 윤종인
	내용 : 자바 클래스 문제
*/

public class Main {
	public static void main(String[] args) {
		
		MovieTicket ticket = new MovieTicket("타이타닉","19:00","A1");
		
		ticket.printTicketInfo();
		System.out.println("-------------------------");
		
		ticket.bookTicket();
		System.out.println("-------------------------");
		
		ticket.printTicketInfo();
		System.out.println("-------------------------");
		
		ticket.bookTicket();
		System.out.println("-------------------------");
		
		ticket.cancelBooking();
		System.out.println("-------------------------");
		
		ticket.printTicketInfo();
		System.out.println("-------------------------");
		
		ticket.cancelBooking();
		System.out.println("-------------------------");
	}
}
