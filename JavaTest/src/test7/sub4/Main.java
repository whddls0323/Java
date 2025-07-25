package test7.sub4;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Board board = new Board();
		
		User user1 = new User("A101","김유신");
		User user2 = new User("A102","김춘추");
		User user3 = new User("A103","장보고");
		
		Article article1 = new Article(1,"안녕하세요.","내용1",user1);
		Article article2 = new Article(2,"반갑습니다.","내용2",user2);
		Article article3 = new Article(3,"감사합니다.","내용3",user3);
		
		Comment comment1 = new Comment(101,"1번글의 101번 댓글 입니다.");
		Comment comment2 = new Comment(102,"2번글의 102번 댓글 입니다.");
		Comment comment3 = new Comment(103,"1번글의 103번 댓글 입니다.");
		Comment comment4 = new Comment(104,"3번글의 104번 댓글 입니다.");
		
		article1.addComment(comment1);
		article1.addComment(comment3);
		article1.addComment(comment2);
		article1.addComment(comment4);

		board.addArticle(article1);
		board.addArticle(article2);
		board.addArticle(article3);
		
		List<Article> articles = board.getArticles();
		
		System.out.println("--------------------------------------");
		System.out.println("| 번호 | 제목 | 내용 | 작성자 |");
		System.out.println("--------------------------------------");
		
		for(Article article : articles) {
			System.out.print("| "+article.getNo()+" | ");
			System.out.print(article.getTitle()+" | ");
			System.out.print(article.getContent()+" | ");
			System.out.print(article.getUser().getName()+" |\n");
			System.out.println("--------------------------------------");
			
			List<Comment> comments = article.getComments();
			for(Comment comment : comments) {
				System.out.println("└ "+comment.getContent());
			}
			System.out.println("--------------------------------------");
		}
	}
}
