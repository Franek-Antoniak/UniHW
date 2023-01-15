import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class Ex2 {
    public static void main(String[] args) {
        try (FileInputStream f = new FileInputStream("PPJ/15.01.2023/src/Ex1.java")) {
            HashMap<Character, Integer> map = new HashMap<>();
            String x = new String(f.readAllBytes());
            for (int i = 0; i < x.length(); i++) {
                map.putIfAbsent(x.charAt(i), 1);
                map.compute(x.charAt(i), (a, b) -> b + 1);
            }
            map.forEach((a, b) -> System.out.println(a + " " + b));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
