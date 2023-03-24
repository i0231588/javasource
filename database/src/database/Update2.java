package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url,user,password);
			
			System.out.println("부서코드 입력: ");
			int deptno = sc.nextInt();
			System.out.println("변경할 부서명 입력: ");
			String dname = sc.next();
			
			String sql = "update dept_temp set dname = ? where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptno);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("업데이트 성공");
			}
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
