package array;

import java.util.Scanner;

public class step1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ������ ����
		int input = sc.nextInt();
		// ������ ���� ��ŭ �迭 �Ҵ�
		int[] arr = new int[input];
		// �ִ밪
		int max = arr[0];
		// �ּҰ�
		int min = 10000;
		// �迭�� input�� ũ�⸸ŭ �Է¹ޱ�
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		// �ִ밪
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