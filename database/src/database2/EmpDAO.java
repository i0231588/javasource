package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//드라이버로드, 커넥션, select + DML 정의
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "TIGER";
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//select-all : 무조건 ArrayList 리턴
	public ArrayList<EmpDTO> getList(String ename){
		ArrayList<EmpDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();
			//ename이 홍길동인 사람 조회(empno, ename,job,hiredate)
			
			String sql = "select empno,ename,job,hiredate from emp_temp where ename=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ename);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpDTO empDTO = new EmpDTO();
				empDTO.setEmpno(rs.getInt(1));
				empDTO.setEname(rs.getString(2));
				empDTO.setJob(rs.getString(3));
				empDTO.setHiredate(rs.getDate(4));
				
				list.add(empDTO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return list;
	}
	//select one : DTO 리턴
	public EmpDTO getRow(int empno) {
		EmpDTO empDTO = null;
		try {
			
			con = getConnection();
			
			String sql = "select empno,ename,job,sal,comm,deptno from emp_temp where empno=?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, empno);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				empDTO = new EmpDTO();
				empDTO.setEmpno(rs.getInt(1));
				empDTO.setEname(rs.getString(2));
				empDTO.setJob(rs.getString("job"));
				empDTO.setSal(rs.getInt("sal"));
				empDTO.setComm(rs.getInt("comm"));
				empDTO.setDeptno(rs.getInt("deptno"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return empDTO;
	}
	public boolean update(int sal, int empno) {
		boolean status = false;
		try {
			
			con = getConnection();
			
			String sql = "update emp_temp set sal = ? where empno = ?";
			
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sal);
			pstmt.setInt(2,empno);
			int result = pstmt.executeUpdate();
			if(result>0) status =true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return status;
	}
	//사원 삭제
	public boolean remove(int empno) {
		boolean status = false;
		
		try {
			
			con = getConnection();
			
			String sql = "delete from emp_temp where empno=?";
			
			pstmt.setInt(1, empno);
			
			pstmt = con.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			if(result>0) status = true;
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
			
		}
		return status;
	}
	
	public boolean insert(EmpDTO empDTO) {
		
		boolean status = false;
		
		try {
			con = getConnection();
			
			String sql = "insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
			sql += "values(?,?,?,?,sysdate,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, empDTO.getEmpno());
			pstmt.setString(2, empDTO.getEname());
			pstmt.setString(3, empDTO.getJob());
			pstmt.setInt(4, empDTO.getMgr());
			pstmt.setInt(5, empDTO.getSal());
			pstmt.setInt(6, empDTO.getComm());
			pstmt.setInt(7, empDTO.getDeptno());
			
			int result = pstmt.executeUpdate();
			if(result>0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
