
import java.util.*;
public class num_rectangular {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
       int c = read.nextInt();
       for (int i=1; i<=r; i++) {
           for (int j=1; j<=c; j++) {
               if ((i+j)%2==0) {
                System.out.print(1);
               }
                else{
                    System.out.print(2);

                }
            }
           System.out.println();

       }
    }
}
