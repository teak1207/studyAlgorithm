package array;

import java.util.Scanner;

public class step5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ��� �Է¹޴���
		int N = sc.nextInt(); // 3
		// N��ŭ �迭 �Ҵ�
		int[] arr = new int[N]; // [3]

		int max;
		double sum = 0;
		// �迭�� �ε����� ���� �ִ´� 70 80 90
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		// ��ø for ���ؼ� max �� �Ҵ�
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
