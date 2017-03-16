package Oop.collection;

import java.util.Scanner;

public class ExamProgram {
	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		
		int menu;
		
		 while (true) {

			menu = Exam.inputMenu();

			switch (menu) {
			case 1:
				Scanner scan = new Scanner(System.in);
				String isContiune;
				
				do{
					
					Exam exam = new Exam();
					exam.input();
					list.add(exam);
				System.out.print("continue (y or n);");
				isContiune = scan.nextLine();
				}while(!isContiune.equals("n"));
				

//				for (int i = 0; i < 3; i++) {
//					exams[i].input();
//					count++;
//					System.out.print("continue (yes or no);");
//					isContiune = scan.nextLine();
//					if (isContiune.equals("no")) 
//						break;
//
//					
				

				break;

			case 2:
				System.out.println("┌──────────────────────────────────────────┐");
				System.out.println("│                 성적 출력                                                      │");
				System.out.println("└──────────────────────────────────────────┘");
				for (int i = 0; i < list.size(); i++){
					Exam exam = list.get(i);
					exam.print();
				}

				break;
			case 3:
				break;

			}

		}
	}

}
