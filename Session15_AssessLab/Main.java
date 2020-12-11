package Session15_AssessLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

       public static void main(String[] args) {

              Person p1 = new Person("James", "jim@gmail.com", "458719974");
              Person p2 = new Person("Aaron", "aaron@gmail.com", "12368496");
              Person p3 = new Person("Stacey", "stacey@gmail.com", "45689248");
              Person p4 = new Person("Seth", "seth@gmail.com", "04256897");
              Student s1 = new Student(123, "01-02-2020", "English");
              Student s2 = new Student(568, "04-02-2020", "English");
              Student s3 = new Student(731, "02-02-2020", "Sports");
              Student s4 = new Student(197, "05-02-2020", "Sports");
              s1.setPerson(p1);
              s2.setPerson(p2);
              s3.setPerson(p3);
              s4.setPerson(p4);

              ArrayList<Student> studentsList = new ArrayList<>();
              studentsList.add(s1);
              studentsList.add(s2);
              studentsList.add(s3);
              studentsList.add(s4);

              // Create new Courses and compare
              Course c1 = new Course(356, "Maths", 500f);
              Course c2 = new Course(357, "English", 450f);
              Course c3 = new Course(345, "Sports", 630f);
              Course c4 = new Course(489, "Physics", 450f);

              // Create List and each new course Object
              List<Course> courseList = new ArrayList<>();

              courseList.add(c1);
              courseList.add(c2);
              courseList.add(c3);
              courseList.add(c4);

              // Create new Courses and compare
              Enrollment e1 = new Enrollment(1, "01-02-2020", "D");
              Enrollment e2 = new Enrollment(2, "03-02-2020", "D");
              Enrollment e3 = new Enrollment(2, "05-02-2020", "P");
              Enrollment e4 = new Enrollment(1, "01-02-2020", "C");

              // Create List and each new course Object
              List<Enrollment> enrollList = new ArrayList<>();

              enrollList.add(e1);
              enrollList.add(e2);
              enrollList.add(e3);
              enrollList.add(e4);

              // Testing Part C and D
              // Linear Int Searching ------------------------------------------------------------
              System.out.println("------------------- Searching -------------------");
              int[] a1 = {10, 20, 30, 50, 70, 90};
              int key = 50;
              System.out.println(key + " is found at index: " + linearSearchInt(a1, key));

              // Linear String Searching ------------------------------------------------------------
              String[] listStrings1 = {"Mark", "James", "Mary", "Alison", "Angella", "Kurk", "Zena"};
              System.out.println("String Alison in the listStrings1 Array is found at index: " + arrayStringBinarySearch(listStrings1, "Alison"));
              System.out.println("-------------------------------------------------");

              // Before/After sorting with the implements Comparator Override
              System.out.println("---------------------- Before Sorting, using Iterator Student ------------------------\n");
              Iterator<Student> stuIterator = studentsList.iterator();
              while (stuIterator.hasNext()) {
                     System.out.println(stuIterator.next());
              }

              System.out.println("---------------------- After Sorting, using Comparator Student ------------------------\n");
              Collections.sort(studentsList, new StudentSortCompare());
              for (Student students : studentsList) {
                     System.out.println(students);
              }
              
               // Before/After sorting with the implements Comparator Override Enrollment
              System.out.println("---------------------- Before Sorting, using Iterator Enrollment ------------------------\n");
              Iterator<Enrollment> enrollIter = enrollList.iterator();
              while (enrollIter.hasNext()) {
                     System.out.println(enrollIter.next());
              }

              // After Sorting with the Comparator Enrollment
              System.out.println("\n---------------------- After Sorting, using HashCode Enrollment ------------------------\n");
              Collections.sort(enrollList, new EnrollSortCompare());
              for (Enrollment enrollments : enrollList) {
                     System.out.println(enrollments);
              }
              
              // Before/After sorting with the implements Comparator Override
              System.out.println("\n---------------------- Before Sorting, using Iterator Course ------------------------\n");
              Iterator<Course> courseIter = courseList.iterator();
              while (courseIter.hasNext()) {
                     System.out.println(courseIter.next());
              }

              // After Sorting with the Comparator
              System.out.println("\n---------------------- After Sorting, using Comparator Course ------------------------\n");
              Collections.sort(courseList, new CourseSortCompare());
              for (Course courses : courseList) {
                     System.out.println(courses);
              }

       }

// -------------------------------------------------------------------- Methods -------------------------------------------------------------------- //
// Sorting Strings Array
       public static void linearStringSearch(String array[]) {
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
       } // End of linearStringSearch

       // Sorting other direction Strings Array
       public static void linearStringSearchReverse(String array[]) {
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
       } // end of linearStringSearchReverse

       // Bubble Sort Method biggest to smallest
       public static void linearBubbleBigSmall(int array[]) {
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
       } // End of linearBubbleBigSmall

       // Bubble Sort Method smallest to biggest
       public static void linearBubbleSmallBig(int array[]) {
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
       } // End of linearBubbleSmallBig

       // Linear Search int
       public static int linearSearchInt(int[] arr, int key) {
              for (int i = 0; i < arr.length; i++) {
                     if (arr[i] == key) {
                            return i;
                     }
              }
              return -1;
       }

       // Binary Search for String
       public static int arrayStringBinarySearch(String[] array, String item) {
              int min = 0;
              int max = array.length - 1;
              int mid;
              String itemUpper = item.toUpperCase();

              mid = (min + max) / 2;
              if (array[mid].toUpperCase().equals(itemUpper)) {
                     return mid;
              }
              if (itemUpper.compareTo(array[mid].toUpperCase()) > 0) {
                     min = mid + 1;
              } else {
                     max = mid - 1;
              }
              while (min <= max);
              return -1;
       }

}
