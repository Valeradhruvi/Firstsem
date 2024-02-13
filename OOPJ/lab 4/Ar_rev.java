import java.util.Scanner;
public class Ar_rev{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int a[]= new int[n];

        for(int i=0;i<a.length;i++){
            System.out.print("Enter Element: ");
            a[i]= sc.nextInt();
        }
        int rev=0;
        for(int i=a.length-1;i>=0;i--){
            
             System.out.print(" "+a[i]);
        }
       
    }
}