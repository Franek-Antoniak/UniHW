import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum *= x;
        }
        System.out.println(sum);
    }
}
