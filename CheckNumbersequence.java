import java.util.Scanner;

public class CheckNumbersequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		
		int prev = sc.nextInt();
		
		int cnt = 1;
		
		boolean goingUp = false;
		
		boolean isValid = true;
		
		while(cnt <= n-1) {
			
			int curr = sc.nextInt();
			
			 int diff = curr - prev;
	          
	        if(diff == 0){  
                
	            isValid = false;
                
	        }else if(diff > 0){ 
                
	            goingUp = true;
                
	        }else if(goingUp && diff < 0){
	          
	            isValid = false;
	        }

	        prev = curr;
	        
	         cnt++;

	    }

	    System.out.println(isValid);
    }
    
}
