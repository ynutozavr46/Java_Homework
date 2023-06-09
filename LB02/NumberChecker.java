package LB02;
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        
        boolean isTwoDigit = number >= 10 && number <= 99;
        boolean isEven = number % 2 == 0;
        
        if (isTwoDigit && isEven) {
            System.out.println("Число є двозначним і парним.");
        } else {
            System.out.println("Число не є двозначним і парним.");
        }
    }
}
