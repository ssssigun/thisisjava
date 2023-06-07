package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.logging.annotations.StringBlinder;

public class AccountExample {

	public static void main(String[] args) {
		
		boolean on = true;
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		
		Connection conn = null;;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		while(on) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 >");
			String inputNum = scan.nextLine();
			
			if("1".equals(inputNum)) {
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				
				System.out.print("계좌번호 : ");
				String accountNum = scan.nextLine();
				
				System.out.print("계좌주 : ");
				String name = scan.nextLine();
				
				System.out.print("초기입금액 : ");
				int accountMoney = Integer.parseInt(scan.nextLine());
				
				registerAccount(accountNum, name, accountMoney);
				
				System.out.println("결과 : 계좌가 생성되었습니다.");		//계좌 등록
				
			}
		
			else if("2".equals(inputNum)) {
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				
				listAccount();
				
			}
			else if("3".equals(inputNum)) {
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				
				System.out.print("게좌번호 : ");
				String accNum = scan.nextLine();
				System.out.print("예금액 : ");
				int accMoney = Integer.parseInt(scan.nextLine());
				
				depositAccount(accNum,accMoney);
				
				
			}
			else if("4".equals(inputNum)) {
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				
				System.out.print("게좌번호 : ");
				String accNum = scan.nextLine();
				System.out.print("출금액 : ");
				int accMoney = Integer.parseInt(scan.nextLine());
				
				withdrawAccount(accNum,accMoney);
				
				/*
				for(int i=0; i<cnt; i++) {
					if(accNum.equals(bankAccount[i].getAccountNum())) {
						
						if(accMoney>bankAccount[i].getAccountMoney()) {
							System.out.println("출금액이 통장 잔고보다 많습니다!");
						}
						else {
							bankAccount[i].minusAccountMoney(accMoney);
							System.out.println("출금이 성공되었습니다.");
						}
					}
				}*/
				
			}
			else if("5".equals(inputNum)) {
				
				on = false;
			}
			else {
				System.out.println("다시 입력하세요!");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		//////////////////////////////////////////////////////////////////////////////////

	}
	
	private static void registerAccount(String accountNum, String name, int accountMoney) {		//INSERT
		ResultSet rs = null;
		Connection conn = null;;
		PreparedStatement pstmt = null;
		
		try {
//			1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. DB 접속
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "testuser", "test1234");
			
			String sql = "INSERT INTO account(accountNum, name, accountMoney) VALUES (?, ?, ?)";
//			3. statement 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accountNum);
			pstmt.setString(2, name);
			pstmt.setInt(3, accountMoney);
//			4. sql 실행(처리)
//			select -> executeQuery : ResultSet리턴
//			insert/update/delete -> executeUpdate : int 리턴
			int row = pstmt.executeUpdate();
			
//			5. 결과처리(커서 형태)
			System.out.println("등록되었습니다!");
			
//			6. 해제(close) -> finally
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			/*
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}*/
			
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(pstmt != null) try {pstmt.close();}catch (Exception e) {}
			if(conn != null) try {conn.close();}catch (Exception e) {}
			
		}
	}
	private static void listAccount() {										//SELECT
		Connection conn = null;;
		Statement stmt = null;
		ResultSet rs = null;
	
		try {
//			1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. DB 접속
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "testuser", "test1234");
			
//			3. statement 객체 생성
			stmt = conn.createStatement();
			
//			4. sql 실행(처리)
//			select -> executeQuery : ResultSet리턴
//			insert/update/delete -> executeUpdate : int 리턴
			String sql = "SELECT * FROM account";
			rs = stmt.executeQuery(sql);
			
//			5. 결과처리(커서 형태)
			while(rs.next()) {
				System.out.println(rs.getInt("num")+ ".\t" + rs.getString("accountNum")+"\t"+rs.getString("name") +"\t"+ rs.getInt("accountMoney"));
			}
			
//			6. 해제(close) -> finally
			
			System.out.println();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			/*
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}*/
			
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(stmt != null) try {stmt.close();}catch (Exception e) {}
			if(conn != null) try {conn.close();}catch (Exception e) {}
			
		}
	}
	private static void depositAccount(String accNum, int accMoney) {		//UPDATE
		ResultSet rs = null;
		Connection conn = null;;
		PreparedStatement pstmt = null;
		Statement stmt = null;

		try {
//			1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. DB 접속
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "testuser", "test1234");
			

			String sql1 = ("UPDATE account SET accountMoney = accountMoney + ? WHERE accountNum=?");
			
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, accMoney);
			pstmt.setString(2, accNum);
//			4. sql 실행(처리)
//			select -> executeQuery : ResultSet리턴
//			insert/update/delete -> executeUpdate : int 리턴
			int row = pstmt.executeUpdate();
			
//			5. 결과처리(커서 형태)
			System.out.println("예금하였습니다!");
			
//			6. 해제(close) -> finally
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			/*
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}*/
			
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(pstmt != null) try {pstmt.close();}catch (Exception e) {}
			if(conn != null) try {conn.close();}catch (Exception e) {}
			
		}
	}
	private static void withdrawAccount(String accNum, int accMoney) {		//UPDATE
		ResultSet rs = null;
		Connection conn = null;;
		PreparedStatement pstmt = null;
		Statement stmt = null;

		try {
//			1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2. DB 접속
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "testuser", "test1234");
			

			String sql1 = ("UPDATE account SET accountMoney = accountMoney - ? WHERE accountNum=?");
			
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, accMoney);
			pstmt.setString(2, accNum);
//			4. sql 실행(처리)
//			select -> executeQuery : ResultSet리턴
//			insert/update/delete -> executeUpdate : int 리턴
			int row = pstmt.executeUpdate();
			
//			5. 결과처리(커서 형태)
			System.out.println("출금하였습니다!");
			
//			6. 해제(close) -> finally
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			/*
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}*/
			
			if(rs != null) try {rs.close();}catch (Exception e) {}
			if(pstmt != null) try {pstmt.close();}catch (Exception e) {}
			if(conn != null) try {conn.close();}catch (Exception e) {}
			
		}
	}
	

}
