package _11;
public class Car extends Vehical{
    private int doors;
    private int wheels;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name,String size, int wheels, int doors, int gears, boolean isManual){
        super(name,size);
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.currentGear=1;
    }

    public void changeGear(int currentGear){
        this.currentGear=currentGear;

    }

    public void changeVelocity(int speed, int direction){
        move(speed,direction);

        System.out.println("car.changeVelocity()");
    }


}
