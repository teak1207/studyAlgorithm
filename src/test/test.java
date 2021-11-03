package test;

import java.util.Scanner;

public class test {

	/* 첫째 줄에 파일의 개수 N이 주어진다. (1 ≤ N ≤ 100) */
	/* 패턴은 알파벳 소문자와 별표(아스키값 42) 한 개로 이루어져 있다 */
	/* 총 N개의 줄에 걸쳐서, 입력으로 주어진 i번째 파일 이름이 패턴과 일치하면 "DA", 일치하지 않으면 "NE"를 출력한다. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); /* 파일의 개수 */
		String ptrn = sc.next(); /* 패턴 */

		String[] arr = ptrn.split("\\*");
		String[] arr2 = new String[N];

		String first = arr[0]; /* 앞글자 */
		String last = arr[1]; /* 뒷글자 */
		char temp1 = 0;
		char temp2 = 0;

		for (int i = 0; i < N; i++) {

			arr2[i] = sc.next(); /* 문자열 입력받음 */
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
