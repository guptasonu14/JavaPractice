import java.util.Scanner;
import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n,t1=1,t2=1,nextTerm=0;
        n = sc.nextInt();

        if(n==0)
        System.out.print(n);
        else
        nextTerm=t1+t2;
        for (int i = 3; i <= n; i++) {
			
			t1 = t2;
			
			t2 = nextTerm;
			
			nextTerm = t1 + t2;
		}
		System.out.println(t2);
	} 	 

    }
    

