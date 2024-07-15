package algorithmJava;
import java.util.Scanner;

public class swea_1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 10번 test case 반복
		for (int i = 0; i < 10; i++) {
			// palindrome 길이 입력
			int len = sc.nextInt();
			
			// char에 8 x 8 저장할 수 있도록 선언
			char[][] data = new char[8][8];
			
			// 8 x 8 초기화
			for (int j = 0; j < 8; j++) {
				String word = sc.next();
				for (int k = 0; k < 8; k++) {
					data[j][k] = word.charAt(k);
				}
			}
			
				
		}

	}
}
