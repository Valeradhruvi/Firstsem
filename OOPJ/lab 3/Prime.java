import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int count=0;
        if(n==0||n==1){  
            System.out.println("Not prime number");      
        }
        else{
        for (int i = 2; i <= n/2 ; i++) {
            if (n % i == 0) {
                count=1;
                break;
                }
            }
        
        if (count==0) {
            System.out.println("Prime Number.");
        }
        else{
            System.out.println("Not a Prime Number.");
        }
    }
    }
}