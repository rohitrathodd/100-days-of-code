package _12;

import java.awt.*;

public class Composition {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,30,5);
        Case theCase = new Case("220B","Dell","240",dimensions);
        Monitor theMonitor= new Monitor("27inch beast","Acer",27,new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("bj-200","asus",4,5,"v2.33");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);

        thePC.getMonitor().drawPixelAt(8,3,"red");

        thePC.getMotherboard().loadProgram("windows 11 home");

        


    }
}
