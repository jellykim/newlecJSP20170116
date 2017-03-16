import java.util.Scanner;

public class OmokPro2 {

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

		Scanner wmok = new Scanner(System.in);
		Scanner bmok = new Scanner(System.in);
		System.out.println("좌표를 입력하세요");
		
		// 오목 좌표입력
		int mokx = wmok.nextInt();
		int moky = wmok.nextInt();
		int mokyy = 0;
		int mokxx = 0;
		board[moky-1][mokx-1] = '☆';
		board[mokyy][mokxx] = '★';
		//번갈아 두는 포문
		for (int y = 0; y < 15; y++) {
				for (int x = 1; x < 20; x++) 			
					if (x%2==1)
						board[moky-1][mokx-1]='☆';
					else
						board[moky-1][mokx-1]='★';
									}
		
		// 오목판 출력
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				System.out.print(board[y][x]);
			System.out.println();
			}
		}
	}


