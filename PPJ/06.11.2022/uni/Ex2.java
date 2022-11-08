import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double[] tab = new double[16];
        tab[0] = 500f;
        tab[1] = 200f;
        tab[2] = 100f;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double x = scanner.nextFloat();
        for(int i = 3; i < 16; i++) {
            tab[i] = tab[i - 3] / 10;
        }
        for(int i = 0; i < 16; i++) {
            if (x >= tab[i]) {
                System.out.printf("%d * %.3f\n", (int) (x / tab[i]), tab[i]);
                x -= tab[i] * (int) (x / tab[i]);
            }
        }
    }
}
