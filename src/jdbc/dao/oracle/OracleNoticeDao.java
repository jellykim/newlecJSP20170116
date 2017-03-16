package jdbc.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.data.dao.NoticeDao;
import jdbc.data.entity.Member;
import jdbc.data.view.NoticeView;

public class OracleNoticeDao implements NoticeDao{

	@Override
	public List<NoticeView> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NoticeView> getList(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NoticeView> getList(int page, String field, String query) {
		
		
		int page = "SELECT FROM ";
		String field = "SELECT FROM NOTICE ";
		String query = "SELECT * FROM MEMBER WHERE MID LIKE '%"+query+"%'";
		String writerName = "SELECT FROM NOTICE W";
		int commentCount;
		List<NoticeView> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			
			//모델
			
			Member member = null;
			
			while (rs.next()) {
				member = new Member();
				member.setMid(rs.getString("MID"));
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
		
		return null;
	}

}
