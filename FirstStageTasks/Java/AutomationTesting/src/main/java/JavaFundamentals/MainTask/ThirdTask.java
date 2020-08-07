package JavaFundamentals.MainTask;

import java.util.Scanner;
//3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class ThirdTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество случайных чисел:");
        int quantity = scan.nextInt();
        int number;
        for (int i = 0; i < quantity; i++) {
            number = (int) (Math.random() * 100);
            if (number % 2 == 0)
                System.out.println(number);// выводим четные числа с новой строки
            else
                System.out.print(number + ",");// выводим нечетные числа через запятую в одну строку
        }scan.close();
    }
}
