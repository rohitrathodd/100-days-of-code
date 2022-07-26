package _15;

  class OuterClass{
    private int outerclass_int =89;
    private static int outerStaticInt=33;


    static class InnerClass{
        private int innerClass_int =44;
        private static int innerStaticInt=55;

        public  void sayHello(){
            System.out.println("Hello in innerclass:");
        }

        public int getInnerClass_int(){
            return innerClass_int;
        }

        public static int getInnerStaticInt(){
            return innerStaticInt;
        }

        public int getOuterInt(){
            System.out.println("only static member from outer is fetched in inner");
            return outerStaticInt;
        }
    }

    public static int getOuterStaticInt(){
        return outerStaticInt;
    }

    public int getOuterclass_int(){
        return outerclass_int;
    }

    public void sayHello(){
        System.out.println("hello in outerclass");
    }

}

class OuterClass2{

      private int outerint =99;
      private static int outerStaticInt =83;

    class InnerClass{
        private int innerInt=38;

        public int getInnerInt(){
            return innerInt;
        }

        public int getouterInt(){
            System.out.println("outer int can be accessed cause inner class is not a static:");
            return outerint;
        }

        public int getOuterStaticInt(){
            return outerStaticInt;
        }

    }

    public static int getOuterStaticInt(){
        return outerStaticInt;
    }

    public int getOuterint(){
        return outerint;
    }

    public InnerClass createInnerClass(){
        return new InnerClass();
    }
}

public class NestedClassExample {

     private int num=90;

     public static void main(String[] args){


         OuterClass outerclass = new OuterClass();
         OuterClass.InnerClass innerClass = new OuterClass.InnerClass();



         System.out.println("outerclass.getOuterclass_int()"+outerclass.getOuterclass_int());

         System.out.println("outerclass.getOuterStaticInt()"+outerclass.getOuterStaticInt());

         System.out.println("capital OuterClass.getOuterStaticInt()"+OuterClass.getOuterStaticInt());

         System.out.println("capital OuterClass.InnerClass.getInnerStaticInt()"+OuterClass.InnerClass.getInnerStaticInt());

         System.out.println("Creating inner object innerClass.getInnerClass_int()"+innerClass.getInnerClass_int());

         System.out.println("innerClass.getOuterInt()"+innerClass.getOuterInt());
         System.out.println("innerClass.getInnerStaticInt()"+innerClass.getInnerStaticInt());
         System.out.println();

         OuterClass2 outerClass2 = new OuterClass2();

         System.out.println("Capital OuterClass2.getOuterStaticInt()"+OuterClass2.getOuterStaticInt());
         System.out.println("small outerClass2.getOuterint()"+outerClass2.getOuterint());
         System.out.println("outerClass2.createInnerClass().getInnerInt()"+outerClass2.createInnerClass().getInnerInt());

     }
}
