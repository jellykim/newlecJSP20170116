package jdbc.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.data.dao.MemberDao;
import jdbc.data.entity.Member;

public class MySQLMemberDao implements MemberDao {

	@Override
	public List<Member> getList(String query) {

		String sql = "SELECT * FROM MEMBER WHERE ID LIKE '%"+query+"%'";
		List<Member> list = new ArrayList<>();  
		
	    try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://211.238.142.84/newlecture?autoReconnect=true&amp;useSSL=false";
		    Connection con = DriverManager.getConnection(url, "newlec", "sclass");
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(sql);
		    
		    Member member = null;
		    

		    while(rs.next()){
		    	member = new Member();
		    	member.setId(rs.getString("ID"));
		    	member.setPwd(rs.getString("PWD"));
		    	
		    	list.add(member);
		    }

		    rs.close();
		    st.close();
		    con.close();
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	            
	    return list;
		    
	}

	@Override
	public int add(Member member) {

		String sql = "INSERT INTO MEMBER(ID, PWD, NAME, PHONE, REGDATE) VALUES(?,?,?,?,SYSDATE)";

		
	    try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://211.238.142.84/newlecture?autoReconnect=true&amp;useSSL=false";
		    Connection con = DriverManager.getConnection(url, "newlec", "sclass");
		    PreparedStatement st = con.prepareStatement(sql);
		    st.setString(1, member.getId());
		    st.setString(2, member.getPwd());
		    st.setString(3, member.getName());
		    st.setString(4, member.getPhone());
		    
		    //결과가 있는 쿼리 executeQuery()
		    //SELCT
		    
		    //결과가 없는 쿼리 executeUpdate()
		    //INSERT / UPDATE / DELETE
		    int result = st.executeUpdate();
		    
		    st.close();
		    con.close();
		    
		    return result;
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	            
	    return 0;
	}

}