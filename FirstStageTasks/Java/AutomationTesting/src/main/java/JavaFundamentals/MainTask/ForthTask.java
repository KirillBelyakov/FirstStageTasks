package JavaFundamentals.MainTask;

import java.util.Scanner;
//4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
// и вывести результат на консоль.
public class ForthTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int arrayLength = scan.nextInt();
        int[] numbers = new int[arrayLength];
        int i;
        for (i=0; i < arrayLength; i++) {
            System.out.println("Введите число:");
            numbers[i] = scan.nextInt();
        }scan.close();
        int sum=0;
        for( i=0;i< arrayLength;i++){
            sum+=numbers[i];
        }
        System.out.println("Сумма чисел равна="+sum);

        int multiplication=1;
        for( i=0;i< arrayLength;i++){
            multiplication*=numbers[i];
        }
        System.out.println("Произведение чисел ="+multiplication);
    }
}
