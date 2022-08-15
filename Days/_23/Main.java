package _23;
import java.util.Scanner;

class Computer{
    public void onClick(String title){
        System.out.println(title);
    }
}

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static Button btnPrint = new Button("print");

    public static void main(String[] args){

//        GearBox mcLaren = new GearBox(6);
//        mcLaren.addGears(1,5.3);
//        mcLaren.addGears(2,10.6);
//        mcLaren.addGears(3,15.9);
//
//        mcLaren.changeGear(1);
//


        class ClickListener implements Button.OnClickListener{

            public ClickListener(){
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title+"was clicked");
            }
        }

        Computer how = new Computer(){
            @Override
            public void onClick(String title){
                System.out.println(title+" is good");
            }
            public void print(){
                System.out.println("inside print methodin compurter");
            }
        };

        Computer what = new Computer();

        how.onClick("how");
        what.onClick("what");

        btnPrint.setOnClickListener(new ClickListener());


    }
}
