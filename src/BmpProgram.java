import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;

public class BmpProgram {
	//24비트 로 변환한 이미지 읽기
	public static void main(String[] args) throws IOException {
	FileInputStream fi = new FileInputStream("res/harongbay.bmp");

	/*int x;
	
	//1바이트씩 출력됨
	x=fi.read();
	System.out.printf("%3x", x);
	x=fi.read();
	System.out.printf("%3x", x);
	x=fi.read();
	System.out.printf("%3x", x);
	x=fi.read();
	System.out.printf("%3x", x);
	x=fi.read();
	System.out.printf("%3x", x);
	x=fi.read();
	System.out.printf("%3x", x);
	//4바이트를 합친 정수를 출력
*/	
	//fileheader 변수에 14개 바이트 배열을 받음
	//비트맵 파일헤더: 시그니처2바이트 - 파일사이즈 4바이트
	byte[] fileheader = new byte[6];
	fi.read(fileheader);
	fi.close();

	//시그니처 2바이트 제외하고 비트연산자(8자리)를 더하는 과정
	//(int)fileheader[0] = 24: 00010101 00000000 00000000 00000000
	//16: 11111111 111111111 10000000 00000000 앞자리 1이면 그 앞은 다 1로 채워짐
	
	//거꾸로 읽으므로 5번째 인덱스부터 
	int fileSize =  (((int)fileheader[5] & 0xff) << 24) 
					| (((int)fileheader[4] & 0xff) << 16)
					| (((int)fileheader[3] & 0xff) << 8)
					| (((int)fileheader[2] & 0xff) << 0);
	// & 0xff를 넣는 이유 - 앞자리 1이면 그 앞은 다 1로 채워짐 그럼 연산할 때 해당 자리가 아닌 11111111이 영향을 줌 
	//그 이후 자리수별로 더할 때 해당 자릿수말고 다 0으로
	System.out.printf("file size : %d", fileSize);
	}
}

