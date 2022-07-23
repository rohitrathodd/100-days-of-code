package _13.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Player player= new Player("rohit",59,"sword");

        System.out.println("intial health is"+player.getHealth());

        Printer printer = new Printer(50,true);

        System.out.println("intial page count"+printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);

        System.out.println("pages printed was" + pagesPrinted+" new total print count for printer ="+printer.getPagesPrinted());

    }
}
