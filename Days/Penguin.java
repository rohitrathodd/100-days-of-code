public class Penguin extends Bird{
    public Penguin(String name){
        super(name);
    }

    @Override
    public void fly(){
        System.out.println("not very good at that, can i go for swim instead");
    }
}
