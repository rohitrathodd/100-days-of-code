package _22;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Player tim = new Player("tim",10,15);

        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);

        tim.setWeapon("storbringer");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);

    }

    public static ArrayList<String> readValues(){

        ArrayList<String> values = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        boolean quit = false;
        System.out.println("choose \n 1 to enter a string \n 0 to quit:");
        while(!quit){
            System.out.println("choose an option:");
            int choice = scan.nextInt();

            switch(choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("enter String:");
                    values.add(scan.nextLine());
                    break;
            }

        }


        return values;

    }

    public static void saveObject(ISaveable objectToSave){

        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("saving"+objectToSave.write().get(i)+" to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values= readValues();

        objectToLoad.read(values);
    }

}
