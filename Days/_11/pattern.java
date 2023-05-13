package _11;

public class pattern {

    public static void main(String[] args) {
        int n=3;
        for(int i=3;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=3;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
