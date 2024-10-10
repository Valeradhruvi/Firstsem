public class insertInOrder {
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.insert(13);
        l1.insert(11);
        l1.insert(10);
        l1.insert(9);
        l1.insord(12);
        l1.display();
    }
}
class linkedList{
    class node{
        int data;
        node link;

        public node(int data){
            this.data = data;
            this.link = null;
        }
    }
    
    public node first = null;

    public void insert(int data){
     node n1 = new node(data);
        if(first == null){
            first = n1;
            return;
        }
            node temp = first;
            first = n1;
            first.link = temp;
    }
    public void insord(int data){
        node n2 = new node(data);

        if(first == null || n2.data <= first.data){
            n2.link = first;
            first = n2;
            return;
        }
        
        node presentNode = first;
        while(presentNode.link != null && n2.data>= presentNode.link.data){
            presentNode = presentNode.link;
        }

        n2.link = presentNode.link;
        presentNode.link = n2;
    }
    public void display(){
        node current = first;
        if(first == null){
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