package c효율성;

import java.util.Scanner;

public class C07_최대부분합 {
    //길이가 N인 양의 정수 배열이 주어집니다.
    //이 중 연속된 K개의 원소를 선택했을 때, 그 합이 최대가 되는 값을 구하세요.
    //10 3
    //12 15 11 20 25 10 20 19 13 15
    // 56
    public int solution(int n1, int n2, int[] arr) {
        int answer = 0, max = 0, lt = 0, cnt = 0;

        for (int rt = 0; rt < n1; rt++) {
            max += arr[rt];
            cnt++;
            if (cnt > n2) {
                cnt--;
                max -= arr[lt++];
            }

            if (answer < max) {
                answer = max;
            }
        }
        return answer;
    }

    public int solution1(int n1, int n2, int[] arr) {
        int answer = 0, sum = 0;

        // 첫 번째 윈도우 합 계산
        for (int i = 0; i < n2; i++) sum += arr[i];
        answer = sum;

        // 슬라이딩 윈도우 이동
        for (int i = n2; i < n1; i++) {
            sum += arr[i] - arr[i - n2];
            answer = Math.max(answer, sum);
        }

        return answer;
    }


    public static void main(String[] a) {
        C07_최대부분합 T = new C07_최대부분합();
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n1, n2, arr));
    }
}
