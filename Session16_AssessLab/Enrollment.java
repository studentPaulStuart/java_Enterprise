package Session16_AssessLab;

import java.util.Objects;

public class Enrollment implements Comparable<Enrollment> {

    //Declare Global Constants
    public static final int DEFAULT_SEMESTER = 1;
    public static final String DEFAULT_DATE_ENROLLED = "DD-MM-YYYY";
    public static final String DEFAULT_GRADE = "Null";

    int semester;
    String dateEnrolled;
    String grade;

    // Date only constructor
    public Enrollment(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public Enrollment(int semester, String dateEnrolled, String grade) {
        this.semester = semester;
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;

    }

    public Enrollment() {
        this.semester = DEFAULT_SEMESTER;
        this.dateEnrolled = DEFAULT_DATE_ENROLLED;
        this.grade = DEFAULT_GRADE;
    }

    public String getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Override Methods for HashCode Comparison
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.dateEnrolled);
        hash = 97 * hash + Objects.hashCode(this.grade);
        hash = 97 * hash + this.semester;
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
        final Enrollment other = (Enrollment) obj;
        if (this.semester != other.semester) {
            return false;
        }
        if (!Objects.equals(this.grade, other.grade)) {
            return false;
        }
        if (!Objects.equals(this.dateEnrolled, other.dateEnrolled)) {
            return false;
        }
        return true;
    }

    // To String Output Method
    @Override
    public String toString() {
        return "Enrollment{" + "semester=" + semester + ", dateEnrolled=" + dateEnrolled + ", grade=" + grade + '}';
    }

    @Override
    public int compareTo(Enrollment e) {
        int returnValue = e.semester - this.semester;
        if (returnValue == 0) {
            returnValue = e.semester;
        }
        return returnValue;
    }
}
