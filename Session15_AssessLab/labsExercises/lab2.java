package Session15_AssessLab.labsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class lab2 {

    public static void main(String[] args) {
        // Declare Array String of Cities to Sort
        String[] arrayOfStrings = {
            "Hobart",
            "Melbourne",
            "Canberra",
            "Darwin",
            "Adelaide",
            "Perth",
            "Sydney"
        };
        // Call method and sort
        linearSearchOfCities(arrayOfStrings);
        //Output to Console
        System.out.println(Arrays.toString(arrayOfStrings));

        // Searching for String in Array List
        String searchString = "";
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Hobart");  //Adding  elements to Arraylist
        arrayList.add("Melbourne");
        arrayList.add("Canberra");
        arrayList.add("Darwin");
        arrayList.add("Chennai");
        arrayList.add("Adelaide");
        arrayList.add("Perth");
        arrayList.add("Sydney");

        System.out.println("------------------------------- Searching for String in Array List ------------------------------- ");
        searchString = "Darwin";
        SearchStrings(searchString, arrayList);
        searchString = "Gold Coast";
        SearchStrings(searchString, arrayList);

    }

    // SearchStrings Method
    public static void SearchStrings(String searchStr, ArrayList<String> aList) {

        boolean found = false;
        Iterator<String> iter = aList.iterator();
        String curItem = "";
        int pos = 0;

        while (iter.hasNext() == true) {
            pos = pos + 1;
            curItem = (String) iter.next();
            if (curItem.equals(searchStr)) {
                found = true;
                break;
            }
        }
        if (found == false) {
            pos = 0;
        }
        if (pos != 0) {
            System.out.println(searchStr + " City Found in position : " + pos);
        } else {
            System.out.println(searchStr + " City not found");
        }
    }

    // String Sort Method
    private static void linearSearchOfCities(String array[]) {
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

    }

}
