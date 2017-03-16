package jdbc.service;

import java.util.List;
import java.util.Scanner;

import jdbc.dao.oracle.OracleMemberDao;
import jdbc.data.dao.MemberDao;
import jdbc.data.entity.Member;

public class MemberService {
	private MemberDao memberDao = new OracleMemberDao();
	private List<Member> list = memberDao.getList();
	Scanner scan = new Scanner(System.in);
	
	public int inputMenu(){
		int menu=0;
		System.out.println("=====메인 메뉴=====");
		System.out.println("1. 회원관리");
		System.out.println("2. 게시글 관리");
		System.out.println("3. 종료");
		menu = scan.nextInt();
		
		return menu;
	}
	
	//메인 메뉴 선택 - 1.회원관리
	public void getMember() {
		int menu=0;
		System.out.println("=====회원관리=====");
		System.out.println("아이디\t이름\t전화번호 ");
		System.out.println("----------------------------");
		for(Member m:list)
			System.out.println(m.getMid()+"\t"+m.getName()+"\t"+m.getPhone());
		do{
			System.out.println("1.추가  2.수정  3.삭제 4.상위메뉴 ");
			System.out.println("메뉴 =>");
			menu=scan.nextInt();
			selectFun(menu);
		}while(menu!=4);
	}


	//서브 메뉴 선택
	public static void selectFun(int menu){
		MemberDao memberDao = new OracleMemberDao();
		Scanner scan = new Scanner(System.in);
		switch(menu){
		case 1:	//회원 추가
			System.out.println("회원 추가");
			Member m = new Member();
			System.out.println("아이디 : ");
			String mid = scan.nextLine();
			System.out.println("이름 : ");
			String name = scan.nextLine();
			System.out.println("전화번호 :");
			String phone = scan.nextLine();
			
			m.setMid(mid);
			m.setName(name);
			m.setPhone(phone);
			
			memberDao.add(m);
			
			System.out.println("계속 입력 : y");
			
			if(scan.nextLine().equals("y")) {
				selectFun(menu);
			}
			else{
			}
				break;
		case 2:
			System.out.println("=====회원 수정=====");
			
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			
		}
	}
}