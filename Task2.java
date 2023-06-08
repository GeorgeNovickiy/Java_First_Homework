public class Task2 {
    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000
        int num = 1000;
        boolean flag = true;
        while  (num > 1){
            flag = true;
            for (int j = 2; j < num;){
                if (num % j != 0) {j++;}
                else {
                    flag = false;
                    j++;
                }
            }
            if (flag == true) System.out.println(num);
            num--;
        }
    }
    
}
