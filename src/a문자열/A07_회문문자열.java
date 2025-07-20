package a문자열;

import java.util.Scanner;

class A07_회문문자열 {
	// 설명
	// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
	// 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	// 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
	
	// gooG
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		
		System.out.println(solution(input1));
	}
	
	public static String solution(String param1) {
		String answer = "NO";
		
		String tmp = new StringBuilder(param1).reverse().toString();
		
		if (tmp.equalsIgnoreCase(param1)) {
			answer = "YES";
		}
		
		return answer;
	}
	
	public static String solution2(String param1) {
		String answer = "YES";
		
		param1 = param1.toLowerCase();
		
		int len = param1.length();
		
		for (int i=0; i < len/2; i++) {
			if (param1.charAt(i) != param1.charAt(len - 1 - i)) {
				return "NO";
			}
		}
		
		return answer;
	}
	
	public static String solution1(String param1) {
		String answer = "YES";
		
		param1 = param1.toLowerCase();
		char[] arr = param1.toCharArray();
		int len = param1.length();
		
		int lt = 0;
		int rt = len - 1;

		while (lt < rt) {
			if (arr[lt] != arr[rt]) {
				return "NO";
			}
			lt++;rt--;
		}
		
		return answer;
	}
}
