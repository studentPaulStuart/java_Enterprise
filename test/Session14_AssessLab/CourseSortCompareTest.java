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
public class CourseSortCompareTest {

       public CourseSortCompareTest() {
       }

       /**
        * Test of compare method, of class CourseSortCompare.
        */
       @Test
       public void testCompare() {

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

              // Before/After sorting with the implements Comparator Override
              System.out.println("\n---------------------- Before Sorting, using Iterator ------------------------\n");
              Iterator<Course> courseIter = courseList.iterator();
              while (courseIter.hasNext()) {
                     System.out.println(courseIter.next());
              }

              // After Sorting with the Comparator
              System.out.println("\n---------------------- After Sorting, using Comparator ------------------------\n");
              Collections.sort(courseList, new CourseSortCompare());
              for (Course courses : courseList) {
                     System.out.println(courses);
              }

       }
}
