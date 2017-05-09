import lejos.nxt.Button;
import lejos.nxt.Sound;
import lejos.nxt.Motor;
import lejos.nxt.LCD;
import lejos.util.Delay;

/**
 * Write a description of class HelloWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelloWorld
{
    public static void main(String[] args) throws InterruptedException
    {
        /*
         * To delay stuff / wait for x seconds
         *   Delay.msDelay(x milliseconds)
         * Set speed of motor
         *   Motor.A.setSpeed(speed);
         */
        for (int a = 0; a < 5; a++)
        {
            Sound.playTone(2000, 1);
            Thread.sleep(1000);
        }
        Motor.A.setSpeed(720);
        Motor.A.forward();
        LCD.clear();
        Delay.msDelay(2000);
        LCD.drawInt(Motor.A.getTachoCount(),0,0);
        Motor.A.stop();
        LCD.drawInt(Motor.A.getTachoCount(),0,1);
        Motor.A.backward();
        while (Motor.A.getTachoCount()>0); 
        LCD.drawInt(Motor.A.getTachoCount(),0,2);           
        Motor.A.stop();
        LCD.drawInt(Motor.A.getTachoCount(),0,3);
        Button.waitForAnyPress();
    }
}
