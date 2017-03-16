package Oop.inter.ui;

import Oop.Inherit.entity.Exam;

public class Program {

	public static void main(String[] args) {
		//Has a 상속
				//1. Composition 
				//2. Association 
				//3. Aggregation 
		
		//has a 상속하기 1
		ExamConsole console = new ExamConsole();
		//has a 상속하기 2
		//import entity.Exam
	/*	Exam exam = new Exam();
		
		console.setExam(exam);*/
		//has a 상속하기 3
//		ExamConsole cons = new ExamConsole(exam);
		
		console.input();
		console.print();
		
		
		
		
	}

}
