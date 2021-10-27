package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//투 포인터
public class q2531 {

	public static void main(String[] args) throws IOException {

		// N(접시수)| D(초밥종류) | K(연속해서 먹는갯수) | C(쿠폰)
		int n, d, k, c;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.valueOf(st.nextToken());  // 접시 수. 2~300만
		d = Integer.valueOf(st.nextToken());  // 초밥 가지수. 2~3000
		k = Integer.valueOf(st.nextToken());  // 연속 접시 수. 2~3000
		c = Integer.valueOf(st.nextToken());  // 쿠폰번호 1<=c<=d

		int[] sushi = new int[n];  // 벨트에 8개 깔고
		int[] eat = new int[d + 1]; // ???????

		// 1. 스시 종류 번호 배열에 넣기
		for (int i = 0; i < n; i++) {  
			sushi[i] = Integer.valueOf(br.readLine());//8번 받음  7 9 7 30 2 7 9 25

		}
		// 2. 초밥의 종류 개수(d) 크기의 배열 선언 -> 해당 배열은 index 번호의 초밥을 먹은 개수를 저장
		// 30 크기의 배열만듦
		int count = 0;

		for (int i = 0; i < k; i++) {
			if (eat[sushi[i]] == 0) {
				count++;
			}

			eat[sushi[i]]++;
		}

		int maxLen = count;
		// 3. 처음 0번부터 k개수만큼 먹었을 때를 파악해 값을 설정,
		// 1번부터 n-1까지 for문으로 sliding window 수행
		// i : start
		for (int i = 1; i < n; i++) {

			if (maxLen <= count) {
				if (eat[c] == 0) { // 아직 쿠폰초밥을 안먹은 상태
					maxLen = count + 1;
				} else { // 아직 쿠폰초밥을 먹은 상태
					maxLen = count;
				}
			}

			// end 이동
			int end = (i + k - 1) % n;
			if (eat[sushi[end]] == 0) {
				count++;
			}
			eat[sushi[end]]++;

			// start 이동
			eat[sushi[i - 1]]--; // start점 한 칸 이동했으니 이전의 초밥 제거
			if (eat[sushi[i - 1]] == 0) {
				count--;
			}
		}

		System.out.println(maxLen);

	}

}
