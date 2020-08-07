package JavaFundamentals.MainTask;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        //1.     Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scan.nextLine();
        System.out.println("Приветсвтую вас," + name);
        scan.close();
    }
}