package b배열;

import java.util.Scanner;

public class B05_소수_에라토스테네스체 {
    // 문제
    // 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
    // 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

    // 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

    // 20
    // 8

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        System.out.println(solution(input1));
        System.out.println(solution1(input1));
    }

    public static int solution(int input1) {
        int answer = 0;
        int[] arr = new int[input1+1];

        for (int i = 2; i <= input1; i++) {
            if(arr[i] == 0) answer++;

            // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
            for(int j=i; j<=input1; j+=i) {
                arr[j] = 1;
            }
        }

        return answer;
    }

    public static int solution2(int input1) {
        int answer = 0;

        int[] arr = new int[input1+1];

        // 1. 배열을 생성하여 초기화한다.
        for (int i = 2; i <= input1; i++) {
            arr[i] = i;
        }
        // 2. 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.
        // (지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.)
        for (int i = 2; i <= input1; i++) {
            if(arr[i] == 0) continue;

            // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
            for(int j = i*2; j<=input1; j+=i) {
                arr[j] = 0;
            }
        }

        for (int i = 2; i <= input1; i++) {
            if (arr[i] != 0) {
                answer++;
            }
        }

        return answer;
    }

    public static int solution1(int input1) {
        int answer = 0;

        for (int i = 2; i <= input1; i++) {
            int index = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    index++;
                    if (index > 2) break;
                }
            }
            if (index == 2) {
                answer++;
            }
        }

        return answer;
    }
}
