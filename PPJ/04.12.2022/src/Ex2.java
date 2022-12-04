import java.util.Locale;

public class Ex2 {
    public static void main(String[] args) {
        char[] input = "Ala ma kota".toLowerCase(Locale.ROOT).replaceAll("\\s+", "").toCharArray();
        countLetters(input);
    }

    public static void countLetters(char[] input) {
        int[] letters = new int[26];
        for (char c : input) {
            letters[c - 'a']++;
        }
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > 0) {
                System.out.printf("%c: %d\n", i + 'a', letters[i]);
            }
        }
    }
}
