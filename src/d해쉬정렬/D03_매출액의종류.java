package d해쉬정렬;

import java.util.*;

public class D03_매출액의종류 {
    //만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
    //20 12 20 10 23 17 10
    //
    //각 연속 4일간의 구간의 매출종류는
    //첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
    //두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
    //세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
    //네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
    //N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
    //매출액의 종류를 출력하는 프로그램을 작성하세요.

    /*
    7 4
    20 12 20 10 23 17 10
    3 4 4 3 (일수 = N - K + 1)
     */
    public int[] solution(int N, int K, int[] arr) {
        int[] answer = new int[N - K + 1];
        int lt = 0;
        int rt = K;

        for (int i = 0; i < answer.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = lt; j < rt; j++) {
                set.add(arr[j]);
            }
            answer[i] = set.size();
            lt++; rt++;
        }

        return answer;
    }

    public void solution1(int N, int K, int[] arr) {
        int lt = 0;
        int rt = K;

        for (int i = 0; i < N - K + 1; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = lt; j < rt; j++) {
                set.add(arr[j]);
            }
            System.out.print(set.size() + " ");
            lt++; rt++;
        }
    }
    public int[] solution2(int N, int K, int[] arr) {
        int[] answer = new int [N - K + 1];

        Map<Integer, Integer> hMap = new HashMap<>();

        // 초기 윈도우 세팅
        for (int i = 0; i < K; i++) {
            hMap.put(arr[i], hMap.getOrDefault(arr[i], 0) + 1);
        }
        answer[0] = hMap.size();

        int lt = 0;
        for (int rt = K; rt < N; rt++) {
            hMap.put(arr[rt], hMap.getOrDefault(arr[rt], 0) + 1);
            hMap.put(arr[lt], hMap.get(arr[lt]) - 1);
            if (hMap.get(arr[lt]) == 0) hMap.remove(arr[lt]);
            lt++;

            answer[lt] = hMap.size();
        }
        return answer;
    }

    public static void main(String[] a) {
        D03_매출액의종류 T = new D03_매출액의종류();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

//        T.solution1(N, K, arr);
        for (int i : T.solution2(N, K, arr)) {
            System.out.print(i + " ");
        }
    }
}
