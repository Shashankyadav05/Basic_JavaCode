import java.util.*;
public class simple_rec {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
       int c = read.nextInt();
       for (int i=1; i<=r; i++) {
           for (int j=1; j<=c; j++) {
               System.out.print(j);
           }
           System.out.println();


       }
    }
}
