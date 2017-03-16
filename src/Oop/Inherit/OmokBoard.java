package Oop.Inherit;

public class OmokBoard {
	
	private char[][] buffer;
	
	
	public OmokBoard() {
		//생성자
		buffer = new char[15][20];
		
		for (int y = 0; y < 15; y++)
			for (int x = 0; x < 20; x++)
					buffer[y][x] = '╁';
	}
	
	public void print() {
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				System.out.print(buffer[y][x]);
				System.out.println();
		}
		
	}

	public void put(Omok omok) {
		//임시변수 x,y
		int x = omok.getX();
		int y = omok.getY();
			buffer[y][x]='☆';	 //x,y를 정의하지 않고 =buffer[omok.getX()][omok.gety()]='☆';
	}


	
}
