import java.util.Scanner;

abstract class Vegetables{
    String color;

    public abstract void toString( String color);
}
class Brinjal extends Vegetables{
    public void toString(String color){
       System.out.println("Brinjal is :" +color);

    }
}
class Tomato extends Vegetables{
    public void toString(String color){
        System.out.println("Tomato is :" +color);
 
     }
}
class Potato extends Vegetables{
    public void toString(String color){
        System.out.println("Potato is :" +color);
 
     }
}

public class Abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1 for Brinjal 2 for Tomato and 3 for Potato");
        int veggieNumber = sc.nextInt();

        if(veggieNumber == 1){
            Vegetables v1 = new Brinjal();
            v1.toString("Purple");
        }
        else if(veggieNumber == 2){
            Vegetables v2 = new Tomato();
            v2.toString("Red");
        }
        else if(veggieNumber == 3){
            Vegetables v3 = new Potato();
            v3.toString("Brown");
        }
        else{
            System.out.println("Invalid input");
        }

        sc.close();


    }
}
