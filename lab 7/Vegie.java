abstract class Vegetable{

    public abstract void display(String color);

}
class Potato extends Vegetable{

    public void display(String color){
        System.out.println("Potato");
        System.out.println("color: "+color);
    }

}
class Brinjal extends Vegetable{

    public void display(String color){
        System.out.println("Brinjal");
        System.out.println("color: "+color);
    }

}
class Tomato extends Vegetable{

    public void display(String color){
        System.out.println("Tomato");
        System.out.println("color: "+color);
    }

}

public class Vegie{
    public static void main(String[] args){

        Vegetable v1,v2,v3;
        v1 = new Potato();
        v1.display("Brown");

        v2 = new Brinjal();
        v2.display("Purple");

        v3 = new Tomato();
        v3.display("Red");

    }
}