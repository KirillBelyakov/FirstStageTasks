package JavaFundamentals.OptionalTask;

import java.util.Scanner;
//2.     Вывести числа в порядке возрастания (убывания) значений их длины.
public class SecondTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int arrayLength = scan.nextInt();
        String[] numbers = new String[arrayLength];
        int i;
        for (i = 0; i < arrayLength; i++) {
            System.out.println("Введите число:");
            numbers[i] = scan.next(); }
        scan.close();
        for (int j = arrayLength - 1; j > 0; j--) {
            for (int k = 0; k < j; k++) {
                if (numbers[k].length() > numbers[k + 1].length()) {
                    String reverse = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = reverse;
                }
            }
        }
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}