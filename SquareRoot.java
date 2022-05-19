import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n==0){
            System.out.println("0");
            return;
        }
		
		System.out.println(squareRoot(n));
		
	}
		
		public static int squareRoot(int n)   
	    {  
	         
	        int temp = 1;  
	        
	        int sqrtroot=n/2; 
	        
	        do   
	        {  
	            temp=sqrtroot; 
	            
	            sqrtroot=(temp+(n/temp))/2; 
	            
	        }   
	        while((temp-sqrtroot)!= 0);  
	        
	        return sqrtroot;  
    }
    
}
