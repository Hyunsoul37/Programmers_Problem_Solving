package level0;

public class Problem_181926 {
    public int solution(int n, String control) {
        for(int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w':
                    n++;
                    break;
                case 'a':
                    n-=10;
                    break;
                case 's':
                    n--;
                    break;
                case 'd' :
                    n+=10;
                    break;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Problem_181926 p = new Problem_181926();

        System.out.println(p.solution(0, "wsdawsdassw"));
    }
}
