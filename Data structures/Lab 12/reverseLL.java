public class reverseLL {
    public static void main(String[] args) {
        linkedList l1 = new linkedList();

        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
        l1.insert(6);

        l1.reverse();
        l1.display();

    }
}
class linkedList{
    class node{
        int data;
        node link;

        node(int data){
            this.data = data;
            this.link = null;
        }
    }
    public node first = null;

    public void reverse(){
        node current = first;
        node prev = null , save = null;

        if(first == null){
            return;
        }
        else{
            while(current.link != null){
                save = current.link;
                current.link = prev;
                save = current;
                current = save;
            }
        }
    }

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