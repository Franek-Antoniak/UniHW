import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        char[] c = new char[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) ('A' + Math.random() * 26);
        }
        Scanner s = new Scanner(System.in);
        while (!Arrays.equals(c, new char[5])) {
            char ch = s.next().charAt(0);
            int counter = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == ch) {
                    c[i] = 0;
                    counter++;
                }
            }
            System.out.println(ch + " " + counter);
        }
    }
}
