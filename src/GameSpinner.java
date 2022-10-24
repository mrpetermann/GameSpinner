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
        
        if (spin == this.lastSpin)
            this.currentRun++;
        else
            this.currentRun = 1;

        this.lastSpin = spin;

        return spin;
    }

    public int currentRun() {
        return this.currentRun;
    }
}
