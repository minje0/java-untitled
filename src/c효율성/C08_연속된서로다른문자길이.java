package c효율성;

import java.util.HashSet;
import java.util.Scanner;

public class C08_연속된서로다른문자길이 {
    //영문 소문자로 이루어진 문자열 S가 주어집니다.
    //서로 다른 문자를 포함하는 가장 긴 부분 문자열의 길이를 구하세요.
    //abcba
    //3
    public int solution(String s) {
        int answer = 0;
        int lt = 0;
        HashSet<Character> set = new HashSet<>();

        for (int rt = 0; rt < s.length(); rt++) {
            char c = s.charAt(rt);

            // 중복 문자가 나오면 왼쪽 포인터 이동
            while (set.contains(c)) {
                set.remove(s.charAt(lt));
                lt++;
            }

            set.add(c);
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] a) {
        C08_연속된서로다른문자길이 T = new C08_연속된서로다른문자길이();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(T.solution(str));
    }
}
