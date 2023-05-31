public class LinearSearch {
   static int search(int[] arr, int num){
      int i;
      for(i = 0; i < arr.length; i++){
         if(arr[i]==num){
           return i;
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      int[] arr = {1,2,3,4,5};
      int num = 5;
    	int index = search(arr,4);
      System.out.println(num + " is present at index " + index);
   }
}
