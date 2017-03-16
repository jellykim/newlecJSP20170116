import java.util.Scanner;

public class Changyong {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String enter;
		
						
		while(true){
		
			int out = 0;
			
			System.out.println("입력>");
			enter = scan.nextLine();
			
						
			for(int i=0;i<enter.length();i++){
				char cha = enter.charAt(i);
				if((int)cha<48||(int)cha>57){
							out=1;
							break;					
				}
			}
			
			if(out==1)
				System.out.println("문자를 입력하셨습니다.\n");
			else
				System.out.println("숫자를 입력하셨습니다.\n");					
			
			
		}		

	}

}
