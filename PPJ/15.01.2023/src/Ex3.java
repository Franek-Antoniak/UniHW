import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("PPJ/15.01.2023/src/test1.txt"));
        long x = 0;
        while (sc.hasNextLine()) {
            x += sc.nextInt();
        }
        System.out.println(x);
    }
}
