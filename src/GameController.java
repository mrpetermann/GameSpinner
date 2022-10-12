public class GameController {
    public static void main(String[] a) {
        GameSpinner spinner = new GameSpinner(4);
        System.out.println("Current Run: " + spinner.currentRun());
        System.out.println("Spin: " + spinner.spin());
        System.out.println("Current Run: " + spinner.currentRun());
        System.out.println("Spin: " + spinner.spin());
        System.out.println("Current Run: " + spinner.currentRun());
        System.out.println("Spin: " + spinner.spin());
        System.out.println("Current Run: " + spinner.currentRun());
    }
}
