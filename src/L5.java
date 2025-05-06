import java.util.Scanner;

public class L5 {

    public static boolean number() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int num1 = scan.nextInt();
        System.out.println("Введите число:");
        int num2 = scan.nextInt();
        scan.close();
        int s = num1 + num2;
        return (s >= 10 && s <= 20);
    }

    public static void main(String[] args) {
        System.out.println(number());
    }
}
