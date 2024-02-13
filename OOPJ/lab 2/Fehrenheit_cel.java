import java.util.Scanner;
public class Fehrenheit_cel{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter temperature in fehrenheit: ");
        double c= sc.nextDouble();
        if(c<0 || c==0){
            System.out.println("enter valid number")
        }
        else{
        double r= ((c-32)*5/9.0);
        System.out.println("Temperature in Celcius: "+r);
        }
    }
}