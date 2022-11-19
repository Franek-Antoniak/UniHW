import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        char[] c = new char[3];
        c[0] = (char) (new Random().nextInt(26) + 'a');
        c[1] = (char) (new Random().nextInt(26) + 'a');
        c[2] = (char) (new Random().nextInt(26) + 'a');
        int res = -1;
        res = c[0] < c[1] ? 0 : 1;
        res = c[res] < c[2] ? res : 2;
        System.out.println(res);
    }
}
