package hashMap;

import java.util.HashMap;

public class exam02 {

// Q. hashmap�� ��ȭ����������� �ְ�, �������� �����϶�

	public static void main(String[] args) {

		HashMap<String, Integer> week = new HashMap<>();
		
		week.put("��", 1);
		week.put("ȭ", 2);
		week.put("��", 3);
		week.put("��", 4);
		week.put("��", 5);
		week.put("��", 6);
		week.put("��", 7);
		
		System.out.println(week);
	}
}
