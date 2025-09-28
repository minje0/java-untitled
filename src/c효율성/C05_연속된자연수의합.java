package c효율성;

import java.util.Scanner;

public class C05_연속된자연수의합 {
    // 문제
    // N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
    // 만약 N=15이면
    // 7+8=15
    // 4+5+6=15
    // 1+2+3+4+5=15
    // 와 같이 총 3가지의 경우가 존재한다.

//    첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

/*
15
*/
// 3

    public int solution(int n) {
        int answer = 0, sum = 0, lt = 1;

        for (int i = 1; i <= (n / 2) + 1; i++) {
            sum += i;
            if (sum == n) {
                answer++;
                sum -= lt++;
            }
            while (sum >= n) {
                sum -= lt++;
                if (sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public int solution1(int n) {
        int answer = 0, cnt = 1;
        n -= cnt;

        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) {
                System.out.println(n + " " + cnt);
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] a) {
        C05_연속된자연수의합 T = new C05_연속된자연수의합();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(T.solution1(n));
    }
}
