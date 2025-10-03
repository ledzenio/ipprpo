import java.util.Scanner;

public class TwoNumberCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = a + b;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                } else {
                    result = a / b;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Ошибка: неизвестная операция!");
        }

        scanner.close();
    }
}
