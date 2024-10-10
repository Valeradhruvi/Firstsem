public class Q68 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.insert(7);
        l1.insert(6);
        l1.insert(5);
        l1.insert(4);
        l1.insert(3);
        l1.insert(2);
        l1.insert(1);

        System.out.println("old list");
        l1.display();

        l1.swap();
        l1.display();

    }
}
class LinkedList{
    class node{
        int data;
        node link;

        node(int data){
            this.data = data;
            this.link = null;
        }
    }

    public static node first = null;
    public void insert(int data){
        node newNode = new node(data);

        if(first == null){
            first = newNode;
            return;
        }
        else{
            node temp = first;
            first = newNode;
            first.link = temp;
        }
    }

    public void swap(){
        node temp = first;
        while (temp.link != null) {
            swapConsecutive();
            temp = temp.link;
            
        }
    }

    public void swapConsecutive(){
       if(first == null && first.link == null){
            return;
       }
       else{
            node current = first.link.link;
            node prev = first;
            first = first.link;
            first.link = prev;

            while (current != null && current.link != null) {
                prev.link = current.link;
                prev = current;
                node next = current.link.link;
                current.link = current;
                current = next;
            }

            prev.link = current;
       }         
    }

    public void display(){
        node current = first;
        if(first==null){
            System.out.println("List is empty");
        }
        else{
            while(current!=null){
                System.out.print(current.data+" ");
                current = current.link;
        }
        System.out.println();
        }
    }
}