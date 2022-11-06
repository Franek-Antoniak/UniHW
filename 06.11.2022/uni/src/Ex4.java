import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("1\t\t2\t\t3\t\t4");
        for (int i = 1; i <= x; i++) {
            int power = 1;
            for (int q = 0; q <= 3; q++) {
                System.out.printf("%d\t\t", power *= i);
            }
            System.out.println();
        }
    }
}
