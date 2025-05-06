import java.util.Arrays;

public class L10 {
    public static void main(String[] args) {
        int[] num = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                num[i] = 1;
            } else if (num[i] == 1) {
                num[i] = 0;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
