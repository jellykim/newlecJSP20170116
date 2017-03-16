import java.util.Scanner;

public class OmokProgram1 {

	public static void main(String[] args) {
		// 오목판 그리기
		// char[] board = new char[15열*20행];
		char[][] board = new char[15][20];

		// 오목판 초기화
		for (int y = 0; y < 15; y++)
		for (int x = 0; x < 20; x++)
				board[y][x] = '╁';
		
		// 오목판 출력
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				System.out.print(board[y][x]);
				System.out.println();
		}

		// 오목 좌표입력
		Scanner omok = new Scanner(System.in);
		System.out.println("좌표를 입력하세요");
		int enterx = omok.nextInt();
		int entery = omok.nextInt();
		board[entery-1][enterx-1] = '○';
		
		// 오목판 출력
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				System.out.print(board[y][x]);
			System.out.println();
			}
		}
	}


