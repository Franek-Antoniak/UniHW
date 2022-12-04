public class Ex5 {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(1251));
    }

    public static boolean isArmstrongNumber(int number) {
        int length = String.valueOf(number).length();
        int sum = number;
        while (number > 0) {
            int digit = number % 10;
            sum -= Math.pow(digit, length);
            number /= 10;
        }
        return sum == 0;
    }
}
