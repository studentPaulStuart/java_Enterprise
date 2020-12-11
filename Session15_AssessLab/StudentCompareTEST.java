package Session15_AssessLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentCompareTEST {

       public static void main(String[] args) {

              // Create Series of Students that aggrevate Person Class and then add to a list
              Student stu1 = new Student(123, "01-02-2020", "English");
              Person per1 = new Person("Max", "max@gmail.com", "054327499");
              stu1.setPerson(per1);
              Student stu2 = new Student(568, "04-02-2020", "English");
              Person per2 = new Person("Jim", "jim@gmail.com", "458719974");
              stu2.setPerson(per2);
              Student stu3 = new Student(731, "02-02-2020", "Sports");
              Person per3 = new Person("Ann", "ann@gmail.com", "04256897");
              stu3.setPerson(per3);
              Student stu4 = new Student(197, "05-02-2020", "Sports");
              Person per4 = new Person("Stacey", "stacey@gmail.com", "45689248");
              stu4.setPerson(per4);
              Student stu5 = new Student(916, "02-02-2020", "Chemistry");
              Person per5 = new Person("Aaron", "aaron@gmail.com", "12368496");
              stu5.setPerson(per5);

              // Create a list and add each of the student objects
              List<Student> studentList = new ArrayList<>();

              studentList.add(stu1);
              studentList.add(stu2);
              studentList.add(stu3);
              studentList.add(stu4);
              studentList.add(stu5);

              // Before/After sorting with the implements Comparator Override
              System.out.println("---------------------- Before Sorting, using Iterator ------------------------\n");
              Iterator<Student> stuIterator = studentList.iterator();
              while (stuIterator.hasNext()) {
                     System.out.println(stuIterator.next());
              }

              System.out.println("---------------------- After Sorting, using Comparator ------------------------\n");
              Collections.sort(studentList, new StudentSortCompare());
              for (Student students : studentList) {
                     System.out.println(students);
              }

       }
}
