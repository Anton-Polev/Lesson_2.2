import java.util.Arrays;

public class L13 {
    public static void main(String[] args) {
        int[][] table = new int[8][8];
        int counter = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                table[i][j] = counter;
                counter++;
            }
        }
        for (int i = 0; i < 8; i++) {
            table[i][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%3d ", table[i][j]);
            }
            System.out.println();
        }
    }
}
