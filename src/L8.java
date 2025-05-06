import java.util.Scanner;

public class L8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = scan.nextLine();
        System.out.println("Сколько раз напечатать:");
        int num = scan.nextInt();
        stringNum(string, num);
        scan.close();
    }

    public static void stringNum(String text, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(text);
        }
    }
}
