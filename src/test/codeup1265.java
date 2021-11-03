package test;

import java.util.Scanner;

public class codeup1265 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.println("원하는 구구단 출력 : ");

		n = sc.nextInt();

		for (int i = 1; i < 10; i++) {

			System.out.println(n + " * " + i + "=" + n * i);
		}

		sc.close();
	}
}
