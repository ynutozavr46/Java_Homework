package LB01;
public class NumberReversal {
    public static void main(String[] args) {
        int number = 412;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        System.out.println("Реверсоване число: " + reversedNumber);
    }
}
