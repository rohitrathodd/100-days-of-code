package _14;

import java.util.ArrayList;

class IntClass{
    private int myvalue;

    public IntClass(int myvalue) {
        this.myvalue = myvalue;
    }

    public int getMyvalue() {
        return myvalue;
    }

    public void setMyvalue(int myvalue) {
        this.myvalue = myvalue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray= new int[10];
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("rohit");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(89));

        ArrayList<Integer> intArrayList = new ArrayList<>();

        Integer integer = new Integer(56);
        Double doublevalue = new Double(12.33);

        ArrayList<Integer> integerArrayList=new ArrayList<>();

        for( int i=0;i<=10;i++){integerArrayList.add(Integer.valueOf(i*44));
        }

        for(int i=0;i<=10;i++){
            System.out.println(i+" -->"+integerArrayList.get(i));
        }

        Integer myIntvalue=56;
        // this is equal to
        Integer.valueOf(90);
        Integer hello = Integer.valueOf(88);
        System.out.println(hello);
        System.out.println(hello.intValue());
        hello=hello.valueOf(myIntvalue);
        System.out.println(hello);
        System.out.println(hello.intValue());

    }
}
