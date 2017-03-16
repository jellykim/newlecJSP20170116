package Oop.nested;

public class Program {

	public static void main(String[] args) {
		//Aa의 객체생성
		Aa a = new Aa();
		//Bb의 객체생성
		Aa.Bb b = a.new Bb();
		//Cc의 객체생성
		Aa.Cc c = new Aa.Cc();
		b.f1();
		//그냥 a1 하면 함수안에 선언된 7
		//this.a1 하면 5
		//3이 나오도록? new Aa().a1 , AA.this.a1
		
		
		new Aa();
		//System.out.println(Aa.a1);
		
	}

}
