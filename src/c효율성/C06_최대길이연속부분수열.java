package c효율성;

import java.util.Scanner;

public class C06_최대길이연속부분수열 {
    //0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다.
    // 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
    //만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
    //1 1 0 0 1 1 0 1 1 0 1 1 0 1
    //여러분이 만들 수 있는 1이 연속된 연속부분수열은
    //이며 그 길이는 8입니다.

    //14 2
    //1 1 0 0 1 1 0 1 1 0 1 1 0 1
    // 8
    public int solution(int n1, int n2, int[] arr) {
        int answer = 0, lt = 0, cnt = 0;

        for (int rt = 0; rt < n1; rt++) {
            if (arr[rt] == 0) cnt++;

            while (cnt > n2) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] a) {
        C06_최대길이연속부분수열 T = new C06_최대길이연속부분수열();
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
