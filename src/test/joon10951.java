package test;

import java.util.Scanner;

public class joon10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 0;
		int y = 0;

		while (true) {
			x = sc.nextInt();
			y = sc.nextInt();

			if (x == 0 && y == 0) {
				
				break;
			}
			System.out.println(x + y);
		}
	sc.close();
	}

}
