import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        for(int i=2;i<=n;i++){
            isPrime = true;

            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                }
            }
            if(isPrime)
            System.out.println(i);
        }
    }
    
}
