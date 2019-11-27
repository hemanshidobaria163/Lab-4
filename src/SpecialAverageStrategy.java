import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class SpecialAverageStrategy implements AverageCalculationStrategy {
    @Override
    public double average(
        List<Double> assignmentScores,
        List<Double> examScores) {

        List<Double> modifiedAssignmentScores = new ArrayList<>(assignmentScores);
        if(modifiedAssignmentScores.size() > 1){
            modifiedAssignmentScores.sort(Comparator.naturalOrder());
            modifiedAssignmentScores.remove(0);
        }

        return (modifiedAssignmentScores.stream()
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
