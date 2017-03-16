import java.util.Random;

public class Lottohomework {

	public static void main(String[] args) {
		//랜덤으로 받을 랜덤유틸 임포트
		Random rand = new Random();
		//6칸짜리 정수배열 선언
		int[] lotto = new int[6];
		
		//for문으로 1~45까지 6칸에 넣기
		for (int num = 0; num < 6; num++) {
			lotto[num] = rand.nextInt(45) + 1;
			//1~45까지 중복되지 않게
			for (int check = 0; check < num; check++) {
				if (lotto[num] == lotto[check]) {
					num--;
				}
			}			
		}
		//작은 수부터 정렬
		for(int num=0;num<6;num++){
			for(int check=num;check<6;check++){
				if(lotto[check]<lotto[num]){
					int temp;
					temp = lotto[num];
					lotto[num] = lotto[check];
					lotto[check] = temp;
				}
			}
		}
		//배열[0]부터 [5]까지 출력하기
		for (int num = 0; num < 6; num++)
			System.out.printf("%d\t",lotto[num]);
		
	}
}
