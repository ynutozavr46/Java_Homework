package LB05;
public class PrintArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        printArray(array);
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
