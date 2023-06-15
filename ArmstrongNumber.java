import java.lang.Math;
public class ArmstrongNumber {
   public static void isArmstrongNum(int num,int len) {
      int copy = num;
      int sum=0;
      int temp=0;
      while(num!=0) {
         temp = num%10;
         sum += Math.pow(temp,3);
         num = num/10;
      }
      if(sum == copy) {
         System.out.println("It's a armstrong number");
        }
      else {
        System.out.println("It's not a armstrong number");
          }
   public static void main(String[] args) {
      int num =370;
      int len = 3;
      isArmstrongNum(num,len);
   }
}
