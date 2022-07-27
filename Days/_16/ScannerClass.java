package _16;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("put any one number or string");
        String name=scan.nextLine();
        int n;
        try{
             n = Integer.parseInt(name);
        }
        catch (NumberFormatException e){

        }

        System.out.println(name);
        System.out.println("enter more than 2 String or number with space: ");
        String[] arrString = scan.nextLine().split("s");
        System.out.println(Arrays.toString(arrString));
        System.out.println("entering into char array");



    }
}
