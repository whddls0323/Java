package test4.sub4;

/*
	날짜 : 2025/07/17
	이름 : 윤종인
	내용 : 자바 클래스 문제
*/

public class Main { //다시
	public static void main(String[] args) {
		
		Book book = new Book("자바 프로그래밍","제임스 고슬링","101-1234-1001");
		
		Member member = new Member("홍길동","A001");
		
		book.getBookInfo();
		System.out.println("--------------------");
		
		member.borrowBook(book);
		System.out.println("--------------------");
		
		book.getBookInfo();
		System.out.println("--------------------");
		
		member.getMemberInfo();
		System.out.println("--------------------");
		
		member.borrowBook(book);
		System.out.println("--------------------");
		
		member.returnBook(book);
		System.out.println("--------------------");

		member.getMemberInfo();
		System.out.println("--------------------");
	}
}
