package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
	
	// CRUD
	// C : CREATE(생성)
	// R : READ(조회)
	// U : UPDATE(수정)
	// D : DELETE(삭제)
	
	Connection con = null;
	// DB에 접속하기 위한 객체
	Statement stmt = null;
	// SQL문을 사용하기 위한 객체
	
	ResultSet rs = null;
	
	public void insert1() {
		
		// 준비단계
		con = DBConnection.DBconnect();
		try {
			stmt = con.createStatement();
			// SQL문 작성
			String sql = "INSERT INTO JAVASQL VALUES('JAVA3', 'SQL3')";
			
			// SQL문 실행
			int result = stmt.executeUpdate(sql);
			
			// SQL문 실행결과 확인
			System.out.println("결과 :" + result);
			
			if(result > 0) {
				System.out.println("insert success!");
			}else {
				System.out.println("insert fail!");
			}
			// stmt문과 DB접속 해제
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void insert() {
			try {
				con = DBConnection.DBconnect();
				stmt = con.createStatement();
				
				// SQL문 작성
				String sql = "INSERT INTO NAVER VALUES('이용자2','111111','홍길동',29,'남','councel111@naver.com','010-1111-2222')";
				stmt = con.createStatement();
				
				
				// SQL문 실행
				int result = stmt.executeUpdate(sql);
				
				// SQL문 실행결과 확인
				System.out.println("결과 :" + result);
				
				if(result > 0) {
					System.out.println("insert success!");
				}else {
					System.out.println("insert fail!");
				}
				// stmt문과 DB접속 해제
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
				
	}
		
		// 회원정보 조회 SELECT
		public void select() {
			
			
			try {
				con = DBConnection.DBconnect();
				stmt = con.createStatement();
				
				String sql = "SELECT * FROM NAVER";
				
				// 조회한 정보를 rs객체에 담는다.
				rs = stmt.executeQuery(sql);
				
				// 튜플(데이터 레코드) 갯수 만큼 반복문
				while(rs.next()) {
					// rs.next() : 데이터 타입은 boolean, 레코드가 존재할 경우 true, 
					// 				더이상 존재하지 않을 경우 false, 반복문을 종료
					System.out.println("아이디 :" + rs.getString(1));
					System.out.println("패스워드 :" + rs.getString(2));
					System.out.println("이름 :" + rs.getString(3));
					System.out.println("나이 :" + rs.getInt(4));
					System.out.println("성별 :" + rs.getString(5));
					System.out.println("이메일 :" + rs.getString(6));
					System.out.println("전화번호 :" + rs.getString(7));
					System.out.println();	
				}
					stmt.close();
					con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 회원정보 수정 UPDATE
		public void update() {
			
			
			
			try {	// 문제가 없으면 try문 실행, catch문 실행x
				con = DBConnection.DBconnect();
				stmt = con.createStatement();
				
				String sql = "UPDATE NAVER SET NAGE = 15 WHERE NID ='COUNCEL0312'";
				
				int result = stmt.executeUpdate(sql);
				
				if(result > 0) {
					System.out.println("update success!");
				}else {
					System.out.println("update fail!");
				}
			} catch (SQLException e) {	// 문제가 생기면 try문 실행x, catch문 실행
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {	// 문제가 생기건 , 문제가 생기지 않건, 무조건 실행
				
			}
		}	// end update()
		
		// 회원정보 삭제 delete()
		public void delete() {
			
			// [1] 준비단계 : con(먼저), stmt(나중) => try, catch문
			// [2] 작성단계 : sql
			// [3] 실행단계 : execute : CUD(int타입 executeUpdate), R(ResultSet타입 excuteQuery)
			// [4] 확인단계 : while, if
			// [5] 해제단계 : close
			
			
			try {
				con = DBConnection.DBconnect();
				stmt = con.createStatement();
				
				String sql = "DELETE FROM NAVER WHERE NID= '이용자2'";
				
				int result = stmt.executeUpdate(sql);
				
				if(result>0) {
					System.out.println("DELETE SUCCESS!");
				}else {
					System.out.println("DELETE FAIL!");
				}
				
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
 }
	
	

