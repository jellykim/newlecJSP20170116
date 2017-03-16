package assignment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import assignment.Member;
/**
 * Member Controller
 */
public class MebmerDao {
	public List<Member> getList(String query) throws ClassNotFoundException, SQLException {
		
		String sql = "SELECT * FROM MEMBER WHERE MID LIKE '%"+query+"%'";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		
		//모델
		List<Member> list = new ArrayList<>();
		Member member =null;
		
		while (rs.next()) {
			member = new Member();
			member.setMid(rs.getString("MID"));
			member.setPwd(rs.getString("PWD"));
			
			list.add(member);
		}

		rs.close();
		st.close();
		con.close();
		
		return list;
	}

}
