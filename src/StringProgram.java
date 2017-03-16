public class StringProgram {

	public static void main(String[] args) {
		String x = new String("젤리");
		String y = "젤리";
		String z = "젤리";
		//"젤리"은 값처럼 보이는 객체. 값 아님. x,y,z,는 객체명(참조변수(함수를 갖고있음)).
		//String x = new String("젤리");와 String y = "젤리"; 
		//컴파일러가 알아서 new String 을 앞에 생략해 작성해준다
		//문자열 값이 같은 것에는 비교하지 않고 같은 애로 참조
		//(ex: y==z 비교가 아니라 y==y로 비교)
		System.out.println(x==y);	//false. "젤리"는 값이 아님
		//값을 비교하려면 .equals()
		System.out.println(x.equals(y));	//true
		//문자열 길이 알아보려면? 객체.함수()
		String fileName = "photo.jpg";
		System.out.println(fileName.length());
		System.out.println(fileName.indexOf("to"));
		System.out.println(fileName.substring(0,5));
		System.out.println(fileName.substring(0, fileName.indexOf(".")));
		System.out.println(fileName.substring(fileName.indexOf("."), fileName.indexOf("g")+1));
		System.out.println(fileName.endsWith(".jpg"));
		String data = "설리,설현,홍욱";
		String[] names = data.split(",");
		String aa = names[0] + names[1];
		String ab = names[0].concat(names[2]);
		System.out.println(ab);
		//String[] 배열 ,로 목록 1개.
		System.out.println(names.length); //목록 3개 출력
		
	}

}
