public class Question1 {

    public static void main(String[] args) {
        Student student1 = new Student("Daren");
        student1.addAssignmentScore(70.0);
        student1.addAssignmentScore(80.0);
        student1.addAssignmentScore(90.0);
        student1.addExamScore(75.0);
        student1.addExamScore(85.0);

        System.out.println("Weighted Average is: "+ student1.getAverage(new WeightedAverageStrategy()));
        System.out.println("Special Average is: "+ student1.getAverage(new SpecialAverageStrategy()));
        System.out.println("Weighted Average is: "+ student1.getAverage(new WeightedAverageStrategy()));

    }
}
