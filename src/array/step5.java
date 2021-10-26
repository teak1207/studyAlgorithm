package array;

import java.util.Scanner;

public class step5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 몇번 입력받는지
		int N = sc.nextInt(); // 3
		// N만큼 배열 할당
		int[] arr = new int[N]; // [3]

		int max;
		double sum = 0;
		// 배열의 인덱스에 값을 넣는다 70 80 90
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		// 중첩 for 통해서 max 값 할당
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			sum += (((double) arr[i] / max) * 100);
		}
		System.out.println(sum / N);
	}
}
