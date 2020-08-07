package JavaFundamentals.OptionalTask;

import java.util.Scanner;
//3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
public class ThirdTask {
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
        int summaryLength = 0;
        for (i = 0; i < arrayLength; i++) {
            summaryLength += numbers[i].length();
        }
        int averageLength = summaryLength / arrayLength;

        for (i = 0; i < arrayLength; i++) {
            if (numbers[i].length() > averageLength) {
                System.out.println(numbers[i] + " Длинна=" + numbers[i].length());
            }
        }
    }
}
