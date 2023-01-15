import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        assert x >= 0;
        System.out.println(convert(x, 2));
        System.out.println(convert(x, 4));
        System.out.println(convert(x, 8));
        System.out.println(convert(x, 16));
    }

    public static String convert(int x, int base) {
        char[] digits = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder();
        int temp = x;
        int log = 31 - Integer.numberOfLeadingZeros(base);
        int shift = 32 - log;
        while (temp > 0) {
            sb.append(digits[temp << shift >>> shift]);
            temp >>>= log;
        }
        return sb.reverse().toString();
    }
}