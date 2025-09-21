package c효율성;

import java.util.Scanner;

public class C03_최대매출 {
    // 문제
    // 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
    // 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
    // 12 15 11 20 25 10 20 19 13 15
    // 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
    // 여러분이 현수를 도와주세요.

/*
10 3
12 15 11 20 25 10 20 19 13 15
*/
// 56
    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0;

        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = m; i < n; i++) {
            sum += (arr[i] - arr[i - m]);
            if (answer < sum) {
                answer = sum;
            }
        }

        return answer;
    }

    public static void main(String[] a) {
        C03_최대매출 T = new C03_최대매출();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
