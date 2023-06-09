package LB05;
public class MaxNumber {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        
        int max = findMaxNumber(array);
        System.out.println("Найбільше число: " + max);
    }
    
    public static int findMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
