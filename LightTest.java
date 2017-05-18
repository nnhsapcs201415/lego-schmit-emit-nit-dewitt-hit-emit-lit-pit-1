import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SensorPortListener;

public class LightTest implements SensorPortListener {
    public void stateChanged(SensorPort port, int oldValue, int newValue) {
        int sPort = port.getId() + 1;
        if (sPort == 1) {
            // LIGHT LEFT
        } else if (sPort == 2) {
            // LIGHT RIGHT
        } else if (sPort == 3) {
            // ULTRASONIC
        } else if (sPort == 4) {
        }
    }

    public static void main(String[] args) throws Exception {
        LightTest tester = new LightTest();
        SensorPort.S1.addSensorPortListener(tester);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
    }
}