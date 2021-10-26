package array;

import java.util.Scanner;

public class step3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int abc = a * b * c;

		while (abc > 0) {

			int x = 0;
			x = abc % 10;

			switch (x) {
			case 0:
				arr[0]++;
				break;
			case 1:
				arr[1]++;
				break;
			case 2:
				arr[2]++;
				break;
			case 3:
				arr[3]++;
				break;
			case 4:
				arr[4]++;
				break;
			case 5:
				arr[5]++;
				break;
			case 6:
				arr[6]++;
				break;
			case 7:
				arr[7]++;
				break;
			case 8:
				arr[8]++;
				break;
			case 9:
				arr[9]++;
				break;

			default:
				break;
			}
			abc = abc / 10;

		}
//		System.out.printf("\n" + arr[0] + "\n" + arr[1] + "\n" + arr[2] + "\n" + arr[3] + "\n" + arr[4] + "\n" + arr[5]
//				+ "\n" + arr[6] + "\n" + arr[7] + "\n" + arr[8] + "\n" + arr[9] + "\n");
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	}
	
}
