package Session15_AssessLab;

import Session14_AssessLab.*;
import java.util.Comparator;

public class CourseSortCompare implements Comparator<Course> {

       @Override
       public int compare(Course o1, Course o2) {

              //Compare the course and Course Code
              int CourseCompare = o1.courseName.compareTo(o2.courseName);
              int CodeCompare = o1.courseCode - o2.courseCode;

              // Check Both the Name and Code of the Course
              if (CourseCompare == 0) {
                     return ((CodeCompare == 0) ? CourseCompare : CodeCompare);
              } else {
                     return CourseCompare;
              }
       }
}
