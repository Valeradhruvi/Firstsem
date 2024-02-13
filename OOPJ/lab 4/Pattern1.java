import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.next();
    
        char[] ch = str.toCharArray();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(ch[j]);
            }
            System.out.println();
        }
    }
}
