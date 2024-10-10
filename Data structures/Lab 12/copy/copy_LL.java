public class copy_LL{
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        n1.link = n2;
        n2.link = n3;
        n3.link = n4;
        n4.link = n5;
        Node temp = n1;
        System.out.println("Linked List");
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.link;
            if(temp!=null){
                System.out.print(" -> ");
            } 
        }
        System.out.println();
        System.out.println("----------------------------------");

        LinkedList l = new LinkedList(n1);
        System.out.println("New Linked List");
        l.copy();
    }
}
class Node{
    int data;
    Node link;
        Node(int data){
            this.data=data;
            this.link=null;
        }
    }
class LinkedList{
    Node first;
    LinkedList(Node first){
        this.first = first;
    }

    public void copy(){
        Node temp = first;
        Node newLL1 = new Node(temp.data);
        Node prev = newLL1;
        System.out.print(prev.data);
        
        while(temp != null && temp.link != null) {
            temp = temp.link;
            if(temp!=null){
                System.out.print(" -> ");
            }
            Node newLL2 = new Node(temp.data);
            prev.link = newLL2;
            prev = newLL2;
            System.out.print(prev.data);
            
        }
    }
}