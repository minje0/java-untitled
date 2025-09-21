package c효율성;

import java.util.Arrays;
import java.util.Scanner;

public class C01_배열합치기 {
    // 문제
    //첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
    //두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
    //세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
    //네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
    //각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

/*
3
1 3 5
5
2 3 6 7 9
*/
// 1 2 3 3 5 6 7 9
    public int[] solution(int n, int m, int[] arr1, int[] arr2) {
        int[] answer = new int[n + m];

        System.arraycopy(arr1, 0, answer, 0, n);
        System.arraycopy(arr2, 0, answer, n, m);

        Arrays.sort(answer);
        return answer;
    }

    public int[] solution1(int n, int m, int[] arr1, int[] arr2) {
        int[] answer = new int[n + m];
        int len = 0, p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) answer[len++] = arr1[p1++];
            else answer[len++] = arr2[p2++];
        }

        while (p1 < n) {
            answer[len++] = arr1[p1++];
        }
        while (p2 < m) {
            answer[len++] = arr2[p2++];
        }
//        if (p1 < n) {
//            for (int i = p1; i < n; i++) {
//                answer[len++] = arr1[i];
//            }
//        } else {
//            for (int i = p2; i < m; i++) {
//                answer[len++] = arr2[i];
//            }
//        }
        return answer;
    }

    public static void main(String[] a) {
        C01_배열합치기 T = new C01_배열합치기();
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int[] arr1 = new int[input1];
        for (int i = 0; i < input1; i++) {
            arr1[i] = sc.nextInt();
        }
        int input2 = sc.nextInt();
        int[] arr2 = new int[input2];
        for (int i = 0; i < input2; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i : T.solution1(input1, input2, arr1, arr2)) {
            System.out.print(i + " ");
        }
    }
}
