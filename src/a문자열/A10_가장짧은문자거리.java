package a문자열;

import java.util.Arrays;
import java.util.Scanner;

class A10_가장짧은문자거리 {
	// 설명
	// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
	// 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

	// teachermode e
	// 1 0 1 2 1 0 1 2 2 1 0

	// eochjgoekghlakegh h
	// 3 2 1 0 1 2 3 3 2 1 0 1 2 3 2 1 0

	// fkdgkjdflkgjljslgjkfldjlkfdg f
	// 0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 0
	// 0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input1 = in.next();
		char input2 = in.next().charAt(0);

		for (int i : solution(input1, input2)) {
			System.out.print(i + " ");
		}

//		int i = Integer.MAX_VALUE;
//		System.out.println("\n" + (++i));
	}
	
	public static int[] solution(String param1, char target) {
		int[] arr = new int[param1.length()];
		
		int cnt = 10000;
		
		// 1. 왼 -> 오
		// 왼쪽에 있는 target과 떨어져 있는 거리
		for (int i=0; i<param1.length(); i++) {
			if (param1.charAt(i) == target) {
				cnt = 0;
			} else {
				cnt++;
			}
			arr[i] = cnt;
		}
		System.out.println(Arrays.toString(arr));
		// 2. 오 -> 왼 (역순)
		// 오른쪽에 있는 target과 떨어져 있는 거리
		for (int i=param1.length()-1; i>=0; i--) {
			if (param1.charAt(i) == target) {
				cnt = 0;
				arr[i] = cnt;
			} else {
				cnt++;
				if (arr[i] > cnt) {
					arr[i] = cnt;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
