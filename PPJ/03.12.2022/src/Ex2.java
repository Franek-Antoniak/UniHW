public class Ex2 {
	public static void main(String[] args) {
		float[][] tab = new float[8][8];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = (float) Math.random();
			}
		}
		float sum1 = 0;
		float sum2 = 0;
		for (int i = 0; i < tab.length; i++) {
			sum1 += tab[i][i];
			sum2 += tab[i][tab.length - 1 - i];
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
