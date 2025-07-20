package a문자열;

import java.util.Scanner;

class A01_문자찾기 {
	// 설명
	// 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
	// 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
	
	// Computercooler
	// c

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		char input2 = in.next().charAt(0);
		
		System.out.println(solution(input1, input2));
	}

	public static int solution(String param1, char param2) {
		int answer = 0;
		
		if (param2 >= 65 && param2 <= 90) {
			param1 = param1.toUpperCase();
		} else {
			param1 = param1.toLowerCase();
		}
		// 65 ~ 90
		// 97 ~ 122
		
		char[] arr = param1.toCharArray();
		
		for (char c : arr) {
			if (c == param2) {
				answer++;
			}
		}
		
		return answer;
	}
}
