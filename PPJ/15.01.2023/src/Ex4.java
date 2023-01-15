import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try (PrintWriter pw = new PrintWriter("PPJ/15.01.2023/src/inputData" + i + ".txt")) {
                Integer[] tab = new Integer[10];
                for (int j = 0; j < 10; j++) {
                    tab[j] = (int) (Math.random() * 10000);
                }
                Arrays.sort(tab);
                for (int j = 0; j < 10; j++) {
                    pw.println(tab[j]);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
