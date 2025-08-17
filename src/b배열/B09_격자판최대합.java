package b배열;

import java.util.Scanner;

public class B09_격자판최대합 {
    // 문제
    // N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

    // 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
    // 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

    // 5
    // 10 13 10 12 15
    // 12 39 30 23 11
    // 11 25 50 53 15
    // 19 27 29 37 27
    // 19 13 30 13 19
    // 155

    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        int[][] arr1 = new int[input1][input1];

        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input1; j++) {
                arr1[i][j] = in.nextInt();
            }
        }

        int answer = solution(arr1);
        System.out.println(answer);
    }

    public static int solution(int arr[][]) {
        int answer = 0;
        int n = arr.length;

        int diag1 = 0;
        int diag2 = 0;

        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < n; j++) {
                row += arr[i][j]; // 가로합
                col += arr[j][i]; // 세로합
            }
            if (row > answer) answer = row;
            if (col > answer) answer = col;

            diag1 += arr[i][i]; // 정방향 대각선
            diag2 += arr[i][n - 1 - i];  // 역대각선 인덱스
        }

        if (diag1 > answer) answer = diag1;
        if (diag2 > answer) answer = diag2;

        return answer;
    }
}
