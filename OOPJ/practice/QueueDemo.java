import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        
        Queue<Integer> qu = new LinkedList<>();
            qu.add(10); // adjucent element is offer()
            qu.add(20);
            qu.add(30);
            qu.add(40);
            qu.add(50);
            qu.add(60);
            qu.add(70);
            qu.add(80);
            qu.add(90);

            System.out.println(qu);
            System.out.println(qu.poll());//prints and remove 1st element adjucent method is remove()
            
            System.out.println(qu.peek()); // prints next element adjucent method is element()
            System.out.println(qu);

    }
}
