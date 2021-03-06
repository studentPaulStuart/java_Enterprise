package Session15_AssessLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EnrollmentCompareTest {

       public static void main(String[] args) {

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

       }
}
