package Oop.Inherit;

public class OmokProgram {

	public static void main(String[] args) {
		//객체 준비
		OmokBoard board = new OmokBoard();
		OmokList list = new OmokList();
		
		board.print();
		
		
		while(true) {
		Omok omok = new Omok();
		list.add(omok);
		
		
		omok.input();
		
		board.put(omok);
		
		board.print();
		
		}
	}

}
