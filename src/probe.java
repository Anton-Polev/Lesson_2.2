public class probe {
    public static void main(String[] args) {
        int[][] table = new int[8][8];
        int counter = 1;

        // Заполнение массива значениями
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                table[i][j] = counter;
                counter++;
            }
        }

        // Заполнение главной диагонали единицами
        for (int i = 0; i < 8; i++) {
            table[i][i] = 1; // Заполняем главные диагональные элементы единицами
        }

        // Заполнение побочной диагонали единицами
        for (int i = 0; i < 8; i++) {
            table[i][7 - i] = 1; // Заполняем побочные диагональные элементы единицами
        }

        // Вывод массива
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(table[i][j] + " "); // Печатаем элементы в одной строке
            }
            System.out.println(); // Переход на новую строку после каждой строки массива
        }
    }
}
