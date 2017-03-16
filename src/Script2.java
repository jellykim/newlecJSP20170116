import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Script2 {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream gg = new FileInputStream("res/script.txt");
		Scanner scan = new Scanner(gg);
		Scanner ii = new Scanner(System.in);
		String gx = scan.nextLine();
		System.out.println(gx);

	}

}
