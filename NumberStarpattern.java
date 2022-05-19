import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class NumberStarpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
		  
        for(int i=1;i<=n;i++){
            
        for(int j=n;j>=1;j--){ 
            
            if(j!=i)  
             System.out.print(j);  
             else  
              System.out.print("*"); 
            
       }  
       System.out.println("");
       
        }
    }
    
}
