package hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class b19583 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();

		int s = Integer.parseInt((a.replace(":", ""))); // 2200
		int e = Integer.parseInt((b.replace(":", ""))); // 2300
		int q = Integer.parseInt((c.replace(":", ""))); // 2330

		/*
		 * 0~2259 까지는 출석은 한거고 ||| 2300~2329 까지 퇴실시간 ||| 2330~~ 이후는 노체크
		 * System.out.println(s + " " + e + " " + q); System.out.println(s + e + q); 이거
		 * 근데 몇개를 받는다는거지? String tempkey = br.readLine(); String value = br.readLine();
		 * List<Map.Entry<Integer, String>> entryList = new
		 * LinkedList<>(map.entrySet()); entryList.sort(new
		 * Comparator<Map.Entry<Integer, String>>() {
		 * @Override public int compare(Entry<Integer, String> o1, Entry<Integer,
		 * String> o2) { // TODO Auto-generated method stub return 0; } });
		 */
		
		/*
		 * 음.... 일단 문제를 이렇게 파악함 위에 예제를 보면 23시 이전에 입실한 애들은 일단 입실 그리고 2300 ~2330 에 같은 value가 찍혀야 출석이 확인됨
		 * 그래서 나는 0 <= x <=2300 범위의 값들을 해시맵에 넣고
		 * 2301 <= x <=2329 까지에 value 가 같으면 카운트 한다.
		 */
		
		
		
		String tempkey = br.readLine();
		String value = br.readLine();

		while (tempkey != null && value != null) { // 즉 00:00~23:59의 시간만 주어진다
			int key = Integer.parseInt((tempkey.replace(":", ""))); // 21:30 malkoring 2130(int) malkoring(String)
			map.put(key, value);

			for (int i = 0; i <e; i++) {
			}
			
		}
	}
}
