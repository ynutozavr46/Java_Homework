package LB03;

public class Task1 {
    public Task1() {
    }

    public static void main(String[] args) {
        String phrase = "Hello, world!"; // Change this to any phrase you like

        // Using a for loop
        System.out.println("Using a for loop:");
        for (int i = 0; i < 50; i++) {
            System.out.println(phrase);
        }

        // Using a while loop
        System.out.println("Using a while loop:");
        int count = 0;
        while (count < 50) {
            System.out.println(phrase);
            count++;
        }
    }
}
