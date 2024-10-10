import java.util.Scanner;
public class Swap {
    static int a=1,b=2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        swap1 sw = new swap1();
        sw.swapNumber(n1, n2);
        sc.close();
    }
}
 class swap1 {
     
    public void swapNumber(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    
}


