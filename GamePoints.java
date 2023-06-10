public class GamePoints {
   public static int[] calculateTotalPoints(int[] levels){
      int[] totalScore = new int[levels.length];
      int cumulativeScore = 0;
      for(int i = 0; i < levels.length; i++){
         cumulativeScore += levels[i];
         totalScore[i]=cumulativeScore;
   }
      return totalScore;
   }
   public static void main(String[] args) {
      int[] levels = {10,15,20,30};
      int[] totalScore = calculateTotalPoints(levels);
      
      for(int i = 0; i < totalScore.length; i++){
         System.out.println("Level " +(i+1)+ ":" + totalScore[i] +" points");
      }
   }
}
