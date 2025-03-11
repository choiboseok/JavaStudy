package ch14_jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import ch14_jdbc_jdbc.ConnectionFatory;
import oracle.jdbc.connector.OracleManagedConnectionFactory;

public class JdbcInsert {
	public static void main(String[] args) {
		// db연결 객체
		Connection conn = null;
		// SQL 명령 
		PreparedStatement ps = null;
		// 쿼리 결과
		ResultSet rs = null;
		// 드라이브 연결, 계정 접속
		ConnectionFatory factory = ConnectionFatory.getInstance();
		
		try {
			conn = factory.getConnection();
			System.out.println("접속 성공");
			System.out.println("auto 커밋 상태:" + conn.getAutoCommit());
			conn.setAutoCommit(false); // 비활성 시 수동으로 commit 해야함.
			
			StringBuffer query = new StringBuffer(); // 많은 텍스트를 사용할때는 Buffer를 사용
			query.append(" INSERT INTO tb_info(info_no, pc_no, nm, en_nm, email)");
			query.append(" VALUES (?, ?, ?, ?, ?)");
			ps = conn.prepareStatement(query.toString());
			ps.setInt(1, 16); 
			ps.setInt(2, 27); 
			ps.setString(3, "신입"); 
			ps.setString(4, "New"); 
			ps.setString(5, "신입@New.com"); 
			int cnt = ps.executeUpdate(); // 쿼리문 실행, 실행후 자동 커밋
			if(cnt > 0) {
				System.out.println(cnt + "행이 삽입됨");
				conn.commit();
			} else {
				System.out.println("대상건이 없음.");
				conn.rollback();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("접속 종료");
			if(conn != null) {try {conn.close();} catch(SQLException e) {}}
			if(rs != null) {try {conn.close();} catch(SQLException e) {}}
			if(ps != null) {try {conn.close();} catch(SQLException e) {}}
		}
	}
	public void ConnClassLoad() {
		Properties prop = new Properties();
		InputStream reader = getClass().getClassLoader().getResourceAsStream("config/db.properties");
		try {
			prop.load(reader);
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("id"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}