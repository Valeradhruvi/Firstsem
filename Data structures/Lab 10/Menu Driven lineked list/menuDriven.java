import java.util.Scanner;
public class menuDriven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        linkedList l1 = new linkedList();
        int temp=0;

        while (temp!=-1) {
            System.out.println("Enter 1 to insert node at first: ");
            System.out.println("Enter 2 to insert node at last: ");
            System.out.println("Enter 3 to insert node in order: ");
            System.out.println("Enter 4 to delete node at any place: ");
            System.out.println("Enter 5 to count nodes in linked list: ");
            
            temp = sc.nextInt();

            if(temp==1){
                System.out.println("Enter data of node");
                int data = sc.nextInt();
                l1.insert(data);
                l1.display();
            }
            else if(temp==2){
                System.out.println("Enter data of node to be added at last");
                int data = sc.nextInt();
                l1.insend(data);
                l1.display();
            }
            else if(temp==3){
                System.out.println("Enter data of node to be inserted in order");
                int data = sc.nextInt();
                l1.insord(data);
                l1.display();
            }
            else if(temp==4){
                System.out.println("Enter number you want to delete from linked list");
                int key = sc.nextInt();
                l1.delete(key);
                l1.display();
            }
            else if(temp==5){
                System.out.println("Count of nodes in linked list is: ");
                l1.count_nodes();
            }
            else if(temp==-1){
                break;
            }
            else{
                System.out.println("Invalid input");
            }
        }

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
    int count;
    public void count_nodes(){
        if(first == null){
            count = 0;
            System.out.println(count);
            return;
        }

        node save = first;
        while (save!=null) {
            save = save.link;
            count = count+1;
        }

        System.out.println(count);
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