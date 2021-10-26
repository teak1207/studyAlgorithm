package array;

import java.util.Scanner;

public class step1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 정수의 개수
		int input = sc.nextInt();
		// 정수의 개수 만큼 배열 할당
		int[] arr = new int[input];
		// 최대값
		int max = arr[0];
		// 최소값
		int min = 10000;
		// 배열에 input의 크기만큼 입력받기
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		// 최대값
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}