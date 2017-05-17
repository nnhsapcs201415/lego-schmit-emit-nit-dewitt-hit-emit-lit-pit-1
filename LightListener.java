import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SensorPortListener;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.Motor;

public class LightListener implements SensorPortListener {
    DifferentialPilot pilot;
    public void stateChanged(SensorPort port, int oldValue, int newValue) {
        int sPort = port.getId() + 1;
        System.out.println(sPort + " " + oldValue + " " + newValue);
        while (true){}
    }

    public static void main(String[] args) throws Exception {
        Robot tester = new Robot();
        SensorPort.S1.addSensorPortListener(tester);
    }
}