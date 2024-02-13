import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose appripriate operation(i.e +,-,*,/): ");
        char op = sc.next().charAt(0);
        System.out.println("Enter number 1: ");
        int a= sc.nextInt();
        System.out.println("Enter number 2: ");
        int b= sc.nextInt();
        int c;
        switch(op){
            case ('+'): {c=a+b;
                    System.out.println("Addition: "+c);
                    break;
                }
            case ('-'): { c=a-b;
                    System.out.println("Substraction: "+c);
                    break;
            }
            case ('*'): { c=a*b;
                    System.out.println("Multiplication: "+c);
                    break;
            }
            case ('/'): { c=a/b;
                    System.out.println("Division: "+c);
                    break;
            }
            default: {
                System.out.println("Enter valid operation");
            }
        }
    }
}