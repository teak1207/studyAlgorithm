package hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b7785 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = sc.nextInt();// 출입 기록수
		for (int i = 0; i < n; i++) {

			// String value 받아서 split 쪼개서 K,V 나눠서 넣기
			String temp = br.readLine();
			String[] result = temp.split(" ", 2);
			map.put(result[0], result[1]);
		}
		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);

		System.out.println(map);

		// map에 V가 enter이면 보여줘라
		for (Map.Entry<String, String> key : map.entrySet()) {
			// System.out.println(key.getKey() +" "+key.getValue() );

			if (key.getValue().equals("enter")) {
				System.out.println(key.getKey());
			}
		}
		sc.close();
	}

}
