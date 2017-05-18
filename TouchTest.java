import lejos.nxt.*;

public class TouchTest {
    public static void main(String[] args) throws Exception {
        TouchSensor touch = new TouchSensor(SensorPort.S1);
        while(true) {
            while (touch.isPressed()) {
                Motor.A.forward();
            }
            Motor.A.stop();
        }
    }
}