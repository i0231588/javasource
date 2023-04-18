package shop2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static shop2.JdbcUtil.*;
public class UserDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	
	public boolean insert(int userId, String name, int payNo) {
		boolean status = false;
		
		try {
			con = getConnection();
			
			String sql = "insert into suser(user_id,name,pay_no) values (?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setString(2, name);
			pstmt.setInt(3, payNo);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) status=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return status;
	}
	public List<UserDTO> getList(){
		List<UserDTO> list = new ArrayList<>();
		
		try {
			//String sql = "select * from suser";
			String sql = "select u.user_id,u.name,u.pay_no,p.info "
			+ "from suser u ,paytype p "
			+ "where u.pay_no = p.pay_no and u.user_id=1000";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				UserDTO dto = new UserDTO(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
//				list.add(dto);
				list.add(new UserDTO(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
}
