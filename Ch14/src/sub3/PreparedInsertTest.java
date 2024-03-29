package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/01/23
 * 이름 : 김형민
 * 내용 : PreparedStatement 실습하기 
 */
public class PreparedInsertTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "gudals";
		String pass = "1234";
				
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			// 3단계 - SQL실행 객체 생성
			String sql = "INSERT INTO `USER1` VALUES(?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1,"c103");
			psmt.setString(2,"문정완");
			psmt.setString(3,"95-11-16");
			psmt.setString(4,"010-1234-1111");
			psmt.setInt(5,26);
			// 4단계 - SQL실행
			psmt.executeUpdate();
			
			// 5단계 - 결과처리(SELECT 경우)
			
			
			// 6단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
		
		
	}
	
}
