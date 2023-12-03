package level0;

public class Problem_181886 {
    public String[] solution(String[] names) {
        String[] answer = {};
        int size = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;
        answer = new String[size];

        for(int i = 0; i < names.length; i+=5) {
            answer[i / 5] = names[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181886 p = new Problem_181886();

        String[] str = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        String[] result = p.solution(str);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
