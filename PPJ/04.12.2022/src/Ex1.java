import java.time.LocalDateTime;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(), year = scanner.nextInt();
        printMonth(month, year);
    }

    public static void printMonth(int month, int year) {
        LocalDateTime date = LocalDateTime.of(year, month, 1, 0, 0);
        int daysInMonth = date.getMonth().length(year % 4 == 0 || year % 400 == 0 && year % 100 != 0);
        int dayOfWeek = date.getDayOfWeek().getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.printf("%4s", "");
        }
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i);
            if (dayOfWeek == 7) {
                System.out.println();
                dayOfWeek = 1;
            } else {
                dayOfWeek++;
            }
        }
    }
}