import java.util.Scanner;
public class Ar_avg{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int a[]= new int[4];
        int sum=0;
        
        for(int i=0;i<a.length;i++){
            System.out.print("Enter element: ");
            a[i]=sc.nextInt();
            sum+= a[i];
        }
        
        System.out.println("Avegrage of array is: "+(sum/4.0d));
    }
}