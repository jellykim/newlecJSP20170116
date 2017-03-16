package Oop.omokEx;

import java.util.Scanner;

public class Omok {
	//Omok클래스의 데이터구조: int, 캡슐화를 위한 private
	private int enterx;
	private int entery;
	//private한 enterx를 public으로  리턴하는 getter
	//source -> getter and setter. 
	public int getX() {
		return enterx;
	}
	public int getY() {
		return entery;
	}
	
	public void input() {
		Scanner omok = new Scanner(System.in);
		System.out.println("좌표를 입력하세요");
		int enterx = omok.nextInt();
		int entery = omok.nextInt();
	}	
	
}
