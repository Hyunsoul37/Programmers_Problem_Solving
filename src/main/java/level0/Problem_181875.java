package level0;

public class Problem_181875 {
    public String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            }
            else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }

        return strArr;
    }

    public static void main(String[] args) {
        Problem_181875 p = new Problem_181875();

        String[] result1 = p.solution(new String[] {"AAA","BBB","CCC","DDD"});
        for(String s : result1) {
            System.out.println(s);
        }

        System.out.println();

        String[] result2 = p.solution(new String[] {"aBc","AbC"});
        for(String s : result2) {
            System.out.println(s);
        }
    }
}
