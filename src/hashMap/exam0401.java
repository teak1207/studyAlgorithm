package hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class exam0401 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<String, Integer> hashmap = new HashMap<>();

		int n = Integer.parseInt(br.readLine());

		String[] array = new String[n];
		String answer = "";
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			array[i] = br.readLine();
		}

		for (String i : array)
			hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);

		for (String key : hashmap.keySet()) {

			if (hashmap.get(key) > max) {
				max = hashmap.get(key);
				answer = key;
			}
		}
		System.out.println(answer);
	}
}
