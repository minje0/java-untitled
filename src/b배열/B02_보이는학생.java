package b배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B02_보이는학생 {
    // 문제
    // 선생님이 N명의 학생을 일렬로 세웠습니다.
    // 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
    // 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
    // (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

    // 8
    // 130 135 148 140 145 150 150 153
    // 5
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];
        for (int i = 0; i < input1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(arr));
    }

    public static int solution(int[] input1) {
        int answer = 1;
        int max = input1[0];

        for (int i = 1; i < input1.length; i++) {
            if (max < input1[i]) {
                max = input1[i];
                answer++;
            }
        }

        return answer;
    }

}
