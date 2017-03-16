package Oop.Inherit.UI;

import java.util.Scanner;

import Oop.Inherit.entity.Exam;

public class ExamConsole {
	
	private Exam exam;
	//private: 캡슐화. 다른 사람이 Exam.으로 접근해 exam을 바꾸면 다 바꿔야되니
	//유지보수를 위해. 나중에 exam을 바꾸게되도 여기서만 바꾸면 됨
	//Exam은 객체틀 exam은 식별자(객체 아님)
	//함수 안에서는 Exam exam = new Exam(); 가능 
	
	
/*	public void setExam(Exam a) { // Exam exam = test;
		this.exam = a;
	}
*/
	//생성자 - 빈 exam에 Exam객체를 넣어줌
	public ExamConsole(){
		
	}
	
	public void print() {
		
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		
		int total =exam.total();
		float avg = exam.avg();
			
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n\n", eng);
			System.out.printf("총점 : %d\n", total);
			System.out.printf("평균 : %.2f\n", avg);
		
	}	

	public void input() {
	
		int kor;
		int eng;
		int math;
		
		Scanner scan = new Scanner(System.in);
	    
		
			System.out.println("┌──────────────────────────────────────────┐");
			System.out.println("│                 성적 입력                                                      │");
			System.out.println("└──────────────────────────────────────────┘");
			
			do{
			System.out.print("국어 :");
			kor = scan.nextInt();
			if(kor < 0 || kor > 100)
			System.out.println("성적의 입력 범위는 0~100까지 입니다.");
			}while (kor < 0 || kor > 100);

			do{
			System.out.print("수학 :");
			math = scan.nextInt();
			if(math < 0 || math > 100)
				System.out.println("성적의 입력 범위는 0~100까지 입니다.");
			}while (math < 0 || math > 100);
			
			do{
			System.out.print("영어 :");
			eng = scan.nextInt();
			if(eng < 0 || eng > 100)
			System.out.println("성적의 입력 범위는 0~100까지 입니다.");
			}while (eng < 0 || eng > 100);
		
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);
		}
		
	public static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("┌──────────────────────────────────────────┐");
		System.out.println("│                 메인 메뉴                                                      │");
		System.out.println("└──────────────────────────────────────────┘");
		System.out.print("1.성적입력\n");
		System.out.print("2.성적출력\n");
		System.out.print("3.종료\n");
		System.out.print("선택>");
		int menu = scan.nextInt();
		return menu;
	}


	

}

	
	

