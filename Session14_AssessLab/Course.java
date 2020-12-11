package Session14_AssessLab;

import java.util.Objects;

public class Course {

       int courseCode;
       String courseName;
       Float cost;

       public Course(int courseCode, String courseName, Float cost) {
              this.courseCode = courseCode;
              this.courseName = courseName;
              this.cost = cost;
       }

       public Course() {
       }

       public Course(int courseCode) {
              this.courseCode = courseCode;
       }

       public Course(int CourseCode, String CourseName) {
              this.courseCode = courseCode;
              this.courseName = courseName;
       }

       public int getCourseCode() {
              return courseCode;
       }

       public void setCourseCode(int courseCode) {
              this.courseCode = courseCode;
       }

       public String getCourseName() {
              return courseName;
       }

       public void setCourseName(String courseName) {
              this.courseName = courseName;
       }

       public Float getCost() {
              return cost;
       }

       public void setCost(Float cost) {
              this.cost = cost;
       }

       // Override Methods for HashCode Comparison
       @Override
       public int hashCode() {
              int hash = 7;
              hash = 23 * hash + Objects.hashCode(this.courseCode);
              hash = 23 * hash + Objects.hashCode(this.courseName);
              hash = 23 * hash + Objects.hashCode(this.cost);
              return hash;
       }

       // Override Method for the Equals method Comparison
       @Override
       public boolean equals(Object obj) {
              if (this == obj) {
                     return true;
              }
              if (obj == null) {
                     return false;
              }
              if (getClass() != obj.getClass()) {
                     return false;
              }
              final Course other = (Course) obj;
              if (!Objects.equals(this.courseCode, other.courseCode)) {
                     return false;
              }
              if (!Objects.equals(this.courseName, other.courseName)) {
                     return false;
              }
              if (!Objects.equals(this.cost, other.cost)) {
                     return false;
              }
              return true;
       }

       @Override
       public String toString() {
              return "Course{" + "CourseCode="
                      + courseCode + ", CourseName="
                      + courseName + ", Cost="
                      + cost + '}';
       }

}
