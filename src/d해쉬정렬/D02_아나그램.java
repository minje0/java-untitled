package d해쉬정렬;

import java.util.*;

public class D02_아나그램 {
    //Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
    //예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
    //알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
    //길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.

    /*
    AbaAeCe
    baeeACA

    abaCC
    Caaab
     */
    public String solution(String str1, String str2) {
        String answer = "YES";

        if (str1.equals(str2)) return answer;

        Map<Character, Integer> str1Map = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            str1Map.put(ch, str1Map.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : str2.toCharArray()) {
            if (!str1Map.containsKey(ch) || str1Map.get(ch) == 0) return "NO";

            str1Map.put(ch, str1Map.get(ch) - 1);
        }

        return answer;
    }
    public String solution1(String str1, String str2) {
        String answer = "YES";

        if (str1.equals(str2)) return answer;

        if (str1.length() != str2.length()) return "NO";

        Map<Character, Integer> str1Map = new HashMap<>();
        Map<Character, Integer> str2Map = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            str1Map.put(ch, str1Map.getOrDefault(ch, 0) + 1);
        }

        List<Character> str1Lst = new ArrayList<>(str1Map.keySet());
        str1Lst.sort(Character::compareTo);

        for (char ch : str2.toCharArray()) {
            str2Map.put(ch, str2Map.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : str1Lst) {
            if (!str1Map.get(ch).equals(str2Map.get(ch))) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] a) {
        D02_아나그램 T = new D02_아나그램();
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.print(T.solution(str1, str2));
    }
}
