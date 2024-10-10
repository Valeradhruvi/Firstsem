import java.util.Scanner;
public class Calculation_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int m = sc.nextInt();

        System.out.println("Enter second number: ");
        int n = sc.nextInt();

        int sum=0;
        if(m<n){
            for(int i=m;i<=n;i++){
                sum = sum+i;
            }
        }
        else if(m>n){
            for(int i=n;i<=m;i++){
                sum = sum+i;
            }
        }
        else{
            System.out.println("Invalid input");
        }
        System.out.println(sum);
        sc.close();
    }

}
