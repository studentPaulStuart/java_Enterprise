// Selection Sorting
package Session15_AssessLab.labsExercises;

public class lab5 {

       public static void main(String[] args) {

              // Declare Array to Scores
              int[] arrayScores = {50, 84, 90, 15, 33, 58, 46, 68, 47};
              int i, x;
              // Sorted Array
              BubbleSortOfInt(arrayScores);
              System.out.println("\nThe Sorted Array: ");

              for (i = 0; i < arrayScores.length; i++) {
                     x = arrayScores[i];
                     System.out.println(x + " ");
              }

              // Use Selection Sorting Method
              SelectionSortOfInt(arrayScores);
              System.out.println("\nThe Array After Selection Sorting: ");
              for (i = 0; i < arrayScores.length; i++) {
                     x = arrayScores[i];
                     System.out.println(x + " ");
              }

       } // End of Main ---------------------------------------------------------------------------------

       // Bubble Sort Method
       private static void BubbleSortOfInt(int[] scores) {
              System.out.println("Pre-Bubble Sorted Array: ");

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

       // Selection Sorting Method
       private static void SelectionSortOfInt(int[] scores) {

              // Pre-sorted
              System.out.println("\nThe Array Before Selection Sorting: ");
              for (int i = 0; i < scores.length; i++) {
                     System.out.println(scores[i]);
              }

              // Sorted
              int tmp, min_key;
              for (int j = 0; j < scores.length - 1; j++) {
                     min_key = j;
                     for (int k = j + 1; k < scores.length; k++) {
                            if (scores[k] < scores[min_key]) {
                                   min_key = k;
                            }
                     }
                     tmp = scores[min_key];
                     scores[min_key] = scores[j];
                     scores[j] = tmp;
              } // end of for
       } // end of SelectionSortOfInt method

}
