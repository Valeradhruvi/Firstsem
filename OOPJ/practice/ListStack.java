import java.util.Stack;

public class ListStack {
    public static void main(String[] args) {
        
        Stack<String> animal = new Stack<>();
        animal.push("lion");
        animal.push("tiger");
        animal.push("camel");
        animal.push("deer");
        animal.push("fool");

        System.out.println(animal);
        System.out.println(animal.peek());// returns the value at the top of stack

        animal.pop(); //removes top-most element
        System.out.println(animal);
    }
}
