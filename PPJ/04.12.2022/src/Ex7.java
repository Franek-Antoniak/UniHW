import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(tab));
        swap(tab, 2, 5);
        System.out.println(Arrays.toString(tab));
    }

    public static void swap(int[] tab, int x, int y) {
        tab[x] ^= tab[y] ^ (tab[y] = tab[x]);
    }
}
