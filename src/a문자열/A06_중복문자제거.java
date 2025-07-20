package a문자열;

import java.util.Scanner;

class A06_중복문자제거 {
	// 설명
	// 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
	// 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
	
	// ksekkset
	// kset

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		
		System.out.println(solution(input1));
	}
	
	public static String solution(String param1) {
		String answer = "";
		
		char[] arr = param1.toCharArray();
		
		for (char c : arr) {
			if (answer.indexOf(c) == -1) {
				answer += c;
			}
		}
		
		return answer;
	}
}
