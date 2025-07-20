package a문자열;

import java.util.Scanner;

class A02_대소문자변환 {
	// 설명
	// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

	// StuDY

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		
		System.out.println(solution(input1));
	}

	public static String solution(String param1) {
		String answer = "";

		// 65 ~ 90
		// 97 ~ 122
		
		char[] arr = param1.toCharArray();
		
		for (int i=0; i<param1.length(); i++) {
			char c = param1.charAt(i);
			
			if (c >= 65 && c <= 90) {
				c = (char)(c + 32);
			} else {
				c = (char)(c - 32);
			}
			answer += c;
			
		}
		
		for (char c : arr) {
			if (c >= 65 && c <= 90) {
				c = (char)(c + 32);
			} else {
				c = (char)(c - 32);
			}
			//answer += c;
		}
		
		return answer;
	}

}
