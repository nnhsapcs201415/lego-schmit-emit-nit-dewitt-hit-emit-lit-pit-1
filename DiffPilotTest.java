import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * Robot that stops if it hits something before it completes its travel.
 */
public class DiffPilotTest {
    DifferentialPilot pilot;
    TouchSensor bump = new TouchSensor(SensorPort.S1);

    public void go() {
        pilot.travel(20, true);
        while (pilot.isMoving()) {
            if (bump.isPressed()) pilot.stop();
        }
        System.out.println(" "+pilot.getMovement().getDistanceTraveled());
    }

    public static void main(String[] args) {
        DiffPilotTest traveler = new DiffPilotTest();
        //DifferentialPilot(float wheelDiameter, float trackWidth, Motor leftMotor, Motor rightMotor)
        traveler.pilot = new DifferentialPilot(2.25f, 5.5f, Motor.A, Motor.C);
        traveler.go();
    }
}