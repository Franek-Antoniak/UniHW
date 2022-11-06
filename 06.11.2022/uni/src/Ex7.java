public class Ex7 {
    public static void main(String[] args) {
        char[] chars = new char[3];
        for (int i = 0; i < 3; i++) {
            chars[i] = (char) (Math.random() * 255);
        }
        int min = 0;
        for (int i = 1; i < 3; i++) {
            if (chars[i] < chars[min]) {
                min = i;
            }
        }
        System.out.println("Min index: " + min);
    }
}
