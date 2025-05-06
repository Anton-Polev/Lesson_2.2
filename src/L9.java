import java.util.Scanner;

public class L9 {

    public static int inputYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год:");
        int num = scan.nextInt();
        scan.close();
        return num;
    }

    public static boolean year(int num) {
        return (num % 4 == 0 && num % 100 != 0) || (num % 400 == 0);

    }

    public static void main(String[] args) {
        int getYear = inputYear();
        System.out.println(year(getYear));
    }
}
