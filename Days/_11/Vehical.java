public class Vehical {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;
    public Vehical(String name, String size) {
        this.name = name;
        this.size=size;

        this.currentVelocity=0;
        this.currentDirection=0;
    }

    public void steer(int direction){
        currentDirection=direction;
        System.out.println("vehical steering at"+currentVelocity+"degree");

    }

    public void move(int velocity, int direction){
        currentVelocity=velocity;
        currentDirection=direction;

        System.out.println("vehical.move(): moving at"+currentVelocity+
                "in direction"+currentDirection);
    }

    public void stop(){
        this.currentVelocity=0;
    }
    public String getName(){
        return name;

    }

    public String getSize(){
        return size;

    }
}
