package LB05;
public class MinimumNumber {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 3;
        
        int min = findMinimum(num1, num2, num3);
        System.out.println("Найменше число: " + min);
    }
    
    public static int findMinimum(int a, int b, int c) {
        int min = a;
        
        if (b < min) {
            min = b;
        }
        
        if (c < min) {
            min = c;
        }
        
        return min;
    }
}
