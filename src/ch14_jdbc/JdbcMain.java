package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import ch14_jdbc_jdbc.ConnectionFatory;

public class JdbcMain {
	public static void main(String[] args) {
		while (true) {
			System.out.println("학사 정보 시스템입니다.");
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 조회 | 2. 수정 | 3. 추가 (q:종료)");
			String msg = sc.nextLine();
			if (msg.equalsIgnoreCase("q")) {
				System.out.println("학사 정보 시스템 종료");
				break;
			}
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			ConnectionFatory factory = ConnectionFatory.getInstance();

			// 1. 조회는 이름을 입력받아서(like검색) 다 출력
			if (msg.equals("1")) {
				try {
					System.out.println("찾을 학생의 이름을 입력해주세요");
					String search = sc.nextLine();
					
					conn = factory.getConnection();
					System.out.println("접속 성공");

					StringBuffer query = new StringBuffer();
					query.append(" SELECT *");
					query.append(" FROM tb_info");
					query.append(" WHERE nm = ?");
					ps = conn.prepareStatement(query.toString());
					ps.setString(1, search);
					rs = ps.executeQuery();
					// 조회결과 만큼 반복
					while (rs.next()) {
						int no = rs.getInt("info_no");
						String pcno = rs.getString("pc_no");
						String nm = rs.getString("nm");
						String ennm = rs.getString("en_nm");
						String email = rs.getString("email");
						String hobby = rs.getString("hobby");
						Date cdate = rs.getDate("create_dt");
						Date udate = rs.getDate("update_dt");
						String mbti = rs.getString("mbti");

						System.out.println("번호:" + no + "\n" + "pc번호:" + pcno);
						System.out.println("이름:" + nm + "\n" + "영문이름:" + ennm);
						System.out.println("이메일:" + email + "\n" + "취미:" + hobby);
						System.out.println("생성날짜:" + cdate + "\n" + "갱신날짜:" + udate);
						System.out.println("MBTI:" + mbti + "\n");
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
			// 2. 수정은 취미를 입력받아서 변경되도록
			if(msg.equals("2")) {
				try {
					System.out.println("찾을 학생의 이름을 입력해주세요");
					String search = sc.nextLine();
					System.out.println("취미 내용을 입력해주세요");
					String hb = sc.nextLine();
					
					conn = factory.getConnection();
					System.out.println("접속 성공");

					StringBuffer query = new StringBuffer();
					query.append(" UPDATE tb_info");
					query.append(" SET hobby = ?");
					query.append(" WHERE nm = ?");
					ps = conn.prepareStatement(query.toString());
					ps.setString(1, hb);
					ps.setString(2, search);
					int cnt = ps.executeUpdate();
					// 조회결과 만큼 반복
					if(cnt > 0) {
						System.out.println(cnt + "건 수정됨");
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
		}
	}
}
