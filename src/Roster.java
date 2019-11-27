import java.util.ArrayList;
import java.util.List;


public class Roster {
    private String courseName;
    private int courseNumber;
    private List<Student> students = new ArrayList<>();

    public Roster(
        String courseName,
        int number) {

        this.courseName = courseName;
        this.courseNumber = number;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public double getStudentAverage(int index){
        if (index < students.size())
            return students.get(index).getAverage();
        else return Double.NaN;
    }
}
