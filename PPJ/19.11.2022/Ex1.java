public class Ex1 {
    public static void main(String[] args) {
        double[] tab = new double[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Math.random() * 100;
        }
        for (double v : tab) {
            System.out.println(v);
        }
        for (int i = 1; i < tab.length; i += 2) {
            System.out.println(tab[i]);
        }
        for (double v : tab) {
            if ((int) v % 2 == 1) {
                System.out.println(v);
            }
        }
    }
}