package JavaFundamentals.MainTask;

import java.util.InputMismatchException;
import java.util.Scanner;
//5.   Ввести число от 1 до 12. Вывести на консоль название месяца,
// соответствующего данному числу. Осуществить проверку корректности ввода чисел.
public class FifthTask {
    public static void main(String[] args) {

        String[] month = {"January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"};
        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Введите номер месяца:");
            int monthNumber=scan.nextInt();
            if(monthNumber>0&&monthNumber<=12){
                System.out.println(month[monthNumber - 1]);}
            else System.out.println("Введите число от 1 до 12"); }
        catch (InputMismatchException e){
            System.out.println("Введите целое число");
        }
    }
}
