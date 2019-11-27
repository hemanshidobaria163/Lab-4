public class Question2 {

    public static void main(String[] args) {
        Student student1 = new Student("Daren");
        GradeTracker tracker1 = new GradeTracker(student1);
        student1.addAssignmentScore(70.0);
        System.out.println("Tracked Grade: "+ tracker1.getGrade());
        student1.addAssignmentScore(80.0);
        System.out.println("Tracked Grade: "+ tracker1.getGrade());
        student1.addAssignmentScore(90.0);
        System.out.println("Tracked Grade: "+ tracker1.getGrade());
        student1.addExamScore(75.0);
        System.out.println("Tracked Grade: "+ tracker1.getGrade());
        student1.addExamScore(85.0);
        System.out.println("Final tracked Grade: "+ tracker1.getGrade());
    }
}
