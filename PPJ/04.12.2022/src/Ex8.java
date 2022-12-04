import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toLowerCase(Locale.ROOT).toCharArray();
        System.out.println(isPalindrome(chars, chars.length));
    }

    public static boolean isPalindrome(char[] word, int i) {
        if(word.length % 2 == 0 && i == word.length / 2) {
            return word[i] == word[word.length - i - 1];
        } else if(word.length % 2 != 0 && i == word.length / 2) {
            return true;
        }
        else if(word[i - 1] == word[word.length - i]) {
            return isPalindrome(word, i - 1);
        } else {
            return false;
        }
    }
}
