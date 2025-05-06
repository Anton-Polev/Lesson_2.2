import java.util.Scanner;

public class L7 {
    public static int number() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scan.nextInt();
        scan.close();
        return num;
    }

    public static boolean number(int num) {
        return num < 0;
    }

    public static void main(String[] args) {
        int num = number();
        boolean res = number(num);
        System.out.println(res);
    }
}
