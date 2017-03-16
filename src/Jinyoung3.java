import java.util.Scanner;

public class Jinyoung3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ipk = scan.nextLine();
		
		//char 배열에 입력값만큼 배열 선언
		char[] cha = new char[ipk.length()];
		//cha배열마다 단어 넣기
		for(int j=0; j<ipk.length(); j++) 
			cha[j]=ipk.charAt(j);
		//cha 배열을 거꾸로 출력
		for(int i=ipk.length(); i>0; i--)
			System.out.print(cha[i-1]);
		scan.close();
	}
}
