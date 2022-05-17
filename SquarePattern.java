import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();

        for (int i=1;i<=N;i++){
             for (int j  = 1;j<=N;j++){
                 System.out.print(N);
             }
             System.out.println();
         }

     /*   int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=n){
                System.out.print(n);
                j = j + 1;
            }
            System.out.println();
            i++;
        }*/
    }
    
}
