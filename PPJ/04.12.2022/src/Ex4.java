import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int x = 1234567890;
        System.out.println(x);
        System.out.println(Arrays.toString(splitToDigits(x)));
    }

    public static int[] splitToDigits(int number) {
        int[] digits = new int[Integer.toString(number).length()];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
}
