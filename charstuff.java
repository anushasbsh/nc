
import java.util.Scanner;

public class charstuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String s = "";
        int c = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == 'c') {
                c++;
                s += ch;
                if (c < 5) {
                    s += 'a';
                    c = 0;
                }
            } else {
                s += ch;
                c = 0;
            }
        }
        System.out.println(s);
    }
}