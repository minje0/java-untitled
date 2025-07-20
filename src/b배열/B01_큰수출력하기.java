package b배열;

import java.util.ArrayList;
import java.util.Scanner;

public class B01_큰수출력하기 {
    // 문제
    // N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
    // (첫 번째 수는 무조건 출력한다)

    // 6
    // 7 3 9 5 6 12

    // 7 9 6 12
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input1 = in.nextInt();
        int[] arr = new int[input1];
        for (int i = 0; i < input1; i++) {
            arr[i] = in.nextInt();
        }

        //System.out.println(solution(arr));

        for (int i : solution(arr)) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> solution(int[] input1) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(input1[0]);

        for (int i = 1; i < input1.length; i++) {
            if (input1[i] > input1[i-1]) {
                answer.add(input1[i]);
            }
        }

        return answer;
    }

    public static String solution2(int[] input1) {
        String answer = "";
        answer += input1[0];
        answer += " ";

        for (int i = 1; i < input1.length; i++) {
            if (input1[i] > input1[i-1]) {
                answer += input1[i];
                answer += " ";
            }
        }

        return answer;
    }

    public static String solution1(int input1, String input2) {
        String answer = "";

        String[] arr = input2.split("\\s+");
        answer += arr[0];
        answer += " ";
        for (int i = 1; i < input1; i++) {

            if (Integer.parseInt(arr[i-1]) < Integer.parseInt(arr[i])) {
                answer += arr[i];
                answer += " ";
            }
        }

        return answer;
    }
}
