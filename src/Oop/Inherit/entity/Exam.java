package Oop.Inherit.entity;

import java.util.Scanner;

public class Exam {
  //개체 entity
	private int kor;
	private int eng;
	private int math;
		
	public Exam(int kor2, int eng2, int math2) {
		this.kor=kor2;
		this.eng=eng2;
		this.math=math2;
		
	}
	public Exam() {
		this(10,10,10);
	}
	public int total() {
		return kor+eng+math;
	}
	public float avg() {
		return total()/3.0f;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}


	
	

