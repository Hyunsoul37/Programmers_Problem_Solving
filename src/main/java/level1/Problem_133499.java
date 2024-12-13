package level1;

import java.util.Arrays;

public class Problem_133499 {

    public int solution(String[] babbling) {
        String[] languages = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String b : babbling)
        {
            int index = 0;
            String prev = null;

            while (true)
            {
                if (index == languages.length)
                    break;

                // 이전 단어와 같을 경우 건너뜀
                if (prev != null && prev.equals(languages[index]))
                {
                    index++;
                    continue;
                }

                if (b.startsWith(languages[index]))
                {
                    b = b.substring(languages[index].length());
                    prev = languages[index];
                    index = 0;
                }
                else {
                    index++;
                }

                if (b.isEmpty())
                {
                    answer++;
                    break;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_133499 p = new Problem_133499();

        String[] babbling1 = {"aya", "yee", "u", "maa"};
        String[] babbling2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        System.out.println(p.solution(babbling2));
    }
}
