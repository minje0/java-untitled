package b배열;

import java.util.Scanner;

public class B03_가위바위보 {
    // 문제
    /* A, B 두 사람이 가위바위보 게임을 합니다.
    총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
    가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
    예를 들어 N=5이면
    두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arrA = new int[input1];
        for (int i = 0; i < input1; i++) {
            arrA[i] = in.nextInt();
        }
        int[] arrB = new int[input1];
        for (int i = 0; i < input1; i++) {
            arrB[i] = in.nextInt();
        }

        for (String s : solution(arrA, arrB)) {
            System.out.println(s);
        }
    }
    public static String[] solution(int[] input1, int[] input2) {
        String[] answer = new String[input1.length];
        for (int i = 0; i < answer.length; i++) {
            if (input1[i] == input2[i]) {
                answer[i] = "D";
            } else if (input1[i] == 1 && input2[i] == 3) {
                answer[i] = "A";
            } else if (input1[i] == 2 && input2[i] == 1) {
                answer[i] = "A";
            } else if (input1[i] == 3 && input2[i] == 2) {
                answer[i] = "A";
            } else  {
                answer[i] = "B";
            }
        }

        return answer;
    }

    public static String[] solution1(int[] input1, int[] input2) {
        String[] answer = new String[input1.length];

        for (int i = 0; i < input1.length; i++) {
            int rst = input1[i] - input2[i];
            if (rst == 0)  {
                answer[i] = "D";
            } else if (input1[i] == 1) {
                if (rst == -1) {
                    answer[i] = "B";
                } else {
                    answer[i] = "A";
                }
            } else if (input1[i] == 2) {
                if (rst == -1) {
                    answer[i] = "B";
                } else {
                    answer[i] = "A";
                }
            } else {
                if (rst == 2) {
                    answer[i] = "B";
                } else {
                    answer[i] = "A";
                }
            }
        }
        return answer;
    }
}
