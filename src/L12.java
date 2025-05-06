import java.util.Arrays;

public class L12 {
    public static void main(String[] args) {
        int[] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            if (num[i] < 6) {
                num[i] = num[i] * 2;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
