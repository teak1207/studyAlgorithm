package test;

import java.util.Scanner;

public class codeup1261 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int n = 0;
		// 10개의 수를 입력받는다
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 5 == 0) {
				System.out.print(" " + arr[i]);
				n++;
				break;
			}
		}
		if (n == 0) {
			System.out.println("0");
		}
	}
}
