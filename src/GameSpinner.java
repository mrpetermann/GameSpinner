public class GameSpinner {
    private final int sectors;
    private int currentRun;
    private int lastSpin;

    public GameSpinner(int sectors) {
        this.sectors = sectors;
        this.currentRun = 0;
        this.lastSpin = 0;
    }

    public int spin() {
        int spin = (int)(Math.random()*this.sectors) + 1;
        /*
        if (spin == lastSpin)
            currentRun++;
        else
            currentRun = 1;
         **/
        currentRun = (spin == lastSpin) ? currentRun + 1 : 1;

        lastSpin = spin; //!!!!

        return spin;
    }

    public int currentRun() {
        return this.currentRun;
    }
}