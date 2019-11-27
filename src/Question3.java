public class Question3 {

    public static void main(String[] args) {
        Student student1 = new Student("Daren");
        GradeTracker tracker1 = new GradeTracker(student1);
        student1.addAssignmentScore(70.0);
        student1.addAssignmentScore(80.0);
        student1.addAssignmentScore(90.0);
        student1.addExamScore(75.0);
        student1.addExamScore(85.0);

        Student student2 = new Student("Mike");
        GradeTracker tracker2 = new GradeTracker(student2);
        student2.addAssignmentScore(77.0);
        student2.addAssignmentScore(83.0);
        student2.addAssignmentScore(91.0);
        student2.addExamScore(79.0);
        student2.addExamScore(95.0);

        Roster roster = new Roster("SE",1234);
        roster.addStudent(student1);
        roster.addStudent(student2);

        AverageDispenserProxy proxy1 = new AverageDispenserProxy(roster);
        AverageDispenserProxy proxy2 = new AverageDispenserProxy(roster);

        System.out.println("Average from client-1, student-1: "+ proxy1.getNextStudentAverage());
        System.out.println("Average from client-2, student-1: "+ proxy2.getNextStudentAverage());
        System.out.println("Average from client-2, student-2: "+ proxy2.getNextStudentAverage());
        System.out.println("Average from client-1, student-2: "+ proxy1.getNextStudentAverage());

    }
}
