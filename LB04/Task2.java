package LB04;

public class Task2 {
    public Task2() {
       
    }

    public static void main(String[] args) {
        int[] nums = { 2, 17, 13, 6, 22, 31, 45, 66, 100, -18 };

        // while loop
        System.out.println("While loop:");
        int i = 0;
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i++;
        }
        System.out.println();

        // for loop
        System.out.println("For loop:");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        // while loop for odd indices
        System.out.println("While loop for odd indices:");
        i = 1;
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i += 2;
        }
        System.out.println();

        // for loop for even indices
        System.out.println("For loop for even indices:");
        for (int j = 0; j < nums.length; j += 2) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        // reverse order
        System.out.println("Reverse order:");
        for (int k = nums.length - 1; k >= 0; k--) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();
    }
}
