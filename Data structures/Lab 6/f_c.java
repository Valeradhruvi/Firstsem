import java.util.Scanner;
class temperature_conversion{
    double c1;
    double c2;
    double f1;
    double f2;

    public void ctof(double c1){
        f2 = c1*(9/5)+32;
        System.out.println(f1);
    }
    public void ftoc(double f1){
        c2 = (f1-32)*(5/9);
        System.out.println(c2);
    }
}

public class f_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter C for celcius else Enter F for fahrenhiet");
        String ch = sc.next();
        String newch = ch.toUpperCase();

        if(newch=="C"){
            System.out.println("Enter Cencius");
            int temp = sc.nextInt();
            temperature_conversion newTemp = new temperature_conversion();
            newTemp.ctof(temp);
        }
        else if(newch=="F"){
            System.out.println("Enter fahrenheit: ");
            int temp = sc.nextInt();
            temperature_conversion newTemp = new temperature_conversion();
            newTemp.ftoc(temp);
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
    
}
