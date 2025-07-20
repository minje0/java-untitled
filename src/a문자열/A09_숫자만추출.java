package a문자열;

import java.util.Scanner;

class A09_숫자만추출 {
	// 설명
	// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
	// 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
	// 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
	// g0en2T0s8eSoft
	// 208

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print(">> ");
		String input1 = in.nextLine();
		
		System.out.println(solution(input1));
	}
	
	public static int solution(String param1) {
		String answer = "";
		
		for (char x : param1.toCharArray()) {
			if (Character.isDigit(x)) {
				answer += x;
			}
		}
		
		return Integer.parseInt(answer);
	}
	
	public static int solution2(String param1) {
		// 숫자 ascii code 48 ~ 57
		// answer = answer * 10 + (x - 48);
		int answer = 0;
		
		for (char x : param1.toCharArray()) {
			if (x >= 48 && x <= 57) {
				answer = answer * 10 + (x - 48);
			}
		}
		
		return answer;
	}
	
	public static int solution1(String param1) {
		int answer = 0;
		
		param1 = param1.replaceAll("[^0-9]","");
		
		answer = Integer.valueOf(param1);
		
		return answer;
	}
}
