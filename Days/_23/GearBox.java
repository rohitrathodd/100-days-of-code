package _23;

import java.util.ArrayList;

public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int gearNumber=0;

    public GearBox(int maxGears){
        this.maxGears=maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public void addGears(int gearNumber,double ratio){

        if(gearNumber>0&& gearNumber<=maxGears){
            gears.add(new Gear(gearNumber,ratio));
        }
    }

    public void changeGear(int gearNumber){

        if(gearNumber>=0 && gearNumber<maxGears){

            this.gearNumber = gearNumber;
        }
    }

    private class Gear{

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio){
            this.gearNumber=gearNumber;
            this.ratio=ratio;

        }

        public double driveSpeed(int revs){
            return revs *(this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }





}

