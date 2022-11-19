public class Ex5 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 5) + 10;
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int k : arr) {
            System.out.printf("%d ", k);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j : arr) {
                if (j == i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
