package Session15_AssessLab.labsExercises;

import java.util.Arrays;

public class lab1_b {

       public static void main(String[] args) {
              // Declare Array to Sort
              int[] arrayOfIntegers = {5, 8, 9, 1, 3, 5, 6, 8, 7};
              // Call method and sort
              linearSearchOfIntBig(arrayOfIntegers);
              //Output to Console
              System.out.println(Arrays.toString(arrayOfIntegers));

       }

       // Bubble Sort Method biggest to smallest
       private static void linearSearchOfIntBig(int array[]) {
              int temp;
              for (int i = 0; i < array.length; i++) {
                     for (int j = i + 1; j < array.length; j++) {
                            if (array[i] < array[j]) {
                                   temp = array[i];
                                   array[i] = array[j];
                                   array[j] = temp;
                            }
                     }
              }
       }

}
