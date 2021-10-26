package test;

import java.util.Scanner;

public class q14425 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;

		String[] arr1 = new String[N];
		String[] arr2 = new String[M];

		for (int i = 0; i < N; i++) {
			arr1[i] = sc.next();
		}

		for (int i = 0; i < M; i++) {
			arr2[i] = sc.next();
		}

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i].equals(arr2[j])) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
