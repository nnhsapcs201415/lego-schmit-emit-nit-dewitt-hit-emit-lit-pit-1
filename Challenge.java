import lejos.nxt.*;
import lejos.robotics.*;
import lejos.util.Delay;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SensorPortListener;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.Motor;
public class Challenge{
    LightSensor sensorRight = new LightSensor(SensorPort.S1);
    LightSensor sensorLeft = new LightSensor(SensorPort.S2);
    DifferentialPilot pilot = new DifferentialPilot(56,20.5,Motor.A,Motor.B);

    public void hitLine(int port){
        pilot.backward();
        Delay.msDelay(200);
        pilot.rotate(Math.random()*180);
        
    }
    public class LightSensorListener implements SensorPortListener{
        public void stateChanged(SensorPort port, int old, int young){
            if(port.readRawValue()<400){
                hitLine(port.getId());
            }
            
        }

    }
}