import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // Napisz program sprawdzający czy podana liczb do programu jest liczbą Armstrong.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number;
        int counter = 0;
        while (temp > 0) {
            temp = temp / 10;
            counter++;
        }
        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            int sumTemp = 1;
            int tempCounter = counter;
            while(tempCounter > 0) {
                sumTemp = sumTemp * digit;
                tempCounter--;
            }
            sum = sum + sumTemp;
            temp = temp / 10;
        }
        if (sum == number) {
            System.out.println("Liczba " + number + " jest liczba Armstronga");
        } else {
            System.out.println("Liczba " + number + " nie jest liczba Armstronga");
        }
    }
}
