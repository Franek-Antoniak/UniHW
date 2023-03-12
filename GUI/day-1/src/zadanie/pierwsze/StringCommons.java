package zadanie.pierwsze;

public class StringCommons {
    public static int countUpperCase(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
