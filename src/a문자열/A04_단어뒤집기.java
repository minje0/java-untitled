package a문자열;

import java.util.Scanner;

class A04_단어뒤집기 {
	// 설명
	// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
	// 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

	//	3
	//	good 	doog
	//	Time 	emiT
	//	Big 	giB


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int input1 = in.nextInt();
		
		String[] arr = new String[input1]; 
		
		for (int i=0; i<input1; i++) {
			arr[i] = in.next();
		}
		
		arr = solution(arr);
		
		for (String str : arr) {
			System.out.println(str);
		}
	}
	
	public static String[] solution(String[] param1) {
		String[] answer = new String[param1.length];
		int index = 0;
		for (String str : param1) {
			char[] c = str.toCharArray();
			
			int lt = 0;
			int rt = str.length() - 1;
			
			while (lt < rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
			answer[index++] = String.valueOf(c);
		}
		
		return answer;
	}

	public static String solution2(String param1) {
		StringBuilder sb = new StringBuilder(param1);
		
		String answer = "";
		
		answer = sb.reverse().toString();
		
		return answer;
	}
	
	public static String solution1(String param1) {
		String answer = "";
		
		for (int i=param1.length()-1; i>=0; i--) {
			answer += param1.charAt(i);
		}
		
		return answer;
	}
}
