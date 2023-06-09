package LB03;
import java.util.Scanner;

public class Task5 {
    public Task5() {
    }

    public static void main(String[] args) {
        double x, fx, lower, upper, step;
        int count = 0;

        // Read in range and step size from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        lower = input.nextDouble();

        System.out.print("Enter upper bound: ");
        upper = input.nextDouble();

        System.out.print("Enter step size: ");
        step = input.nextDouble();

        // Print table using while loop
        System.out.println("Table using while loop:");
        x = lower;

        while (x <= upper) {
            fx = Math.pow(x, 5) - x + 1.8;
            System.out.printf("f(%.2f) = %.2f\n", x, fx);
            if (fx >= 1 && fx <= 2) {
                count++;
            }
            x += step;
        }
        if (count == 0) {
            System.out.println("No values within the specified range.");
        } else {
            System.out.printf("%d values within the range [1, 2].\n", count);
        }

        // Print table using for loop
        System.out.println("Table using for loop:");
        count = 0;
        for (x = lower; x <= upper; x += step) {
            fx = Math.pow(x, 5) - x + 1.8;
            System.out.printf("f(%.2f) = %.2f\n", x, fx);
            if (fx >= 1 && fx <= 2) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No values within the specified range.");
        } else {
            System.out.printf("%d values within the range [1, 2].\n", count);
        }
    }
}
