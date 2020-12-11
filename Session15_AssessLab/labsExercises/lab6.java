// Cities Sorting Exercise
package Session15_AssessLab.labsExercises;

public class lab6 {

       public static void main(String[] args) {

              // Declare Array String of Cities to Sort
              String[] citiesArray = {
                     "Hobart",
                     "Melbourne",
                     "Canberra",
                     "Darwin",
                     "Adelaide",
                     "Perth",
                     "Sydney",
                     "Alice Springs",
                     "Townsville",
                     "Geelong",
                     "Whyalla",
                     "Fremantle",
                     "Broome",
                     "NewCastle"
              };

              // Alphabetical Sort
              bubbleSortOfCities(citiesArray);
              System.out.println("Ascending Alphabetical Order: ");
              for (int i = 0; i < citiesArray.length; i++) {
                     String x = citiesArray[i];
                     System.out.println(x + " ");
              }

              // Alphabetical Reverse Sort
              bubbleSortOfCitiesRev(citiesArray);
              System.out.println("\nAscending Reverse Alphabetical Order: ");
              for (int i = 0; i < citiesArray.length; i++) {
                     String x = citiesArray[i];
                     System.out.println(x + " ");
              }

       } // End of Main

       private static void bubbleSortOfCities(String array[]) {

              String temp;
              int count = array.length;
              for (int i = 0; i < count; i++) {
                     for (int j = i + 1; j < count; j++) {
                            if (array[i].compareTo(array[j]) > 0) {
                                   temp = array[i];
                                   array[i] = array[j];
                                   array[j] = temp;
                            }
                     }
              }

       } // End of BubbleSortCity Method

       private static void bubbleSortOfCitiesRev(String array[]) {

              String temp;
              int count = array.length;
              for (int i = 0; i < count; i++) {
                     for (int j = i + 1; j < count; j++) {
                            if (array[i].compareTo(array[j]) < 0) {
                                   temp = array[i];
                                   array[i] = array[j];
                                   array[j] = temp;
                            }
                     }
              }

       } // End of BubbleSortCity Reverse Alphabetical Order Method

}
