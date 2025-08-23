package b배열;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class B10_봉우리 {
// 문제
// 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
//각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
//격자의 가장자리는 0으로 초기화 되었다고 가정한다.
//만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

// 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
// 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

/*
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2

10
*/

    public static void main(String[] a) {
        B10_봉우리 T = new B10_봉우리();
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[][] arr = new int[input1][input1];
        for (int i=0; i<input1; i++) {
            for (int j=0; j<input1; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(T.solution(arr, input1));
    }

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};

    public int solution(int[][] arr, int n) {
        int answer = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {

                boolean flag = true;
                for (int k=0; k<4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < n && ny >=0 && ny < n
                            && arr[nx][ny] >= arr[i][j]) {
                        flag = false;

                        break;
                    }
                }

                if(flag) answer++;
            }
        }

        return answer;
    }

    public int solution1(int arr[][], int n) {
        int answer = 0;
        int nn = n-1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int 상 = 0, 하 = 0, 좌 = 0, 우 = 0;
                if (i!=0) {
                    상 = arr[i-1][j];
                }
                if(i!=nn) {
                    하 = arr[i+1][j];
                }
                if (j!=0) {
                    좌 = arr[i][j-1];
                }
                if (j!=nn) {
                    우 = arr[i][j+1];
                }

                if (arr[i][j] > 상
                        &&
                        arr[i][j] > 하
                        &&
                        arr[i][j] > 좌
                        &&
                        arr[i][j] > 우) {
                    answer++;
                }

            }

        }
        return answer;
    }
}
