package jdbc.data.entity;

import java.util.List;
import java.util.Scanner;
import jdbc.dao.mysql.MySQLMemberDao;
import jdbc.data.dao.MemberDao;

public class Program {

	public static void main(String[] args) {
		
		
		
		
		//MVC
		//MVC는 데이터 수집을 최소화해야 하기 때문에 선수집 후출력의 방법론을 가지고 있다
		//데이터를 가져오는 작업도 분리하여 다양한 외부 환경 조건(윈도우, 콘솔)에서도 사용 가능하게 해야 한다
		//자바는 UI역할. 데이터를 가공하는 것이 아님. 사용자와 상호작용하는 역할만 담당
		
		
		/*==CONTROLLER==============================================================*/
		MemberDao memberDao = new MySQLMemberDao();
		
		/*System.out.println("\t\t[회원 검색 프로그램]");
		System.out.print("검색 분류 [아이디(1), 이름(2), 나이(3)] : ");
		Scanner scan = new Scanner(System.in);
		
		int Input = scan.nextInt();
		
		switch (Input) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.out.print(s);
		}
		*/
		
		
		System.out.print("검색 할 아이디 : ");
		Scanner scan = new Scanner(System.in);
		String uid = scan.nextLine();
		List<Member> list = memberDao.getList(uid);
		
		for(Member m : list)
			System.out.printf("id는 '%s'이고 비밀번호는 '%s'이다\n", m.getId(), m.getPwd());
		
		/*Member t = new Member();
		t.setId("망나뇽");
		t.setPwd("가랏");
		t.setName("오마이갓");
	
		memberDao.add(t);
		
		list = memberDao.getList(uid);
		
		System.out.println("——————————————");
		
		for(Member m : list)
			System.out.println("아이디는 : "+m.getId()+"이고 비밀번호는 : "+m.getPwd()+"이다.");*/
		
		
		//CONTROLLER 전체 부분을 복사하여 MemberDao에 붙여넣었음
		//데이터와 조작을 한 곳에 구현하면 위험해짐
		//구분하게 되면 컨트롤러와 뷰 간의 협업도 용이해짐 (병행이 가능해짐)
		//재사용의 가치가 높아진다!
		/*String sql = "SELECT  * FROM MEMBER WHERE GENDER LIKE '%남%'";
	      
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	            
	    String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	    Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    
	    //구조적인 데이터 = 사용자 형식 = 개체
	    //구조적인 데이터를 사용하는 이유
	    // -1. 
	    // -2. 
	    // -3. 데이터를 한번에 담아서 처리할 수 있다.
	    
	    
	    //while 대신에 if를 넣으면 string mid=null;하고 하면 모델 자체가 되어버림
	    String mid;
	    String pwd;  
	    String gen;
	    List<Member> list = new ArrayList<>();
	    Member member = null;
	    

	    while(rs.next()){
	    	member = new Member();
	    	member.setMid(rs.getString("MID"));
	    	member.setPwd(rs.getString("PWD"));
	    	
	    	list.add(member);
	    mid = rs.getString("MID");
	    pwd = rs.getString("PWD");
	    gen  = rs.getString("GENDER");
	    }
	    
	    //닫아 줘야 하는 이유는 데이터베이스는 연결되어 있기 때문에 연결된 상태로 되어 버림
	    //데이터베이스 연결 제한이 있는 경우가 있기 때문
	    rs.close();
	    st.close();
	    con.close();*/

	    
	    /*==MODEL==============================================================*/
	    
	    
	    /*==ViEW==============================================================*/
	    
	    //if 대신에 상단 String sql에 WHERE MID LIKE '%a%'를 넣으면 동일한 기능을 한
    	/*if(mid.contains("a"))*/
	    for(Member m:list)
	    	System.out.println("아이디는 "+m.getId()+"이고, 비밀번호는 "+m.getPwd()+"이다.");
	}

	private static void Switch (int input) {
		// TODO Auto-generated method stub
		
	}

}