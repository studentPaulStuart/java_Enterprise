/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session14_AssessLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author pauls
 */
public class EnrollSortCompareTest {

       public EnrollSortCompareTest() {
       }

       /**
        * Test of compare method, of class EnrollSortCompare.
        */
       @Test
       public void testCompare() {

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

              // Before/After sorting with the implements Comparator Override
              System.out.println("---------------------- Before Sorting, using Iterator ------------------------\n");
              Iterator<Enrollment> enrollIter = enrollList.iterator();
              while (enrollIter.hasNext()) {
                     System.out.println(enrollIter.next());
              }

              // After Sorting with the Comparator
              System.out.println("---------------------- After Sorting, using HashCode ------------------------\n");
              Collections.sort(enrollList, new EnrollSortCompare());
              for (Enrollment enrollments : enrollList) {
                     System.out.println(enrollments);

              }

       }
}
