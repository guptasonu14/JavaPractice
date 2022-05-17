import java.util.Scanner;
public class NumPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int space =1;
            while(space<=n-1){
                System.out.print(".");
                space++;
            }
            int j=1;
            int val =i;
            while(j<=i){
                System.out.print(val);
                val++;
                j++;
            }
            System.out.println();
            i++;
        }


    }
    
}
