public class insertAtFirst{
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.insert(12);
        l1.insert(11);
        l1.insert(10);
        l1.insert(9);
        l1.insert(8);
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