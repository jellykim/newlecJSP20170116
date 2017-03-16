import java.util.Random;

public class CardProgram {

	public static void main(String[] args) {
		
		//1~52까지 카드 배열
		int[] cards = new int[52];
		for(int i=0; i<52; i++) 
			cards[i] = i+1;		
			for(int z=0; z<52; z++)
				System.out.printf("%3d", cards[z]);
		
		//인덱스3 값과 인덱스7 값 바꾸기	
		int temp;
		int left = 3;
		int right = 7;
		
		temp = cards[left];
		cards[left] = cards[right];
		cards[right] = temp;
		
		System.out.println();
		
		for(int i=0; i<52; i++) {
			System.out.printf("%3d", cards[i]);
		}
		
		//100번 반복, 랜덤하게 섞기
			Random rand = new Random();	
				int temp2;
				for(int i=0; i<100; i++) {
				int left2 = rand.nextInt(52);
				int right2 = rand.nextInt(52);
		 
				temp2 = cards[left2];
				cards[left2] = cards[right2];
				cards[right2] = temp2;
				}
				System.out.println();
				
				for(int i=0; i<52; i++) {
					System.out.printf("%3d", cards[i]);
				}
	}
}


