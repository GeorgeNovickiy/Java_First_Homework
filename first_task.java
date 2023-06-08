import java.util.Scanner;


public class first_task {
    public static void main(String[] args) {

//         1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//              1 + 2 + 3 1*2*3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String  number = scanner.next();
        int count = Integer.parseInt (number);
        int result = 0;
        while (count > 0){
            result += count;
            count --;
        }
        System.out.println("Треугольное число равно " + result);
        scanner.close();
    }
}