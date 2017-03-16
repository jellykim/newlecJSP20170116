package Oop.abstrac.entity;

import java.util.Scanner;

public abstract class Exam {
  //개체 entity
	private int kor;
	private int eng;
	private int math;
	   
	   public Exam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
	public int total() {
		return kor+eng+math;
	}
	public abstract float avg();
}


	
	

