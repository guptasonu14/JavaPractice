import java.util.Scanner;
public class CharCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char c = a.charAt(0);
        if (c>=65 && c<=96)
        {
            System.out.println("1");
        }
        else if(c>=97 && c<=123)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("-1");
        }
    }
    
}
