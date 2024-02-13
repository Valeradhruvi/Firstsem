import java.util.Scanner;
public class Area_circle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number radius: ");
        double a= sc.nextDouble();
        double c;
        c=(a*a)*3.14;
        System.out.println("Area of Circle is: "+c);
    }
}