import java.util.Scanner;

public class L6 {

    public static int number() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scan.nextInt();
        scan.close();
        return num;
    }

    public static void number(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void main(String[] args) {
        int num = number();
        number(num);
    }
}
