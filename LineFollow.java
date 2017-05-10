import lejos.nxt.*;

public class LineFollow{
    public static void main(String[] args){
        ColorSensor c = new ColorSensor(SensorPort.S1,1);
        System.out.println(c.isFloodlightOn());
        while (true){
           
            LCD.drawInt(c.getLightValue(),0,3);
        }
    }
}