package hashMap;

import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {

		String[] arr1 = { "mislav", "stanko", "mislav", "ana" };
		String[] arr2 = { "stanko", "ana", "mislav" };

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String a : arr1)
			map.put(a, map.getOrDefault(a, 0) + 1);
		System.out.println(map);

	}
}
