import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] tab1 = new int[random.nextInt(10)];
		int[] tab2 = new int[random.nextInt(10)];
		int[] tab3 = new int[random.nextInt(10)];
		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = random.nextInt(100);
		}
		for (int i = 0; i < tab2.length; i++) {
			tab2[i] = random.nextInt(100);
		}
		for (int i = 0; i < tab3.length; i++) {
			tab3[i] = random.nextInt(100);
		}
		int[][] tab = new int[3][];
		tab[0] = tab1;
		tab[1] = tab2;
		tab[2] = tab3;
		for (int[] ints : tab) {
			for (int anInt : ints) {
				System.out.print(anInt + " ");
			}
			System.out.println();
		}


	}
}