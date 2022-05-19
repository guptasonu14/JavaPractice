import java.util.Scanner;

public class Binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int p=0;
         int i=0;

         while(n!=0){
            p += (n % 10) * Math.pow(2, i);
            
            n = n /10;
            
            i++;  
            
             
         }
         System.out.println(p);
    }
    
}
