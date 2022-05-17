
import java.util.Scanner;
public class NumPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


      /*  int i = 1;
        while (i<=N){
            int j = 1;
            int val = i;
            while (j<=i){
                System.out.print(val);
                val = val+1;
                j = j+1;
            }
            System.out.println();
            i = i+1;
        } */

      /*  for (int i=1;i<=N;i++){
            for (int j=1;j<=i;++j){
                System.out.print(k+j);

            }
            System.out.println();
        }*/


        for(int i =1;i<=N;i--){
            System.out.print(i);


        }
        System.out.println();
    }
    
}
