package level0;

public class Problem_181905 {
    public String solution(String my_string, int s, int e) {
        char[] charArr = my_string.toCharArray();

        while(s < e) {
            char tmp = charArr[s];
            charArr[s] = charArr[e];
            charArr[e] = tmp;

            s++;
            e--;
        }

        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        Problem_181905 p = new Problem_181905();

        System.out.println(p.solution("Progra21Sremm3", 6, 12));
        System.out.println(p.solution("Stanley1yelnatS", 4, 10));
    }
}
