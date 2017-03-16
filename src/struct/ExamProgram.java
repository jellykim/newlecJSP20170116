package struct;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		int menu=0;
		
		Exam exam = new Exam();
		//형식 객체이름 = new 객체
		
		//함수의 첫 제어문
		while(menu!=3) {	//3번이 아니면 계속 돌려
			menu = inputMenu();//while 안에 넣어야 메뉴가 계속 돔
				switch(menu){
				case 1: 
					input(exam);
					break; //1번을 멈추고 switch 문으로
				case 2: 
					print(exam);
					break;
				case 3:
					break;
				}
				
			}
	}

		//함수들
	public static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("☆★☆★☆★☆★☆★메인 메뉴☆★☆★☆★☆★☆★");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.println(" 선택 > ");
		int menu = scan.nextInt();
		return menu;
	}
	
	public static void input(Exam exam) {
		System.out.println("<성적 입력>");
		System.out.println("───────────────────");
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		
		//do while 예제
		do {
			System.out.print("국어 : ");
			kor = scan.nextInt();
		
			if(0>kor || kor>100)
				System.out.println("성적 입력 범위는 0~100 입니다");
		} while(kor>100 || kor<0);
		
		System.out.print("영어 : ");
		eng = scan.nextInt();
		while(eng>100 || eng<0){
			System.out.println("성적 입력 범위는 0~100 입니다");
			System.out.println("영어 : ");
			eng = scan.nextInt();
		}
		System.out.print("스페인어 : ");
		math = scan.nextInt();
		while(math>100 || math<0){
			System.out.println("성적 입력 범위는 0~100 입니다");
			System.out.println("스페인어 : ");
			math = scan.nextInt();
		}
		exam.kor=kor;
		exam.eng=eng;
		exam.math=math;
	}
	
	public static void print(Exam exam) {
		int kor=exam.kor;
		int eng=exam.eng;
		int math=exam.math;
		
		int total = kor + eng + math;
		float avg = total / 3;

		System.out.println("<성적 출력>");
		System.out.println("───────────────────");
		
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %1.2f\n", avg);
		System.out.printf("점수 : %1$3d %2$3d %3$3d\n\n", math, eng, kor	);
		}
		//esp, eng, kor 순서로 3 너비씩
		
	}

