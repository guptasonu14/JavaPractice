import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();

        while(S<=E){
            int cel = 5*(S-32)/9;
            System.out.println(S+"\t"+cel);
            S = S+W;

        }

    }
    
}
