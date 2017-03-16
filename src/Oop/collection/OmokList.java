package Oop.collection;

public class OmokList {
	private Omok[] Omoks;
	private int index;
	private int capacity;

	public OmokList() {
		Omoks = new Omok[3];
		index = 0;
		capacity = 3;

	}

	public void add(Omok Omok) {

		if (index >= 2) // 배열공간이 부족하다면
		{
			// 임시배열 temp를 생성
			Omok[] temp = new Omok[index + 5];
			// 기존 Omok 객체들을 temp방으로 이동
			for (int i = 0; i < index; i++)
				temp[i] = Omoks[i];
			// 창고의 크기를 새로 지정
			capacity += 5;
			// Omoks가 참조하는 배열을 temp의 배열로 변경
			Omoks = temp;

		}

		Omoks[index] = Omok;
		index++;

	}

	public Omok get(int i) {
		
		return Omoks[i];
	}

	public int size() {
		
		return index;
	}

}
