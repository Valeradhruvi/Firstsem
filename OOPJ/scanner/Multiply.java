//to multiply two numbers by user imput
import java.util.Scanner;
public class Multiply{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter number 1: ");
       int a =sc.nextInt();
       System.out.println("Enter number 2: ");
       int b =sc.nextInt();
       int sum= a*b;
       System.out.print("Multiplication is: "+sum);
       
    }
}