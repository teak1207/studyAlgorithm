package array;

import java.util.Scanner;

public class step6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		String str;
		for (int i = 0; i < input; i++) {

			str = sc.next();
			int sum = 0;
			int cnt = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
				}
				System.out.println(sum);
			}
		}
	}
}
