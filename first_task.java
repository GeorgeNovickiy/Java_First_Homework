import java.util.Scanner;


public class first_task {
    public static void main(String[] args) {

//         1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//              1 + 2 + 3 1*2*3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String  number = scanner.next();
        int count1 = Integer.parseInt (number);
        int result1 = 0;
        while (count1 > 0){
            result1 += count1;
            count1 --;
        }
        int count2 = Integer.parseInt (number);
        int result2 = 1;
        while (count2 > 1){
            result2 = result2 * count2;
            count2 --;
        }
        System.out.println("Треугольное число равно " + result1 + ", факториал числа равен " + result2 );
        scanner.close();
    }
}