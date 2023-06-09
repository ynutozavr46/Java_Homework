package LB04;

public class Task1 {
    public Task1() {
       
    }

    public static void main(String[] args) {
        int[] evenNumbers = new int[50];
        int[] oddNumbers = new int[50];

        // fill the evenNumbers array with even numbers
        for (int i = 0, num = 0; i < evenNumbers.length; i++, num += 2) {
            evenNumbers[i] = num;
        }

        // fill the oddNumbers array with odd numbers
        for (int i = 0, num = 1; i < oddNumbers.length; i++, num += 2) {
            oddNumbers[i] = num;
        }

        // print the evenNumbers array
        System.out.println("Even numbers:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // print the oddNumbers array
        System.out.println("Odd numbers:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
