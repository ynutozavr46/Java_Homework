package LB04;

public class Task3 {
    public Task3() {
       
    }

    public static void main(String[] args) {
        double[] array = {2.5, 3.7, 1.0, 4.9, 2.1}; // example array
        double sum = 0.0;

        // loop through the array and add up all elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("The sum of elements in the array is: " + sum);
    }
}
