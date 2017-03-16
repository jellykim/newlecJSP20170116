package Oop.array;

import java.util.Scanner;

public class ExamProgram {
	public static void main(String[] args) {
		
		Exam[] exams = new Exam[3];
		//Exam클래스에서 3개(국영수)를 넣는 exams 배열만 생성. 
		//자바에서는 배열이 객체로 취급됨

		int index = 0;
		int capacity = 3;
		
		int menu;
		
		whale : while (true) {

			menu = Exam.inputMenu();

			switch (menu) {
			case 1:
				Scanner scan = new Scanner(System.in);
				String isContiune;
				//
				do{
					if(index >= capacity) // 배열공간이 부족하다면
					{
					   //임시배열 temp를 생성
						Exam[] temp = new Exam[capacity+5];
						//기존 Exam 객체들을 temp방으로 이동
						for (int i = 0; i<index; i++)
							temp[i]=exams[i];
						//창고의 크기를 새로 지정
						capacity+=5;
						//exams가 참조하는 배열을 temp의 배열로 변경
						exams = temp;		
						}
					
					
				exams[index] = new Exam();
				exams[index].input();
				
				index++;
				
				System.out.print("continue (아무키 or n);");
				isContiune = scan.nextLine();
				
				}while(!isContiune.equals("n"));

				break;

			case 2:
				System.out.println("┌──────────────────────────────────────────┐");
				System.out.println("│                 성적 출력                                                      │");
				System.out.println("└──────────────────────────────────────────┘");
				for (int i = 0; i < index; i++)
					exams[i].print();

				break;
				
			case 3:
				break whale;

			}
		}
	}
}
