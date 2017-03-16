import java.io.FileInputStream;
import java.util.Scanner;

public class Jinyoung2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		/*int su = str.length();
		char ch = str.charAt(su-1);
		*/
		//아스키코드값을 알아보기 위한
		/*for(int i=0; i<str.length(); i++)
			System.out.println((int)str.charAt(i));*/
		//
		for(int i=0; i<str.length(); i++){
			
			if(48 > str.charAt(i) || str.charAt(i) <57)
				System.out.println("문자");
			else 
				 System.out.println("숫자");
		}
	
	}
}
