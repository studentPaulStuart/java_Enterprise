package Session15_AssessLab.labsExercises;

public class lab3 {

       public static void main(String[] args) {
              // Declare Array to Sort
              int[] arrayOfIntegers = {5, 8, 9, 1, 3, 5, 6, 8, 7};
              // Call method and sort
              linearSearchOfInt(arrayOfIntegers);
              // Call Binary Search
              binarySearchOfInt(arrayOfIntegers, 8);

       }

       // Bubble Sort Method smallest to biggest --------------------------------------------------------
       private static void linearSearchOfInt(int array[]) {
              int temp;
              for (int i = 0; i < array.length; i++) {
                     for (int j = i + 1; j < array.length; j++) {
                            if (array[i] > array[j]) {
                                   temp = array[i];
                                   array[i] = array[j];
                                   array[j] = temp;
                            }
                     }
              }
       }

       // Binary Search Method --------------------------------------------------------
       private static void binarySearchOfInt(int array[], int search) {
              int first = 0;
              int last = array.length - 1;
              int middle = (first + last) / 2;

              while (first <= last) {
                     if (array[middle] < search) {
                            first = middle + 1;
                     } else if (array[middle] == search) {
                            System.out.println("Item found at index: " + middle);
                            break;
                     } else {
                            last = middle - 1;
                     }
                     middle = (first + last) / 2;
              }
              if (first > last) {
                     System.out.println("Element is not found!");
              }

       }

}
