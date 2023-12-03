package level0;

public class Problem_181890 {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int index = -1;

        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                index = i;
                answer = new String[i];
                System.arraycopy(str_list, 0, answer, 0, i);
                break;
            }
            else if (str_list[i].equals("r")) {
                answer = new String[str_list.length - i - 1];
                System.arraycopy(str_list, i + 1, answer, 0, str_list.length - i - 1);
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181890 p = new Problem_181890();

        String[] str = p.solution(new String[] {"u", "u", "r", "l"});

        for(String s : str) {
            System.out.println(s);
        }
    }
}
