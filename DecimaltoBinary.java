import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		
		long rem;
		
		long binary = 0;
		
		long i = 1;
		
		while (n != 0) {
			
            rem = n % 2;
            
            n = n / 2;
            
            binary = binary + (rem * i);
            
            i = i * 10;
        }
        
		System.out.print(binary);

    }
    
}
