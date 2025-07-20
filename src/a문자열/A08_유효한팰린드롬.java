package a문자열;

import java.util.Scanner;

class A08_유효한팰린드롬 {
	// 설명
	// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
	// 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	// 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
	// 알파벳 이외의 문자들의 무시합니다.
	
	// found7, time: study; Yduts; emit, 7Dnuof

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.nextLine();
		
		System.out.println(solution(input1));
	}
	
	public static String solution(String param1) {
		// replaceAll 정규식이용
		String answer = "NO";
		
		String str = param1.replaceAll("[^a-zA-Z]","");
	
		String tmp = new StringBuilder(str).reverse().toString();
		
		System.out.println("str : " + str);
		System.out.println("tmp : " + tmp);
		
		if (tmp.equalsIgnoreCase(str)) {
			answer = "YES";
		}
		
		return answer;
	}
	
	public static String solution1(String param1) {
		String answer = "NO";
		
		String str = "";
		
		for (char c : param1.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				str += c;
			}
		}
		String tmp = new StringBuilder(str).reverse().toString();
		
		if (tmp.equalsIgnoreCase(str)) {
			answer = "YES";
		}
		
		return answer;
	}
	
}
