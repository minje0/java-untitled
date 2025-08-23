package b배열;

import java.util.Scanner;

public class B11_임시반장정하기 {
// 문제

/*
5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2

4
*/
    public int solution(int[][] arr, int n) {
        int[] stu = new int[n];
        int answer = 0;
        int max = 0;

        for (int i=0; i<n; i++) { // 기준 학생
            for (int j=0; j<n; j++) {  // 비교학생
                if (i == j) continue;

                for (int k=0; k<5; k++) { // 학년

                    if (arr[i][k] == arr[j][k]) {
                        stu[i] += 1;
                        break;
                    }
                }

                if (max < stu[j]) {
                    max = stu[j];
                    answer = j;
                }
            }
        }

        return answer + 1;
    }

    public static void main(String[] a) {
        B11_임시반장정하기 T = new B11_임시반장정하기();
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int[][] arr = new int[input1][5];
        for (int i=0; i<input1; i++) {
            for (int j=0; j<5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(arr, input1));
    }
}
