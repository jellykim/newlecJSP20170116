package assignment;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import assignment.dao.MebmerDao;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//MVC
		//-----------Controller
		MebmerDao memberDao = new MebmerDao();
		System.out.println("======회원검색 프로그램======");
		System.out.println("아이디로 검색(1) 이름 검색(2) 나이검색(3) 종료(4)");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		switch(input){
		case 1:	//id 검색
			System.out.println("아이디 입력");
			Scanner scan1 = new Scanner(System.in);
			String uid = scan.nextLine();
			List<Member> idlist = memberDao.getList(uid);
			System.out.println("\n아이디\t이름\t나이");
			for(Member m:idlist)
				System.out.println(m.getMid()+"\t"+m.getName()+"\t"+m.getAge());
			break;
		case 2: //이름 검색
		}
	}

}
