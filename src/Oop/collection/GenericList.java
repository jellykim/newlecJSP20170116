package Oop.collection;

public class GenericList<Jelly> {
	private Jelly[] objects;
	private int index;
	private int capacity;

	public GenericList() {
		objects = (Jelly[]) new Object[3];
		index = 0;
		capacity = 3;

	}

	public void add(Jelly Object) {

		if (index >= 2) // 배열공간이 부족하다면
		{
			// 임시배열 temp를 생성
			Jelly[] temp = (Jelly[]) new Object[index + 5];
			// 기존 Object 객체들을 temp방으로 이동
			for (int i = 0; i < index; i++)
				temp[i] = objects[i];
			// 창고의 크기를 새로 지정
			capacity += 5;
			// Objects가 참조하는 배열을 temp의 배열로 변경
			objects = temp;

		}

		objects[index] = Object;
		index++;

	}

	public Jelly get(int i) {
		
		return objects[i];
	}

	public int size() {
		
		return index;
	}

}
