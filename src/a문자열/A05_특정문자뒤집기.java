package a문자열;

import java.util.Scanner;

class A05_특정문자뒤집기 {
	// 설명
	// 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	// 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
	
	// a#b!GE*T@S
	// S#T!EG*b@a

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		
		System.out.println(solution(input1));
	}
	
	public static String solution(String param1) {
		String answer = "";
		
		char[] arr = param1.toCharArray();
		int lt = 0, rt = arr.length - 1;
		
		while(lt < rt) {
			if ((arr[lt] < 65 && arr[lt] > 90)
					|| (arr[lt] < 97 && arr[lt] > 122)) {
				lt++;
			} else if ((arr[rt] < 65 && arr[rt] > 90)
						|| (arr[rt] < 97 && arr[rt] > 122)) {
				rt++;
			} else {
				char tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				lt++;
				rt--;
			}
 		}
		
		answer = String.valueOf(arr);
		return answer;
	}

	public static String solution1(String param1) {
		String answer = "";
		
		char[] arr = param1.toCharArray();
		int lt = 0, rt = arr.length - 1;
		
		while(lt < rt) {
			if (!Character.isAlphabetic(arr[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(arr[rt])) {
				rt--;
			} else {
				char tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				lt++;
				rt--;
			}
 		}
		
		answer = String.valueOf(arr);
		return answer;
	}
}
