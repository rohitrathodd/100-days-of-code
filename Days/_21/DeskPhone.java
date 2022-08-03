package _21;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    @Override
    public void powerOn() {
        System.out.println("no action take, desk phone not have power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing "+ phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("answerring phone");
            isRinging=false;
        }
    }

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public boolean callPhone(int phoneNumber) {

        if(phoneNumber==myNumber){
            isRinging=true;
            System.out.println("ring ring");
        }else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
