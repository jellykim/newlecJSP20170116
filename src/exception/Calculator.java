package exception;

public class Calculator {
	public static int add(int x, int y) throws 백을넘는오류 {
		//오류를 throw한 곳에 오류가 제일 먼저 오기 때문에 생성한 곳에서는 던져버려야 함
		int result = x + y;
		// 예외 상황 1 : 절대로 합의 결과가 100은 넘어서는 안된다.
		if(result>100)
			//예외 오류 발생 -> 내가 조치해야하나? - > 안된다..
			throw new 백을넘는오류(); //여기서 클래스는 오류를 알리는 식별자
		
		return result;
	}

	public static int sub(int x, int y) {
		int result = x - y;

		return result;
	}

}
