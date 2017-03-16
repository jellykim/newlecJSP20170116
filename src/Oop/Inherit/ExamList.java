package Oop.Inherit;

public class ExamList {
	private Exam[] exams;
	private int index;
	private int capacity;

	public ExamList() {
		exams = new Exam[3];
		index = 0;
		capacity = 3;

	}

	public void add(Exam exam) {

		if (index >= 2) // 배열공간이 부족하다면
		{
			// 임시배열 temp를 생성
			Exam[] temp = new Exam[index + 5];
			// 기존 Exam 객체들을 temp방으로 이동
			for (int i = 0; i < index; i++)
				temp[i] = exams[i];
			// 창고의 크기를 새로 지정
			capacity += 5;
			// exams가 참조하는 배열을 temp의 배열로 변경
			exams = temp;

		}

		exams[index] = exam;
		index++;

	}

	public Exam get(int i) {
		
		return exams[i];
	}

	public int size() {
		
		return index;
	}

}
