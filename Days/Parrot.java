public class Parrot extends Bird{

    public Parrot(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");
    }

}
