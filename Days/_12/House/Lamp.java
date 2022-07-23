package _12.House;

public class Lamp {
    private String style;
    private boolean battery;
    private int golbRating;

    public void turnOn(){
        System.out.println("turn on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGolbRating() {
        return golbRating;
    }

    public Lamp(String style, boolean battery, int golbRating) {
        this.style = style;
        this.battery = battery;
        this.golbRating = golbRating;
    }
}
