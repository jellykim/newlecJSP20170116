package Oop.Inherit;

import java.util.Scanner;

public class Exam {
  //개체 entity
	private int kor;
	private int eng;
	private int math;
	
	public static void setKor(Exam exam,int kor){
		exam.kor = kor;
		
	}
	
	public  void print() {
		
		int kor = this.kor;
		int eng = this.eng;
		int math = this.math;
		
		
			int total = kor + math + eng;
			float avg = total / 3;

			

			
			System.out.printf("경제 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n\n", eng);
			System.out.printf("총점 : %d\n", total);
			System.out.printf("평균 : %.2f\n", avg);
		
	}
	

		
		
		
	

	public  void input() {
	
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
		
			this.kor =kor;
			this.eng =eng;
			this.math= math;
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

	
	

