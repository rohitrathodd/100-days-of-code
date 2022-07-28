package _16;
import java.awt.geom.Line2D;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList2 {
    public static void main(String[] args){
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInorder(placesToVisit,"ratlam");
        addInorder(placesToVisit,"mumbai");

        printList(placesToVisit);
        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){

        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("now visiting " + i.next());
        }
        System.out.println("=============");
    }

    private static boolean addInorder(LinkedList<String> linkedlistobj, String city){

        ListIterator<String> listIterator = linkedlistobj.listIterator();

        while(listIterator.hasNext()){

            int comparison = listIterator.next().compareTo(city);
            if(comparison==0){
                System.out.println("city is already visited");
                return false;
            }else if(comparison>0){
                listIterator.previous();
                listIterator.add(city);
                return true;
            }
        }
        listIterator.add(city);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("no cities");
        }else{
            System.out.println("now visiting "+listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scan.nextInt();

            scan.nextLine();
            switch(action){
                case 0:
                    System.out.println("holiday over");
                    quit=true;
                    break;

                case 1:
                    if(listIterator.hasNext()){
                        System.out.println("now visiting:"+listIterator.next());
                    }
                    else{
                        System.out.println("reached at last");
                    }
                    break;

                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("now visiting"+ listIterator.previous());
                    }else{
                        System.out.println("we are at the start of list");
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }




    private static void printMenu(){
        System.out.println("Available actions:");
        System.out.println("0 quit \n"+"1 go to next \n 2 2 go to previous \n 3 print menu:");
    }





}
