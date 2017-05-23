import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SensorPortListener;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.Motor;
import lejos.nxt.Button;

public class Robot implements SensorPortListener {
    DifferentialPilot pilot;
    public void stateChanged(SensorPort port, int oldValue, int newValue) {
        int sPort = port.getId() + 1;
        if (sPort == 1) {
            // LIGHT LEFT
            if (oldValue > 780) {
                //BLACKNESS
            }
        } else if (sPort == 2) {
            // LIGHT RIGHT
            if (oldValue > 780) {
                //BLACKNESS
            }
        } else if (sPort == 3) {
            // ULTRASONIC
        } else if (sPort == 4) {
        }
        System.out.println(sPort + " " + oldValue + " " + newValue);
    }

    public static void main(String[] args) throws Exception {
        Robot tester = new Robot();
        SensorPort.S1.addSensorPortListener(tester);
        tester.pilot = new DifferentialPilot(56,20.5,Motor.A, Motor.B);
        tester.pilot.setTravelSpeed(1000);
        tester.pilot.forward();
        tester.go();
    }

    public void go() {

    }
}