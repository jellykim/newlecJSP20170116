package Oop.nested;

public class Aa {
	//a1은 Aa클래스와 상관없는 전역변수
	//public으로 바꾸면 모든 클래스에서 가능
	private int a1;
	public int a2;
	
	//static 변수의 static 생성자. 
/*	static {
		a1=10;
	}
	*/
	public Aa(){
		a1=3;
	}
	
	//Aa의 인스턴스 메서드
	public void f2(){
		a1=4;
		Bb b = new Bb();
		//Bb b = this.new Bb();
	}
	
	//Aa의 스테틱 메서드
	public static void f3(){
		Bb b = new Aa().new Bb();
		//static은 this 안 됨. 
	}
	
	class Bb{
		private int a1 = 5;
		public void f1(){
			int a1=7;
			System.out.printf("a1: %d\n", Aa.this.a1);
		}
	}
	
	static class Cc{
		int a1=30;
		public void f4(){
		//Aa 클래스 와 별도인 static Cc
			Bb b = new Aa().new Bb();
		}
		
	}
	
	
}
