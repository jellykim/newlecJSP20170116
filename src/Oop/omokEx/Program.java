package Oop.omokEx;

public class Program {

	public static void main(String[] args) {
		//객체 준비
		Omok omok = new Omok();
		Board board = new Board();
		
		board.print();
		
		omok.input();
		
		board.put(omok);
		
		board.print();
		
	}

}
