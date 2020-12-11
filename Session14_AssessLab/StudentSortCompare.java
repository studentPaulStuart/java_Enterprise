package Session14_AssessLab;

import java.util.Comparator;

public class StudentSortCompare implements Comparator<Student> {

       @Override
       public int compare(Student o1, Student o2) {

              // For Comparison
              int ProgramCompare = o1.program.compareTo(o2.program);
              int IdCompare = o1.Id - o2.Id;

              // 2 level comparison with Program and ID
              if (ProgramCompare == 0) {
                     return ((IdCompare == 0) ? ProgramCompare : IdCompare);
              } else {
                     return ProgramCompare;
              }
       }
}
