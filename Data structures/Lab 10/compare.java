import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList l1 = new linkedList();
        linkedList l2 = new linkedList();

        System.out.println("Enter length of first list: ");
        int len1 = sc.nextInt();
        for(int i=0;i<len1;i++){
            System.out.println("Enter "+i+" element");
            int ele = sc.nextInt();
            l1.insert(ele);
        }

        System.out.println("Enter length of second list: ");
        int len2 = sc.nextInt();
        for(int i=0;i<len2;i++){
            System.out.println("Enter "+i+" element");
            int ele = sc.nextInt();
            l2.insert(ele);
        }

        l1.display();
        l2.display();

        
        if(len1 != len2){
            System.out.println("Not equal");
        }
        else{
            while(l1.first.link!=null){
                if(l1.first.data != l2.first.data){
                    System.out.println("Not Equal");
                    break;
                }
                else{
                    l1.first = l1.first.link;
                    l2.first = l2.first.link;
                }
            }
            System.out.println("Equal");
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