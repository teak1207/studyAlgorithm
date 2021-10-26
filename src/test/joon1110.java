package test;

import java.util.Scanner;

public class joon1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N;
		int A;
		int B;
		int sum;
		int tmp = 0;
		int cnt = 0;

		N = sc.nextInt();

		A = N / 10;
		B = N % 10;
		sum = A + B;
		sum = sum % 10;
		tmp = (B * 10) + sum;
		cnt++;

		while (N != tmp) {
			A = tmp / 10;
			B = tmp % 10;
			sum = A + B;
			sum = sum % 10;
			tmp = (B * 10) + sum;
			cnt++;
		}
		System.out.println(cnt);
	}
}
