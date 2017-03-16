package jdbc.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdbc.data.dao.MemberDao;
import jdbc.data.entity.Member;

public class OracleMemberDao implements MemberDao {
	//멤버테이블 전체 불러오기
	@Override
	public List<Member> getList() {
		
		String sql = "SELECT * FROM MEMBER";
		List<Member> list = new ArrayList<>();  
		
	    try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(sql);
		    
		    Member member = null;
		    
		    while(rs.next()){
		    	member = new Member();
		    	member.setMid(rs.getString("MID"));
		    	member.setName(rs.getString("NAME"));
		    	member.setPhone(rs.getString("PHONE"));
		    	
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
	
	//아이디 검색 불러오기
	@Override
	public List<Member> getList(String query) {

		String sql = "SELECT * FROM MEMBER WHERE MID LIKE '%"+query+"%'";
		List<Member> list = new ArrayList<>();  
		
	    try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(sql);
		    
		    Member member = null;
		    
		    while(rs.next()){
		    	member = new Member();
		    	member.setMid(rs.getString("MID"));
		    	member.setName(rs.getString("NAME"));
		    	member.setPhone(rs.getString("PHONE"));
		    	
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
	
	//회원 추가
	@Override
	public int add(Member member) {

		String sql = "INSERT INTO MEMBER(MID, NAME, PHONE) VALUES(?,?,?)";

		
	    try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		    PreparedStatement st = con.prepareStatement(sql);
		    st.setString(1, member.getMid());
		    st.setString(2, member.getName());
		    st.setString(3, member.getPhone());
		    
		    while(rs.next()){
		    	member = new Member();
		    	member.setMid(st.getString("MID"));
		    	member.setName(st.getString("NAME"));
		    	member.setPhone(st.getString("PHONE"));
		    	
		    	list.update(member);
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
	
	//회원 수정
	@Override
	public update(Member member) {
		
		String sql = "UPDATE MEMBER SET MID=?, NAME=?, PHONE=? WHERE NAME=?";
		
		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
			    PreparedStatement st = con.prepareStatement(sql);
			    st.setString(1, member.getMid());
			    st.setString(2, member.getName());
			    st.setString(3, member.getPhone());
			    st.setString(4, member.getName());
			    
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

	//회원 삭제
	@Override
	public int delete(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}


}