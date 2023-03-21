package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			con = DriverManager.getConnection(url,user,password);
			
//			if(con!=null) {
//				System.out.println("연결되었습니다.");
//			}
			
			//emp 테이블에 있는 내용 가져오기
//			String sql = "select * from emp";
			String sql = "select * from emp where deptno=20";
			
			//서버로 sql 구문 전송
			pstmt = con.prepareStatement(sql);
			//전송된 sql 구문 실행 후 결과를 ResultSet 객체에 담게 됨
			rs = pstmt.executeQuery();
			
			//ResultSet 객체 안에 한 행씩 읽어오면서 화면 출력
			//rs.next(): ResultSet 객체 안에 행이 존재한다면 ture 돌려줌
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getInt(6)+"\t");
				System.out.print(rs.getInt(7)+"\t");
				System.out.println(rs.getInt("deptno"));
			}
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
