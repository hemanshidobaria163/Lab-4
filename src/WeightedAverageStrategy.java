import java.util.List;


public class WeightedAverageStrategy implements AverageCalculationStrategy {
    @Override
    public double average(
        List<Double> assignmentScores,
        List<Double> examScores) {

        return (assignmentScores.stream()
            .mapToDouble(i -> i)
            .average()
            .orElse(0) * 0.4
            +
            examScores.stream()
            .mapToDouble(i -> i)
            .average()
            .orElse(0) * 0.6);
    }
}
