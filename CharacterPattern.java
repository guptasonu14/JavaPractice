import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1;i<n;i++){
            for (int j = 1;j<=i;j++){
                char ch = (char)('A'+i-1);
                System.out.print((char)(ch+j-1));
            }
            System.out.println();
        }

    }
    
}
