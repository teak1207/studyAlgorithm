package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q3273_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 배열 크기 입력
		int n = Integer.parseInt(br.readLine());
		// 배열 선언
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 원하는 sum 값
		int x = Integer.parseInt(br.readLine());
		//
		Arrays.sort(arr);

		int start = 0;
		int end = n - 1;
		int sum = 0;
		int result = 0;

		while (start < end) {

			sum = arr[start] + arr[end];
			// x와 같으면 result ++
			if (sum == x)
				result++;
			if (sum <= x) {
				start++;
			} else {
				end--;
			}
		}
		bw.write(result + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}
