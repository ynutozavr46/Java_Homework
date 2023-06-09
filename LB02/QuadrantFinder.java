package LB02;
import java.util.Scanner;

public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть координату x: ");
        double x = scanner.nextDouble();
        System.out.print("Введіть координату y: ");
        double y = scanner.nextDouble();
        
        int quadrant;
        
        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        } else {
            quadrant = 0; // Точка лежить на координатних осях
        }
        
        System.out.println("Точка знаходиться в " + quadrant + " квадранті.");
    }
}

