package c효율성;

import java.util.Scanner;

public class C04_연속부분수열 {
    // 문제
    // N개의 수로 이루어진 수열이 주어집니다.
    // 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
    // 만약 N=8, M=6이고 수열이 다음과 같다면
    // 1 2 1 3 1 1 1 2
    // 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.

/*
8 6
1 2 1 3 1 1 1 2
*/
// 3

// 100 100
// 3 3 1 4 5 2 2 5 2 1 2 2 1 1 4 1 4 3 3 5 1 5 1 3 4 5 4 5 2 4 2 1 1 4 2 1 5 3 1 3 1 1 1 2 4 4 5 5 5 5 3 2 5 5 3 2 3 4 1 3 3 4 5 1 3 1 3 2 3 1 2 3 2 5 5 4 2 3 1 2 3 2 4 5 2 4 4 4 4 3 1 5 2 2 1 3 2 5 4 1
// 23
    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            if (sum == m) {
                answer++;
            }

            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] a) {
        C04_연속부분수열 T = new C04_연속부분수열();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
