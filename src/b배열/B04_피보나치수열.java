package b배열;

import java.util.Scanner;

public class B04_피보나치수열 {
    // 문제
    // 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
    // 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
    // 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.

    // 10
    // 1 1 2 3 5 8 13 21 34 55

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        for (int i : solution(input1)) {
            //System.out.print(i + " ");
        }

        int a = 1;
        int b = 1;
        int rst = 0;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < input1; i++) {
            rst = a + b;
            System.out.print(rst + " ");

            a = b;
            b = rst;
        }
    }

    public static int[] solution(int input1) {
        int[] answer = new int[input1];
        int cnt = 1;
        answer[0] = cnt;
        answer[1] = cnt;
        for (int i = 2; i < input1; i++) {
            answer[i] = answer[i-2] + answer[i-1];
         }

        return answer;
    }
}
