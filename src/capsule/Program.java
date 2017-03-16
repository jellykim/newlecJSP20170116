package capsule;

public class Program {

	public static void main(String[] args) {
		ExamCapsule exam = new ExamCapsule();
		
		//exam.kor = 20; 
		ExamCapsule.setKor(exam, 20);
		
		ExamCapsule.print(exam);
	}

}
