package Assessable_Labs_TESTING;

import Session14_AssessLab.*;
import Session14_AssessLab.Person;
import Session14_AssessLab.Student;

public class AssessmentLabs_14_Equality_Testing {

       public static void main(String[] args) {

              String str1 = "applePie";
              String str2 = "applePie";
              String str3 = "apple pie";
              String str4 = "Apple pie";

              // This will demonstrate that Upper/Lower Case produces different results in comparisons
              System.out.println("--------------------------------------------------------");
              if (str1 == str2) {
                     System.out.println("apple pie and apple pie are equal");
              } else {
                     System.out.println("apple pie and apple pie are NOT equal");
              }
              if (str3 == str4) {
                     System.out.println("apple pie and Apple pie are equal");
              } else {
                     System.out.println("apple pie and Apple pie are NOT equal");
              }

              // Float comparison, this will illustrate the rounding error in producing true/false
              System.out.println("--------------------------------------------------------");
              float six = 6.0000000F;
              float nearlySix = 6.0000001F;
              float x = 5.05f;
              float y = 0.95f;

              if (six == nearlySix) {
                     System.out.println("The 2 floats are equal when they aren't");
              } else {
                     System.out.println("The 2 floats have been identified correctly as not even");
              }
              System.out.println("5.05 + 5.95 = " + (x + y));
              System.out.println("Does 5.05 + 0.95 = 6?: " + ((x + y) == 6.0f)); // Not reccomended to compare floats unless no other way and aware of consequences

              // Student Comparion
              Student s1 = new Student();
              Student s2 = new Student();
              Student s3 = new Student(134);
              Student s4 = new Student(143);
              Person p1 = new Person();

              // Comparisons .equals
              System.out.println("--------------------------------------------------------");
              System.out.println("s1 is equal to s2: " + (s1.equals(s2))); // True
              System.out.println("s1 is equal to s3: " + (s1.equals(s3))); // False
              System.out.println("Comparing 2 classes with equals method Person vs Student: " + (s1.equals(p1))); // False

              //Comparisons == operator
              System.out.println("--------------------------------------------------------");
              System.out.println("S1 is == to S2: " + (s1 == s2)); // False
              System.out.println("S1 is == to S3: " + (s1 == s3)); // False

              // HashCode OutPut
              System.out.println("--------------------------------------------------------");
              System.out.println("s1 Hashcode = " + s1.hashCode());
              System.out.println("s2 Hashcode = " + s2.hashCode());
              System.out.println("s3 Hashcode = " + s3.hashCode());
              System.out.println("s2 Hashcode equals s1 = " + (s2.hashCode() == s1.hashCode())); // True

              // CompareTo Method Abstract from Comparable<Student> OutPut
              System.out.println("--------------------------------------------------------");
              System.out.println("Compare to Method S3 and S4, returns the difference in ID: " + s3.compareTo(s4));;
              System.out.println("Compare to Method S3 and S3 returns the ID if its the same: " + s3.compareTo(s3));;

              // Create New Person object in new Student Object then compare
              p1 = new Person();
              p1.setName("Barry");
              p1.setEmail("barr@gmail.com");
              p1.setPhone("054368790");
              Student s5 = new Student(999, "12-12-2020", "Maths");
              s5.setPerson(p1);
              System.out.println("s4 output with aggregated person = " + s5.toString());

              //Multifiled Comparator with Student, Course and Enrolment
              System.out.println("--------------------------------------------------------");
              
              // Create Series of Students that aggrevate Person Class and then add to a list
              Student stu1 = new Student(123, "01-02-2020", "Englilsh");
              Person per1 = new Person("Max", "max@gmail.com", "054327499");
              stu1.setPerson(per1);
              
              Student stu2 = new Student(568, "04-02-2020", "Englilsh");
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
              

       } // End of Main Method

} //End of AssessmentLabs_14_Equality_Testing Class
