package ch20.oracle.sec05.acc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAO {

	private Connection conn = null;;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	for(int i = 0; i<10;i++) {
		System.out.println(i);
	}
	
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "testuser", "test1234");
//	} catch (Exception e) {
//		
//	}
}

