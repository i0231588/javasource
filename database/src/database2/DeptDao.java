package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//~~Dao : DataBase 작업을 담당하는 클래스임
public class DeptDao {
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	//커넥션을 위한 드라이버 로드
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "TIGER";
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return con;
	} 
	public void close(Connection con,PreparedStatement pstmt ) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//하나 조회
	public DeptDTO getRow(int deptno) {
		con = getConnection();
		
		String sql = "select*from dept_temp where deptno=10";
		DeptDTO dto = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				deptno= rs.getInt(1);
				String dname = rs.getString(2);
				String loc =rs.getString(3);
				
				dto = new DeptDTO(deptno, dname, loc);
				
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt);
		}
		return dto;
	}

	//select-all
	public ArrayList<DeptDTO> getRows() {
		ArrayList<DeptDTO> list = new ArrayList<>();
		try {
			
			con = getConnection();
			String sql = "select * from dept_temp";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			int deptno = rs.getInt(1);
			String dname = rs.getString(2);
			String loc = rs.getString(3);
			DeptDTO dto = new DeptDTO(deptno, dname, loc);
			
			list.add(dto);
			
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt);
		}
		return list;
	}//getRows 종료
	//새 부서 추가 메소드
	public boolean insert(int deptno, String dname, String loc) {
		
		//insert 성공 여부
		boolean status = false;
		
		try {
			
			con = getConnection();
			String sql = "insert into dept_temp(deptno,dname,loc) values(?,?,?)";
			
			
			pstmt = con.prepareStatement(sql);
			//? 처리
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt);
		}
		return status;
	}
	
	
	
	public boolean update(String value,int deptno,int updateNo) {
		boolean status = false;
		String sql = null;
		try {con =getConnection();
		
		if(updateNo == 1) {
			//부서 수정
			sql = "update dept_temp set dname=? where deptno=?";
		}else if(updateNo==2) {
			//위치수정
			sql = "update dept_temp set loc=? where deptno=?";
		}
		
			pstmt = con.prepareStatement(sql);
			// ? 처리
			pstmt.setString(1, value);
			pstmt.setInt(2, deptno);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				status = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt);
			
		}
		return status;
	}
	
	public boolean remove(int deptno) {
		boolean status = false;
		
		try {
			con =getConnection();
			
			
			
			String sql = "delete from dept_temp where deptno=?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) status = true;
			
			
		} catch (Exception e) {
			
		}finally {
			
		}
		return status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
