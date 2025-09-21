package c효율성;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C02_공통원소구하기 {
    // 문제
    // A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성
    //첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
    //두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
    //세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
    //네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
    //각 집합의 원소는 1,000,000,000이하의 자연수입니다.

/*
5
1 3 9 5 2
5
3 2 5 7 8
*/
// 2 3 5
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        // 시간초과
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = arr1[i];
            for (int j = 0; j < m; j++) {
                if (a == arr2[j]) {
                    answer.add(arr2[j]);
                    break;
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
    public ArrayList<Integer> solution1(int n, int m, int[] arr1, int[] arr2) {
        // 시간초과
        Arrays.sort(arr1);Arrays.sort(arr2);
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = arr1[i];
            for (int j = 0; j < m; j++) {
                if (a == arr2[j]) {
                    answer.add(arr2[j]);
                    break;
                }
            }
        }
        return answer;
    }
    public ArrayList<Integer> solution2(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 =0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++; p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }
    public static void main(String[] a) {
        C02_공통원소구하기 T = new C02_공통원소구하기();
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

        for (int i : T.solution2(input1, input2, arr1, arr2)) {
            System.out.print(i + " ");
        }
    }
}
