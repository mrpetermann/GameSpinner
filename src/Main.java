public class Main {
    public static void main(String[] a) {
        GameSpinner spinner = new GameSpinner(4);
        System.out.println(spinner.spin());
        System.out.println(spinner.spin());
        System.out.println(spinner.spin());
        System.out.println("Spins: " + spinner.currentRun());
    }
}
