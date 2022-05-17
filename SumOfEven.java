import java.util.Scanner;
public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<N){
            if(i%2==0){
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);

    }
    
}
