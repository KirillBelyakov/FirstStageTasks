package JavaFundamentals.MainTask;

import java.util.Scanner;
//2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class SecondTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите аргументы:");
        String line = scan.nextLine();
        String reversedString = new StringBuffer(line).reverse().toString();
        System.out.println(reversedString);
        scan.close();
    }
}