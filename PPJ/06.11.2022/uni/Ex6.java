public class Ex6 {
    public static void main(String[] args) {
        double[] tab = new double[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Math.random() * 100;
            System.out.println(tab[i]);
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                System.out.println(tab[i]);
            }
        }
        System.out.println();
        for (double v : tab) {
            if ((int) (v % 2) != 0) {
                System.out.println(v);
            }
        }
    }
}
