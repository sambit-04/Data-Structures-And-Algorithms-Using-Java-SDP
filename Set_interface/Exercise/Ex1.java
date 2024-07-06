import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student {
    private int studentId;
    private String studentName;
    private int courseId;

    public Student(int studentId, String studentName, int courseId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object student) {
        Student otherStudent = (Student) student;
        return this.studentId == otherStudent.studentId;
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student Id: " + studentId + ", Student Name: " + studentName;
    }
}

class Tester {
    public static Set<Student> findDuplicateEntries(List<Student> students) {
        Set<Integer> uniqueStudentIds = new HashSet<>();
        Set<Student> duplicateStudents = new HashSet<>();

        for (Student student : students) {
            if (!uniqueStudentIds.add(student.getStudentId())) {
                // Student ID already encountered, consider it a duplicate
                duplicateStudents.add(student);
            }
        }

        return duplicateStudents;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        // Add student data (as provided in the example)

        Set<Student> duplicateStudents = findDuplicateEntries(students);
        System.out.println("Students who have applied for re-evaluation in more than one subject:");
        for (Student student : duplicateStudents) {
            System.out.println(student);
        }
    }
}
