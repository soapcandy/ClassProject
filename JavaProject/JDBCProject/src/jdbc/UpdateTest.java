package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

	public static void main(String[] args) {
		
		try {
			// 1. 드라이버 로드: Class.forName("클래스의 풀 네임");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection 객체를 생성: 연결정보
			// jdbcUrl
			// Oracle 연결
			String dbUrl =  "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "hr", "tiger");
			
			// Mysql 연결
//			String dbUrl = "jdbc:mysql://@localhost:3306/project";
//			Connection conn = DriverManager.getConnection(dbUrl, "himedia", "tiger");
			
			// 3. Statement / PerparedStatement -> sql 실행 요청
			// insert Sql
			String sql = "update dept set dname = ?, loc = ? where deptno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "디자인팀");
			pstmt.setString(2, "제주");
			pstmt.setInt(3, 50);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("데이터가 수정되었습니다");
			}
			
			pstmt.close();
			conn.close();
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			System.out.println("연결 실패....");
			e.printStackTrace();
		}
		
		
		
		

	}

}
