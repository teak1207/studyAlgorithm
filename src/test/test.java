package test;

import java.util.Scanner;

public class test {

	/* ù° �ٿ� ������ ���� N�� �־�����. (1 �� N �� 100) */
	/* ������ ���ĺ� �ҹ��ڿ� ��ǥ(�ƽ�Ű�� 42) �� ���� �̷���� �ִ� */
	/* �� N���� �ٿ� ���ļ�, �Է����� �־��� i��° ���� �̸��� ���ϰ� ��ġ�ϸ� "DA", ��ġ���� ������ "NE"�� ����Ѵ�. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); /* ������ ���� */
		String ptrn = sc.next(); /* ���� */

		String[] arr = ptrn.split("\\*");
		String[] arr2 = new String[N];

		String first = arr[0]; /* �ձ��� */
		String last = arr[1]; /* �ޱ��� */
		char temp1 = 0;
		char temp2 = 0;

		for (int i = 0; i < N; i++) {

			arr2[i] = sc.next(); /* ���ڿ� �Է¹��� */
			temp1 = arr2[i].charAt(0);
			temp2 = arr2[i].charAt(arr2[i].length() - 1);

			if ((first.equals(String.valueOf(temp1))) && (last.equals(String.valueOf(temp2)))) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
		sc.close();
	}
}
