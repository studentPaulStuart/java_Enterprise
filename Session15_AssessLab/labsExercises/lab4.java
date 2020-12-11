// Bubble Sort
package Session15_AssessLab.labsExercises;

public class lab4 {

       public static void main(String[] args) {

              // Declare Array to Scores
              int[] arrayScores = {50, 84, 90, 15, 33, 58, 46, 68, 47};
              int i, x;
              // Sorted Array
              BubbleSortOfInt(arrayScores);
              System.out.println("The Sorted Array: ");

              for (i = 0; i < arrayScores.length; i++) {
                     x = arrayScores[i];
                     System.out.println(x + " ");
              }

       } // End of Main

       // Bubble Sort Method
       private static void BubbleSortOfInt(int[] scores) {
              int t;
              for (int i = 0; i < scores.length; i++) {
                     System.out.println(scores[i]);
              }
              for (int j = 0; j <= scores.length - 2; j++) {
                     for (int i = 0; i <= scores.length - 2; i++) {
                            if (scores[i] > scores[i + 1]) {
                                   t = scores[i + 1];
                                   scores[i + 1] = scores[i];
                                   scores[i] = t;
                            }
                     }
              }
       }

}
