public class AverageDispenserProxy {

    private Roster roster;
    private int currentIndex = 0;

    public AverageDispenserProxy(Roster roster) {
        this.roster = roster;
    }

    public double getNextStudentAverage(){
        return roster.getStudentAverage(currentIndex++);
    }
}
