import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      boolean[] chptList = new boolean[16]; 
      int includeChpt;
      int j; 

      
      for (int i = 1; i <= 15; ++i) {
         includeChpt = scnr.nextInt(); 
         chptList[i] = (includeChpt == 1);
      }
      
      boolean anySelected = false;

      int i = 1;
      while (i <= 15) {
         if (chptList[i]) {
            anySelected = true;
            int start = i;

            int end = start;
            while (end + 1 <= 15 && chptList[end + 1]) {
               end++;
            }

            if (end - start >= 2) {
               System.out.print(start + "-" + end + " ");
            } else { 
               for (j = start; j <= end; j++) {
                  System.out.print(j + " ");
               }
            }

            i = end + 1;
         } else {
            i++;
         }
      }

      if(!anySelected) {
         System.out.print("None ");
      }

      System.out.println();
   }
}
