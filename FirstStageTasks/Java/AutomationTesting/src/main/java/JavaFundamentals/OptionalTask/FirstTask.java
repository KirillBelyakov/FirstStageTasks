package JavaFundamentals.OptionalTask;

import java.util.Scanner;
//1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class FirstTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int arrayLength = scan.nextInt();
        String[] numbers = new String[arrayLength];
        int i;
        for (i = 0; i < arrayLength; i++) {
            System.out.println("Введите число:");
            numbers[i] = scan.next();
        }
        scan.close();
        String number1 = numbers[0];
        int max = numbers[0].length();
        for (i = 0; i < arrayLength; i++) {
            if (numbers[i].length() > max) {
                max = numbers[i].length();
                number1 = numbers[i];
            }
        }
        System.out.println("Самое длинное число:" + number1 + " Его длинна:" + max);

        String number2 = numbers[0];
        int min = numbers[0].length();
        for (i = 0; i < arrayLength; i++) {
            if (numbers[i].length() < min) {
                min = numbers[i].length();
                number2 = numbers[i];
            }
        }
        System.out.println("Самое короткое число:" + number2 + " Его длинна:" + min);
    }
}