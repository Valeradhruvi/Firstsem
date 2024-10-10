import java.util.Scanner;
public class Average_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        int avg = sum/n;
        System.out.println("Average is: "+avg);
        sc.close();
    }
}
