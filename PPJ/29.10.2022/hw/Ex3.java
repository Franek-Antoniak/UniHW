public class Ex3 {
    public static void main(String[] args) {
        // I know this trick from:
        // x = x ^ y ^ (y = x);
        // expression swaps x and y in one line
        int x = 5;
        System.out.println((x = 4) * x);
    }
}
