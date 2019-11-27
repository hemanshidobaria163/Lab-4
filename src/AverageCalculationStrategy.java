import java.util.List;


public interface AverageCalculationStrategy {

    public double average(
        List<Double> assignmentScores,
        List<Double> examScores);
}
