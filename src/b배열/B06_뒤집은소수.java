package b배열;

import java.util.ArrayList;
import java.util.Scanner;

public class B06_뒤집은소수 {
    // 문제
    //N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
    //예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
    //첫 자리부터의 연속된 0은 무시한다.

    //첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
    //각 자연수의 크기는 100,000를 넘지 않는다.

    // 9
    // 32 55 62 20 250 370 200 30 100

    // 23 2 73 2 3
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] input2 = new int[input1];
        for (int i = 0; i < input1; i++) {
            input2[i] = in.nextInt();
        }

        for (int i : solution(input2)) {
            System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> solution(int[] input1) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < input1.length; i++) {
            int reverse = 0;
            while (input1[i] > 0) {
                int tmp = input1[i] % 10;
                reverse = reverse * 10 + tmp;
                input1[i] /= 10;
            }

            if (isPrime(reverse)) {
                answer.add(reverse);
            }
        }
        return answer;
    }

    public static ArrayList<Integer> solution1(int[] input1) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < input1.length; i++) {
            int reverse = 0;
            while (input1[i] != 0) {
                int tmp = input1[i] % 10;
                reverse = reverse * 10 + tmp;
                input1[i] /= 10;
            }
            int index = 0;
            for (int j = 1; j <= reverse; j++) {
                if(reverse % j == 0) {
                    index++;
                    if (index > 2) {
                        break;
                    }
                }
            }
            if (index == 2) {
                answer.add(reverse);
            }
        }
        return answer;
    }

    public static ArrayList<Integer> solution1(int input1, String input2) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] arr = input2.split(" ");

        for (int i = 0; i < input1; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            int tmp = Integer.parseInt(sb.toString());

            int index = 0;
            for (int j = 1; j <= tmp; j++) {
                if(tmp % j == 0) {
                    index++;
                    if (index > 2) {
                        break;
                    }
                }
            }
            if (index == 2) {
                answer.add(tmp);
            }
        }

        return answer;
    }
}
