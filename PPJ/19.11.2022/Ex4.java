public class Ex4 {
    public static void main(String[] args) {
        int[] arr = new int[]{153, 333, 370, 515, 407, 80};
        for (int j : arr) {
            int num = j;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }
            if (sum == j) {
                System.out.println(j);
            }
        }
    }
}
