package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q3273 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader로 배열길이 입력받음
		int arr[] = new int[Integer.valueOf(br.readLine())];
		// 충족한 횟수
		int cnt = 0;
		// 배열에 길이만큼 값을 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		// 원하는 값
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
