/// This is a custom Node Developed for the Course Linked and Double Linked Classes
// It is designed for the Linked Listto Accept Data Object Course Specifically
// @author Paul Stuart
package Session16_AssessLab.CustomList_Course;

public class CourseNode<Course> {

    private Course courseData;
    private CourseNode prev;
    private CourseNode next;

    public Course getCourseData() {
        return courseData;
    }

    public void setCourseData(Course courseData) {
        this.courseData = courseData;
    }

    public CourseNode getPrev() {
        return prev;
    }

    public void setPrev(CourseNode prev) {
        this.prev = prev;
    }

    public CourseNode getNext() {
        return next;
    }

    public void setNext(CourseNode next) {
        this.next = next;
    }

    public CourseNode(Course courseData) {
        this.courseData = courseData;
    }

}
