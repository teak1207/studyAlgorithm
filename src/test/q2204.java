package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class q2204 {
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int wordCnt = -1;
	
		do {
		
			wordCnt = Integer.parseInt(br.readLine());
		
			if (wordCnt == 0)  // 0 ���� ������ ���� ó��
				break;
			
			String[] list = new String[wordCnt]; // ������ ��� �迭�� ��������
			
			for (int i = 0; i < wordCnt; i++) {
				list[i] = br.readLine();
				
			}
			// Comparator ����� compare ������
			Arrays.sort(list, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.toLowerCase().compareTo(o2.toLowerCase()); // �ҹ��ڷ� ��ȯ , ��ҹ����� ������ ������ �� ��� ����.
				}
			});
			
			bw.append(list[0]).append("\n");
			
		} while (wordCnt != 0);
		bw.flush();
	}
}
