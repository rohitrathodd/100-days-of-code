package _16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list.add(56);
        list.add(45);

        for(int i=0;i<8;i++){
            list.add(i*i);
        }
        System.out.println(Arrays.toString(list.toArray()));
        list2.addAll(list);
        list.add(4,55);
        System.out.println(Arrays.toString(list.toArray()));
        list.set(4,78);
        System.out.println(Arrays.toString(list.toArray()));
        list.remove(list.get(8));
        System.out.println(Arrays.toString(list.toArray()));
        list.remove(list.indexOf(78));
        System.out.println(Arrays.toString(list.toArray()));

        StringBuilder name = new StringBuilder();
        name.append("rohit");
        name.append("rathod");

        System.out.println(name);
        char[] hello = new char[6];
        name.getChars(0,5,hello,1);
        System.out.println(name);
        System.out.println(hello);

        name.append(8);
        System.out.println(name);
        name.replace(2,8,"t");
        System.out.println(name);

        String n = "b";
        char helo = 't';
        String h= new String("a");
        if(n.charAt(0)==h.charAt(0)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
        int value = n.indexOf('h');
        System.out.println("index :"+value);
        int comparison = n.compareTo(h);
        System.out.println("cmparison:"+comparison);
        System.out.println((int)helo);
        System.out.println((int)n.charAt(0));
        System.out.println(Arrays.toString(n.toCharArray()));
        System.out.println(String.valueOf(8));

        System.out.println(list.toString());
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.toArray());
        System.out.println(list);

        Iterator<Integer> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}

