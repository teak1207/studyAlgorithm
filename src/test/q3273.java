package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q3273 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader�� �迭���� �Է¹���
		int arr[] = new int[Integer.valueOf(br.readLine())];
		// ������ Ƚ��
		int cnt = 0;
		// �迭�� ���̸�ŭ ���� �Է�
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		// ���ϴ� ��
		int sum = Integer.valueOf(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					cnt++;
				}
			}
		}
		cnt = cnt / 2;
		System.out.println(cnt);
	}
}
