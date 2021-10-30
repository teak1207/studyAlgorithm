package hashMap;

import java.util.HashMap;

public class exam02 {

// Q. hashmap에 월화수목금토일을 넣고, 수요일을 제거하라

	public static void main(String[] args) {

		HashMap<String, Integer> week = new HashMap<>();
		
		week.put("월", 1);
		week.put("화", 2);
		week.put("수", 3);
		week.put("목", 4);
		week.put("금", 5);
		week.put("토", 6);
		week.put("일", 7);
		
		System.out.println(week);
	}
}
