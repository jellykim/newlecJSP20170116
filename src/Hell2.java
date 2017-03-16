import java.util.Scanner;

public class Hell2 {
	public static void main(String[] args){
		//변수선언
		int kor = 0, eng = 0, esp = 0, menu = 0;
		//입력도구 Scanner
		Scanner scan = new Scanner(System.in);
		//while 반복문 실행
		jelly:while(true) {
			System.out.println("★메뉴 선택☆");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			menu = scan.nextInt();
			//메뉴 선택할 switch 분기문 실행. 입력한 menu 값에 따른 switch 분기문 실행
			switch(menu) {
			//1을 눌렀을 경우
			case 1: {
				System.out.println("성적 입력");
				//국어 입력
				System.out.println("국어: ");
				kor = scan.nextInt();
				//잘못된 값 입력할 경우 대비
				while(kor>100 || kor<0){
					System.out.println("0~100까지 입력 가능합니다");
					kor = scan.nextInt();
				}
				System.out.println("영어: ");
				eng = scan.nextInt();
				while(eng>100 || eng <0){
					System.out.println("0~100");
					eng = scan.nextInt();
				}
				System.out.println("스페인어: ");
				esp = scan.nextInt();
				while(esp<0 || esp>100){
					System.out.println("0~100");
					esp = scan.nextInt();
				}
			}
			break;
			case 2:	{
				int total = kor + eng + esp;
				float avg = total /3;

				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("스페인어 : " + esp);
				System.out.println("총점 : " + total);
				System.out.println("평균 : \n" + avg);
				break;}
			case 3: {
				System.out.println("종료합니다");
				break jelly;}

			default: {
				System.out.println("선택할 메뉴를 눌러주세요");
				}
			}
		}
	}
}
