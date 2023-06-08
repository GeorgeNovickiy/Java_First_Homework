import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Реализовать простой калькулятор (+-/*)
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        String  num1 = scanner.next();
        System.out.println("Введите действие, которое нужно выполнить: " +
                "1 - сложение, " +
                "2 - вычитание, " +
                "3 - умножение, " +
                "4 - деление ");
        String  act = scanner.next();
        System.out.println("Введите второе число: ");
        String  num2 = scanner.next();

        double  result = 0;
        if (Integer.parseInt(act) == 1) result = Integer.parseInt(num1) + Integer.parseInt(num2);
        else if (Integer.parseInt(act) == 2) result = Integer.parseInt(num1) - Integer.parseInt(num2);
        else if (Integer.parseInt(act) == 3) result = Integer.parseInt(num1) * Integer.parseInt(num2);
        else result = Double.parseDouble(num1) / Double.parseDouble(num2);

        System.out.println("Результат: ");
        System.out.println(result);
        scanner.close();

    }
}
