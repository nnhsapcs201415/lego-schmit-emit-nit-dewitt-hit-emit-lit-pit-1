import lejos.nxt.*;
import lejos.util.Delay;

public class SonicTest {
    public static void main(String[] args) throws Exception {
        UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S4);

        while (true) {
            System.out.println(sonic.getDistance());
        }
    }
}