package array;

import java.util.Scanner;

public class step4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {

				if ((arr[i] != arr[j])) {
					cnt++;
				} else {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
