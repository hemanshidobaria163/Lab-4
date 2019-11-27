import java.util.ArrayList;
import java.util.List;


public class Student {

    private String studentName;
    private List<Double> assignmentScores = new ArrayList<>();
    private List<Double> examScores = new ArrayList<>();
    private GradeTracker observer;

    public Student(String name) {
        this.studentName = name;
    }

    public void addAssignmentScore(Double score){
        assignmentScores.add(score);
        observer.updateGrade();
    }

    public void addExamScore(Double score){
        examScores.add(score);
        observer.updateGrade();
    }

    public double getAverage(AverageCalculationStrategy averageCalculations){
        return averageCalculations.average(assignmentScores, examScores);
    }

    public double getAverage(){
        return new WeightedAverageStrategy().average(assignmentScores, examScores);
    }

    public void registerObserver(GradeTracker observer){
        this.observer = observer;
    }

}
