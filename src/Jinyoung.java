import java.util.Random;
import java.util.Scanner;

public class Jinyoung {

	public static void main(String[] args) {
				
			//숫자 아무거나 입력받고 짝수 or 홀수를 입력하였습니다 출력
				Scanner scan = new Scanner(System.in);
				while(true) {
				System.out.println("숫자를 입력하세요");
				int gg = scan.nextInt();
				if (gg%2>0)
				System.out.println("홀수입니다");
				else
					System.out.println("짝수입니다");
				System.out.println();
				}
	}

}
