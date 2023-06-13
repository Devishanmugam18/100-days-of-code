import java.util.Arrays;

public class HalfAscDescSort {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        
        Arrays.sort(arr, 0, arr.length / 2);
        
        for (int i = arr.length / 2, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
