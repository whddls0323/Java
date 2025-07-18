package p199;


/*
	날짜: 2025/07/18
	이름: 윤종인
	내용: 교재 p191 생성자 실습하기
*/

public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		this("","");
		System.out.println("생성자 호출됨"); 
	}
	
	public Book(String title) {
		this(title,"작자미상");
	}
	
	public Book(String title,String autho) {
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new 
				Book();
		
		loveStory.show();
	}
}
