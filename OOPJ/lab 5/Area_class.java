import java.util.Scanner;

public class Area_class{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Area a1 = new Area();
        System.out.println("Enter Radius: ");
        int radius = sc.nextInt();

        double ans1= a1.circle(radius);
        System.out.println(ans1);

        System.out.println("Enter Length: ");
        int length = sc.nextInt();
        
         System.out.println("Enter Breadth: ");
        int breadth = sc.nextInt();
        
        double ans2 = a1.rectangle(length , breadth);
        System.out.println(ans2);

    }
}
class Area{

    double circle(int r);{
        return  Math.PI*r*r;
    }
    double rectangle(int h, int w);{
        return h*w;
    }
}