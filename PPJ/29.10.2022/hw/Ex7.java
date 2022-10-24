import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter farenheit value: ");
        double farenheit = input.nextDouble();
        double celcus = (farenheit - 32) * 5 / 9;
        System.out.println("Celcus value is: " + celcus);
    }
}
