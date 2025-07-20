package a문자열;

import java.util.Scanner;

public class A11_문자열압축 {
    // 설명
    // 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
    // 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
    // 단 반복횟수가 1인 경우 생략합니다.

    // KKHSSSSSSSE
    // K2HS7E

    // KSTTTSEEKFKKKDJJGG
    // KST3SE2KFK3DJ2G2

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input1 = in.next();

        System.out.println(solution(input1));
    }
    public static String solution(String param1) {
        StringBuilder answer = new StringBuilder();
        int cnt = 1;

        for (int i = 0; i < param1.length()-1; i++) {
            if (param1.charAt(i) == param1.charAt(i+1)) {
                cnt++;
            } else {
                answer.append(param1.charAt(i));
                if (cnt > 1) answer.append(cnt);
                cnt = 1;
            }
        }
        answer.append(param1.charAt(param1.length()-1));
        if (cnt > 1) answer.append(cnt);

        return answer.toString();
    }
    public static String solution1(String param1) {
        StringBuilder answer = new StringBuilder();

        int i = 0;
        while (i < param1.length()) {
            char c = param1.charAt(i);
            int cnt = 1;

            // 연속된 문자의 개수 세기
            while (i + cnt < param1.length() && param1.charAt(i + cnt) == c) {
                cnt++;
            }

            answer.append(c);
            if (cnt > 1) {
                answer.append(cnt);
            }

            i += cnt; // 연속된 문자 블록만큼 건너뛰기
        }


        return answer.toString();
    }
}
