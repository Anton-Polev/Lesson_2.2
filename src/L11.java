import java.util.Arrays;

public class L11 {
    public static void main(String[] args) {
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++)
            num[i] = i + 1;
        System.out.println(Arrays.toString(num));
    }
}
