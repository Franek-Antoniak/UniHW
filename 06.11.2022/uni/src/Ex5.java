import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt();
        for(int i = 0; i < x / 2 + 1; i++) {
            StringBuilder s = new StringBuilder();
            s.append(".".repeat((y - 2 * i + 1) / 2));
            s.append("*".repeat(2 * i + 1));
            s.append(".".repeat((y - 2 * i + 1) / 2));
            System.out.println(s);
        }
        for(int i = x / 2 + 1; i >= 0; i--) {
            StringBuilder s = new StringBuilder();
            s.append(".".repeat((y - 2 * i + 1) / 2));
            s.append("*".repeat(2 * i + 1));
            s.append(".".repeat((y - 2 * i + 1) / 2));
            System.out.println(s);
        }
    }
}
