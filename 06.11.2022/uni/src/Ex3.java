import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte x = scanner.nextByte();
        String y = String.format("0x%b", x);
        char z = (char) Integer.parseInt(y);
    }
}
