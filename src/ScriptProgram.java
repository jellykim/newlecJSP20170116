import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScriptProgram {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("res/script.txt"); 
		Scanner scan = new Scanner(fis);
		//파일 스캔과 내가 입력한 값 받는 차이
		Scanner ascan = new Scanner(System.in);
		String query = "truck";
		String line = scan.nextLine();
		/*
		 while(scan.hasNext()) {
		 
			line = scan.nextLine();
			if(line.indexOf(query) > 0)
			System.out.println(line);
		} 
		*/
		
		System.out.println("찾을 단어: ");
		String qeery = ascan.nextLine();
		
		while(scan.hasNext()) 	{
			line = scan.nextLine();
			if(line.indexOf(qeery) > 0)
				System.out.println(line.replace(qeery, "[qeery]"));
			
			if(line.indexOf(qeery) < 0)
				System.out.println("찾는 단어가 없습니다");
		} 
		scan.close();
	//사용자에게 찾을 단어 받고 포함된 문장 출력하기 + 라인번호 출력해주기
	}

}
