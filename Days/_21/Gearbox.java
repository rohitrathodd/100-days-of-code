package _21;

public class Gearbox {

    private boolean clutchIsIn;

    public Gearbox(boolean inOrOut){
        this.clutchIsIn= inOrOut;
    }

    public static void main(String[] args){
        ITelephone timsPhone ;

        timsPhone = new DeskPhone(12345678);
        timsPhone.powerOn();
        timsPhone.callPhone(12345678);
        timsPhone.answer();

        timsPhone = new MobilePhone(256456);
    }
}
