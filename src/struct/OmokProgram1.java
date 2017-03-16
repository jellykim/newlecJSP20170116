package struct;
import java.util.Scanner;

public class OmokProgram1 {

	public static void main(String[] args) {
		//오목판 생성
		char[][] board = createBoard();
		
		//오목판 그리기 
		drawBoard(board);
	
		//오목판 출력
		printBoard(board);
		}

	public static char[][] createBoard() {
		char[][] bod = new char[15][20];
		return bod;
	}
	
	public static void drawBoard(char[][] board) {
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				board[y][x]='╇';
		}
	}
	public static void printBoard(char[][] board) {
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				System.out.print(board[y][x]);
			System.out.println();
				
		}
		
	}
}
	


