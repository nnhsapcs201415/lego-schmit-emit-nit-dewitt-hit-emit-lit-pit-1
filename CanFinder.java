import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;

/**
 * Write a description of class CanFinder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CanFinder extends Thread
{
    private Thread t;
    public void run()
    {
        LightSensor sensorRight = new LightSensor(SensorPort.S1);
        LightSensor sensorLeft = new LightSensor(SensorPort.S2);
        DifferentialPilot pilot = new DifferentialPilot(56,20.5,Motor.A,Motor.B);
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S4);
        int state = 1;
        int amtRotated = 0;
        int boxcount = 0;
        boolean justBack = false;
        us.continuous();
        while(!Button.ESCAPE.isPressed())
        {
            if (state == 1)
            {
                if (us.getDistance() <= 30) {
                    pilot.rotate(100);
                } else {
                    pilot.rotate(200);
                    pilot.forward();
                    Delay.msDelay(1000);
                    pilot.stop();
                    state++;
                }
            }
            if (state == 2)
            {
                // UNDER IS BLACK OVER IS WHITE
                if(sensorRight.readValue() < 30 || sensorLeft.readValue() < 30){
                    if (justBack) {
                        pilot.forward();
                        Delay.msDelay(1000);
                        pilot.rotate(50);
                    } else {
                        pilot.backward();
                        Delay.msDelay(500);
                        pilot.rotate(400);
                        justBack = true;
                    }
                } else {
                    justBack = false;
                    if (boxcount > 60) {
                        pilot.backward();
                        Delay.msDelay(1000);
                        pilot.rotate(800);
                        boxcount = 0;
                        justBack = true;
                    }
                    if (us.getDistance() <= 100){
                        pilot.forward();
                        boxcount++;
                        System.out.println(boxcount);
                    }
                    else{
                        boxcount = 0;
                        pilot.rotate(50);
                        amtRotated+=50;
                    }
                    if(amtRotated >= 800){
                        pilot.forward();
                        Delay.msDelay(400);
                        amtRotated = 0;
                    }
                }
            }
        }
    }

    public void start () {
        System.out.println("Starting music");
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}

