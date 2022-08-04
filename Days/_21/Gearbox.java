package _21;

public class Gearbox {

    private boolean clutchIsIn;

    public Gearbox(boolean inOrOut){
        this.clutchIsIn= inOrOut;
    }

    public static void main(String[] args){
        DeskPhone timsPhone  = new DeskPhone(12345678);
        timsPhone.powerOn();
        timsPhone.callPhone(12345678);
        timsPhone.answer();
        timsPhone.print();
        MobilePhone RohitsPhone = new MobilePhone(256456);

        System.out.println(RohitsPhone);
        System.out.println(timsPhone);
        printTelephone(RohitsPhone); // this is possible because rohitsphone is implements Itelephone. rohitsphone has an interface of itelephone
        printTelephone(timsPhone);

        ITelephone telephone = new MobilePhone(125);


    }

    public static void printTelephone(ITelephone telephone){

        System.out.println(telephone);
    }

    public static void printMobilephone(MobilePhone mobilePhone){
        mobilePhone.calculator(1,2);
        mobilePhone.toString();

    }

    public static void printDeskPhone(DeskPhone deskPhone){
        deskPhone.print();
        deskPhone.toString();
    }
}



