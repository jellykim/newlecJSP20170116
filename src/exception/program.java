package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class program {

	public static void main(String[] args) {
		FileOutputStream fis = null;
		// 예외처리 : 예외
		// 오류: 1. 구문오류 2. 논리오류 3. 예외오류
		// 버그 -> 2번 오류
		// 파일복사 프로그램 - > 예외적인 상황: 디스크가 베드, 용량이 없는것

		// APP <-->API를 이용
		// 용량,권환,베드 모든 문제를 체크는: API가 해주게 되는것*/
		// 예외 상황에 대한 처리 : APP
		// API는 상황상 예외가 발생했다 이거 어떻게 처리할래? --> APP
		// API 가 전달하는 시스템
		// APP은 그것을 처리하는..

		try {
			Calculator.add(20,10);
			
			fis = new FileOutputStream("aa.txt");
			fis.write(52);
			
		} catch (FileNotFoundException e) {
			System.out.println("죄송합니다. 입력하신 파일을 찾을수가 없습니다.");	
			//정리작업 필요
		} catch (Exception e) {
			System.out.println("죄송합니다. 출력의 문제가 발생했습니다.");	
		}finally{
		//정리작업
		System.out.println("정리합니다");
		try {
			fis.close();
		} catch (IOException e) {
			
		}
	}
}
}