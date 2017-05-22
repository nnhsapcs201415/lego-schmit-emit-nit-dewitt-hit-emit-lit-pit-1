import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;

public class LineFollow{
    public static void main(String[] args) throws InterruptedException {
        LightSensor right = new LightSensor(SensorPort.S1);
        DifferentialPilot pilot = new DifferentialPilot(56,20.5,Motor.A,Motor.B);
        
        pilot.setTravelSpeed(150);
        Thread.sleep(500);
        
        while(true){
           pilot.steer((right.getNormalizedLightValue()-400)*.5);
           System.out.println(right.getNormalizedLightValue());
           if(Button.ENTER.isPressed()){
               break;
            }
        }
    }
    
}