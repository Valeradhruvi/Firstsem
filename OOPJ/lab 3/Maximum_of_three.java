import java.util.Scanner;
public class Maximum_of_three{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter n1: ");
          int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
          int n2 = sc.nextInt();
        System.out.println("Enter n3: ");
          int n3 = sc.nextInt();

        if(n1>n2){
            if(n1>n3){
                System.out.println("N1 is Greater");
            }
            else{
                System.out.println("N3 is Greater");
            }
        }
        else{
            if(n2>n3){
                System.out.println("N2 is Greater");
            }
            else{
                System.out.println("N3 is Greater");
            }
        }
    }
}