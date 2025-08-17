package b배열;

import java.util.Arrays;
import java.util.Scanner;

public class B08_등수구하기 {
    // 문제
    // N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
    // 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
    // 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

    // 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
    // 5
    // 87 89 92 100 76
    // 4 3 2 1 5

    // 30
    // 65 54 81 56 54 70 61 87 99 58 78 99 99 70 96 60 77 84 67 86 84 98 63 96 83 54 52 86 78 69
    // 21 27 13 26 27 17 23 7 1 25 14 1 1 17 5 24 16 10 20 8 10 4 22 5 12 27 30 8 14 19
    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] input2 = new int[input1];
        for (int i = 0; i < input1; i++) {
            input2[i] = in.nextInt();
        }

        for (int i : solution(input2)) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("21 27 13 26 27 17 23 7 1 25 14 1 1 17 5 24 16 10 20 8 10 4 22 5 12 27 30 8 14 19");

    }

    public static int[] solution(int[] input1) {
        int[] answer = new int[input1.length];

        for (int i = 0; i < answer.length; i++) {
            int cnt = 1;
            for (int j = 0; j < answer.length; j++) {
                if (input1[j] > input1[i]) {
                    cnt++;
                }
                answer[i] = cnt;
            }
        }

        return answer;
    }

    public static int[] reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
