public class insertAtEnd {
    public static void main(String[] args) {
        linkedList l1 = new linkedList();

        l1.insend(15);
        l1.insend(16);
        l1.insend(17);
        l1.insend(18);
        l1.insend(19);
        l1.insend(20);
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
    public void insend(int data){
        node n2 = new node(data);
        node last = first;

        if(first==null){
           first = n2; 
        }
        
        else{
            while(last.link!=null){
                last = last.link;
            }
            last.link = n2;
        }
        
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