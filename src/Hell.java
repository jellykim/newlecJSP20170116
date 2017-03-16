import java.util.Scanner;

class Hell {
	public static void main(String[] args) {
		int kor = 0, eng = 0, esp=0;
		int menu = 0;
		 
		//입력도구 준비
		Scanner scan = new Scanner(System.in);
		//스캐너 이름 = 객체


		jelly: while(true) {
			System.out.println("☆★☆★☆★☆★☆★메인 메뉴☆★☆★☆★☆★☆★");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.종료");
			System.out.println(" 선택 > ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
			{
				System.out.println("<성적 입력>");
				System.out.println("───────────────────");
				
				//do while 예제
				do {
					System.out.print("국어 : ");
					kor = scan.nextInt();
				
					if(0>kor || kor>100)
						System.out.println("성적 입력 범위는 0~100 입니다");
				} while(kor>100 || kor<0);
				
			
//				System.out.print("국어 : ");
//				kor = scan.nextInt();
//				while(kor>100 || kor<0){
//					System.out.println("성적 입력 범위는 0~100 입니다");
//					System.out.println("국어 : ");
//					kor = scan.nextInt();
//				}				
				System.out.print("영어 : ");
				eng = scan.nextInt();
				while(eng>100 || eng<0){
					System.out.println("성적 입력 범위는 0~100 입니다");
					System.out.println("영어 : ");
					eng = scan.nextInt();
				}
				System.out.print("스페인어 : ");
				esp = scan.nextInt();
				while(esp>100 || esp<0){
					System.out.println("성적 입력 범위는 0~100 입니다");
					System.out.println("스페인어 : ");
					esp = scan.nextInt();
				}
				break;
				}
			
			case 2: {
				int total = kor + eng + esp;
				float avg = total / 3;


				System.out.println("┌────────────────────────────────────────────────────┐");
				System.out.println("                  성                 적                출                 력          ");
				System.out.println("└────────────────────────────────────────────────────┘");
				//for 반복 예제
				for(int i=0; i<3; i++){
				System.out.printf("국어 : %d\n", kor);
				System.out.printf("영어 : %d\n", eng);
				System.out.printf("스페인어 : %d\n", esp);
				System.out.printf("총점 : %d\n", total);
				System.out.printf("평균 : %1.2f\n", avg);
				System.out.printf("점수 : %1$3d %2$3d %3$3d\n\n", esp, eng, kor	);
				}
				//esp, eng, kor 순서로 3 너비씩
				break; 
			}

			//			System.out.print("계속? (그만하기:0)");
			//			go = scan.nextInt();

			case 3: {
				System.out.println("bye bye~\n");
				break jelly;
				//while 을 벗어나는 break.
				}
			
			default : 
				System.out.println("메인메뉴는 1~3번 중에 선택합니다");
			
				}
			}
		}
	}

	
