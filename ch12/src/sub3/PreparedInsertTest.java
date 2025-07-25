package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
	날짜: 2025/07/25
	이름: 윤종인
	내용: 자바 preparedStatement 실습하기
*/

public class PreparedInsertTest {
	public static void main(String[] args) {
		//DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "whddls0323";
		String pass = "1234";
		
		try {
			//데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//SQL 실행객체 생성(PreparedStatement)
			String sql = "insert into user1 values(?,?,?,?)"; //쿼리 파라미터를 사용한 SQL(준비된 쿼리)
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			//각 쿼리 파라미터를 바인딩
			psmt.setString(1, "P101"); 
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1222-3333");
			psmt.setInt(4, 34);
			
			//SQL 실행
			psmt.executeUpdate(); //insert,update,delete는 executeUpdate() 실행.
			
			//결과처리(select 경우)
			
			//데이터베이스 종료
			psmt.close();
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
	}
}
