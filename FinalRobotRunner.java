public class FinalRobotRunner {
    public static void main(String[] args)
    {
        CanFinder runner = new CanFinder();
        runner.setDaemon(true);
        runner.start();
        FinalRobotMusic music = new FinalRobotMusic();
        music.setDaemon(true);
        music.start();
    }
}