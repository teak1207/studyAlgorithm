package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//  HashMap<K, V> 
public class exam01 {

	public static void main(String[] args) {

		HashMap<String, Integer> cafe = new HashMap<>();

		cafe.put("coffee", 20000);
		cafe.put("juice", 23000);
		cafe.put("snack", 26000);

		// System.out.println(cafe);

		System.out.println(cafe.get("coffee"));
		System.out.println(cafe.get("juice"));
		System.out.println(cafe.get("snack"));

		System.out.println(cafe.containsKey("snack"));
		System.out.println(cafe.containsKey("gun"));
		System.out.println("");
		System.out.println(cafe.containsValue(2000));
		System.out.println(cafe.containsValue(20000));

		Set cafeMenu = cafe.entrySet();
		System.out.println("cafeMenu ==>" + cafeMenu);
		
		Iterator i = cafeMenu.iterator();

		while (i.hasNext()) {
			System.out.println(i.next()+"*");
		}
		
		System.out.println("");
		System.out.println("cafe ==>" + cafe);
		System.out.println("cafeMenu ==>" + cafeMenu);
		
	}
}
