package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//�� ������
public class q2531 {

	public static void main(String[] args) throws IOException {

		// N(���ü�)| D(�ʹ�����) | K(�����ؼ� �Դ°���) | C(����)
		int n, d, k, c;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.valueOf(st.nextToken());  // ���� ��. 2~300��
		d = Integer.valueOf(st.nextToken());  // �ʹ� ������. 2~3000
		k = Integer.valueOf(st.nextToken());  // ���� ���� ��. 2~3000
		c = Integer.valueOf(st.nextToken());  // ������ȣ 1<=c<=d

		int[] sushi = new int[n];  // ��Ʈ�� 8�� ���
		int[] eat = new int[d + 1]; // ???????

		// 1. ���� ���� ��ȣ �迭�� �ֱ�
		for (int i = 0; i < n; i++) {  
			sushi[i] = Integer.valueOf(br.readLine());//8�� ����  7 9 7 30 2 7 9 25

		}
		// 2. �ʹ��� ���� ����(d) ũ���� �迭 ���� -> �ش� �迭�� index ��ȣ�� �ʹ��� ���� ������ ����
		// 30 ũ���� �迭����
		int count = 0;

		for (int i = 0; i < k; i++) {
			if (eat[sushi[i]] == 0) {
				count++;
			}

			eat[sushi[i]]++;
		}

		int maxLen = count;
		// 3. ó�� 0������ k������ŭ �Ծ��� ���� �ľ��� ���� ����,
		// 1������ n-1���� for������ sliding window ����
		// i : start
		for (int i = 1; i < n; i++) {

			if (maxLen <= count) {
				if (eat[c] == 0) { // ���� �����ʹ��� �ȸ��� ����
					maxLen = count + 1;
				} else { // ���� �����ʹ��� ���� ����
					maxLen = count;
				}
			}

			// end �̵�
			int end = (i + k - 1) % n;
			if (eat[sushi[end]] == 0) {
				count++;
			}
			eat[sushi[end]]++;

			// start �̵�
			eat[sushi[i - 1]]--; // start�� �� ĭ �̵������� ������ �ʹ� ����
			if (eat[sushi[i - 1]] == 0) {
				count--;
			}
		}

		System.out.println(maxLen);

	}

}
