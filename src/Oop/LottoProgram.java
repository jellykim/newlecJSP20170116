package Oop;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/lotto.khw");
		// 이클립스 Java Prj 안에 있는 상대경로
		Scanner scan = new Scanner(fis);
		// 정수배열 선언/생성
		int[] nums = new int[6];
		// 정수배열에 로또 번호 출력
		for (int i = 0; i < 6; i++) {
			nums[i] = scan.nextInt();
			System.out.print(nums[i] + "  ");
		}
		scan.close();
		fis.close();
		
		System.out.println();
		// nums[1]과 nums[0] 값 바꿔보기
		int temp;
		temp = nums[1];
		nums[1] = nums[0];
		nums[0] = temp;
		for (int i = 0; i < 6; i++) {
			System.out.print(nums[i] + "  ");
		}
		System.out.println();
		// 큰 값을 뒤로
		for (int i = 0; i < 5; i++) {
			if (nums[i] > nums[i + 1]) {
				temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
			}
		}
		for (int i = 0; i < 6; i++)
			System.out.print(nums[i] + "  ");
		System.out.println();
		// 작은 값이 앞에 나오도록 정렬해보기
		// 등차수열 an = a1 + (n-1)*d  -> 5 + (n-1)*-1 
		for (int i = 0; i < 5; i++) {
			for (int z = 0; z < 5-i; z++) {
				if (nums[z] > nums[z + 1]) {
					temp = nums[z];
					nums[z] = nums[z + 1];
					nums[z + 1] = temp;
				}
			}
		}
		for (int i = 0; i < 6; i++)
			System.out.print(nums[i] + "  ");
	}
	//로또번호 중복없이 출력해보기
		Random lotto = new Random();
	//숫자 아무거나 입력받고 짝수 or 홀수를 입력하였습니다 출력

			
}
