import java.util.Scanner;

public class SumFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        // Проверка на корректность
        if (n < 1) {
            System.out.println("Ошибка: N должно быть больше или равно 1");
        } else {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);
        }

        scanner.close();
    }
}
