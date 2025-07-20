package a문자열;

import java.util.Scanner;

class A03_문장속단어 {
	// 설명
	// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
	// 문장속의 각 단어는 공백으로 구분됩니다.
	
	// it is time to study
	// study

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.nextLine();
		
		System.out.println(solution(input1));
	}

	public static String solution(String param1) {
		String answer = "";
		int max = Integer.MIN_VALUE, pos;
		
		while ((pos = param1.indexOf(" ")) != -1) {
			String tmp = param1.substring(0, pos);
			if (max < tmp.length()) {
				max = tmp.length();
				answer = tmp;
			}
			param1 =  param1.substring(pos + 1);
		}
		
		if (max < param1.length()) {
			answer = param1;
		}
		
		return answer;
	}
	
	public static String solution1(String param1) {
		String answer = "";
		int max = Integer.MIN_VALUE;
		
		String[] arr = param1.split(" ");
		
		for (String str : arr) {
			if (max < str.length()) {
				max = str.length();
				answer = str;
			}
		}
		
		return answer;
	}
}
