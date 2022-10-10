public class GameSpinner {
    private final int sectors;
    private int numberOfRuns;

    public GameSpinner(int sectors) {
        this.sectors = sectors;
        this.numberOfRuns = 0;
    }

    public int spin() {
        this.numberOfRuns++;
        return (int)(Math.random()*this.sectors) + 1;
    }

    public int currentRun() {
        return  this.numberOfRuns;
    }
}