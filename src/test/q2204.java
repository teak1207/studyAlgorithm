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
		
			if (wordCnt == 0)  // 0 들어면 종료라는 조건 처리
				break;
			
			String[] list = new String[wordCnt]; // 들어오는 대로 배열에 때려넣음
			
			for (int i = 0; i < wordCnt; i++) {
				list[i] = br.readLine();
				
			}
			// Comparator 쓸라면 compare 재정의
			Arrays.sort(list, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.toLowerCase().compareTo(o2.toLowerCase()); // 소문자로 변환 , 대소문자의 구분을 없앴을 때 라고 나옴.
				}
			});
			
			bw.append(list[0]).append("\n");
			
		} while (wordCnt != 0);
		bw.flush();
	}
}
