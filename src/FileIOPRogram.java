import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIOPRogram {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("C:\\Projects\\Workspace2\\data.moks");
		//OS에서 제공하는 FileOutputStream 파일 출력 개체를 임포트해 fo 객체를 만들었다
		//절대경로
		//문자열 안에 \는 escape 문자로 인식하므로 \\두번 해야 경로로 인식.		
		FileInputStream fis = new FileInputStream("res/data.khw");
		//이클립스 Java Prj 안에 있는 상대경로 
		Scanner scan = new Scanner(fis);
		int num;
		int total = 0;
		
//		while(scan.hasNext()){
//			//hasNext 다음 값, while로 마지막 값까지 쭉 출력
//			num = scan.nextInt();
//			System.out.printf("num : %d\n", num);
//		}
		
		//num들의 합 출력해보기
//		while(scan.hasNext()){
//			num = scan.nextInt();
//			total = total + num;
//		}
//		System.out.printf("total = %d", total);
//	break;}
		
		//num 중에서 홀수만 더해보기
//		while(scan.hasNext()){
//			num = scan.nextInt();
//			if(num%2==1) {
//		total = num + total;
//		System.out.printf("total = %d", total);
//		}
//		break;}
		//num 중에 3번째 까지만 더하기
			
		
				while(scan.hasNext()){
					for(int i=0; i<3; i++){
					num = scan.nextInt();
					total = num + total;
				}
				System.out.printf("total = %d", total);
			break;}
			
	//%d 정수를 10진수로 표현하는 거 
	//		num = scan.nextInt();
	//		System.out.printf("num : %d\n", num);
	//		num = scan.nextInt();
	//		System.out.printf("num : %d\n", num);


//	//여러줄 주석: ctrl shift / 
//	System.out.println("작업완료");
//	//문자열로 출력하기
//	//자동임포트 ctrl shift o
//	PrintStream fower = new PrintStream(fo);
//	fower.print("지각대장 홍욱이");
}
}