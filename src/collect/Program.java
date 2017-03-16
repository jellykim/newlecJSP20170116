package collect;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		//데이터 수집방식 3가지. Set형 컬렉션, List형 컬렉션, Map형 컬렉션
		
		//Set 계열 // 데어터 자체가 식별자
		Set s = new HashSet();
		
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(2);
		s.add(3);
		for(Object o : s)
			System.out.println(o);
		
		//List형
		List list = new ArrayList();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(3);
		for(Object o : list)
			System.out.println(o);
		
		int n = (int)list.get(0);
		
		//Map형
		Map map = new HashMap();
		
		map.put("나이", 19);
		map.put("몸무게", 80);
		map.put("키", 190);
		for(Object k : map.keySet())
			System.out.println(map.get(k));
	}

}
