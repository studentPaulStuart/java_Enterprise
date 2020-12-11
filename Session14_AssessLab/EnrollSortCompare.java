package Session14_AssessLab;

import java.util.Comparator;

public class EnrollSortCompare implements Comparator<Enrollment> {

       @Override
       public int compare(Enrollment o1, Enrollment o2) {

              // For Comparison
              int dateEnrollCompare = o1.dateEnrolled.compareTo(o2.dateEnrolled);
              int semesterCompare = o1.semester - o2.semester;
              int gradeCompare = o1.grade.compareTo(o2.grade);
              int hashCompare = o1.hashCode() - o2.hashCode();

              // Check all Variables in an Enrollment becuase easy for several students to be enrolled
              // in same course in same semester, also using hashcode to compare different enrollments
              if (dateEnrollCompare == 0) {
                     return ((hashCompare == 0) ? dateEnrollCompare : hashCompare);
              }
              if (gradeCompare == 0) {
                     return ((hashCompare == 0) ? dateEnrollCompare : hashCompare);
              } else {
                     return hashCompare;
              }
       }
}
