public class Ex6 {
    public static void main(String[] args) {
        int[][] result = calculateSquares(10, 5, 2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
        int maxHeight = screenHeight - side + 1;
        int maxWidth = screenWidth - side + 1;
        int[][] result = new int[maxWidth][maxHeight];
        for (int i = 0; i < maxWidth; i++) {
            for (int j = 0; j < maxHeight; j++) {
                result[i][j] = 1;
            }
        }
        return result;
    }
}
