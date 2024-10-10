import java.util.Scanner;
public class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        linkedList l1 = new linkedList();
        l1.insert(12);
        l1.insert(11);
        l1.insert(10);
        l1.insert(9);
        l1.insert(8);
        l1.display();

        System.out.println("Enter key you want to delete from above list: ");
        int num = sc.nextInt();

        l1.delete(num);
        
        l1.display();   
        sc.close();
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
    
    public void delete(int key){
        node save = first;
        node previous = null;

        if(first == null){
            System.out.println("List is empty");
            return;
        }

        if(save.data == key){
            first = save.link;
            return;
        }

        while ( save!=null && save.data != key) {
            previous = save;
            save = save.link;
        }

        if(save == null){
            System.out.println("Node not found please enter the key from mentioned list");
            return;
        }

        previous.link = save.link;
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