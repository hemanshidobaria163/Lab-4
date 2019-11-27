
public class GradeTracker {

    private String grade ="";
    private Student student;
    public GradeTracker(Student studentToObserve) {
        studentToObserve.registerObserver(this);
        student = studentToObserve;
    }

    public void updateGrade(){
        if(student.getAverage() >= 90){
            grade = "A";
        }else if(student.getAverage() >= 80){
            grade = "B";
        }else if(student.getAverage() >= 60){
            grade = "C";
        }else if(student.getAverage() >= 40){
            grade = "D";
        }else if(student.getAverage() >= 20){
            grade = "F";
        }else {
            grade = ""+student.getAverage();
        }
    }

    public String getGrade() {

        return grade;
    }

}
