import java.util.Scanner;
public class MenuDriven{
    public static void main(String[] args) {
        doubleLinkedList dl1 = new doubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int flag =0;

        dl1.insertAtFirst(1);
        dl1.insertAtFirst(2);
        dl1.insertAtFirst(3);
        dl1.insertAtFirst(4);
        while (flag!=-1) {
            System.out.println("Enter 1 to insert element at first position in Linked-list : ");
            System.out.println("Enter 2 to insert element at last position in Linked-list : ");
            System.out.println("Enter 3 to insert element at ordered position an element in Linked-list: ");
            System.out.println("Enter 4 to delete element from Linked-List");
            System.out.println("Enter 5 to display Linked-List");
            System.out.println("Enter -1 to exit linked-List");
            flag = sc.nextInt();

            if(flag==1){
                System.out.println("Enter element you want to insert?");
                int ele = sc.nextInt();
                dl1.insertAtFirst(ele);
                dl1.display();
                System.out.println("----------------------------");
            }
            else if(flag==2){
                System.out.println("Enter element you want to insert");
                int ele = sc.nextInt();
                dl1.insertAtlast(ele);
                dl1.display();
                System.out.println("----------------------------");
            }
            else if(flag==3){
                System.out.println("Enter position of element you want to delete: ");
                int pos = sc.nextInt();
                System.out.println("Enter element you want to delete: ");
                int key = sc.nextInt();
                dl1.inserInOrder(key, pos);
                dl1.display();
                System.out.println("-----------------------------");
            }
            else if(flag==4){
                System.out.println("Enter element you want to delete");
                int data = sc.nextInt();
                dl1.deleteNode(data);
                dl1.display();
                System.out.println("--------------------------------");
            }
            else if(flag == 5){
                dl1.display();
                System.out.println("---------------------------------");
            }
            else if(flag==-1){
                break;
            }
            else{
                System.out.println("Invalid");
                System.out.println("-------------------------------");
            }
        }
        sc.close();
    }
}
class doubleLinkedList{
    class node{
        int data;
        node lptr;
        node rptr;

        public node(int data){
            this.data = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    node first;
    node last;

    public void insertAtFirst(int data){
        node newNode = new node(data);

        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.rptr = first;
            first.lptr=newNode;
            first = newNode; 
        }
    }

    public void insertAtlast(int data){
        node newNode = new node(data);
        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.lptr = last;
            last.rptr = newNode;
            last = newNode;
        }
    }

    public void deleteNode(int data){
        node temp = first;
        if(first == null){
            System.out.println("Underflow");
            return;
        }

        else if(first == last){
            first = null;
            last = null;
        }
        else if(first.data == data){
            first = first.rptr;
            first.lptr = null;
        }
        else if(last.data == data){
            last = last.lptr;
            last.rptr = null;
        }
        else {
            while(temp.data != data && temp != null){
                temp = temp.rptr;
            }

            temp.lptr.rptr = temp.rptr;
            temp.rptr.lptr = temp.lptr;
        }
        }

    public void inserInOrder(int data , int position){
        node newNode = new node(data);
        
        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            if(position == 1){
                insertAtFirst(data);
            }
            else{
                node current = first;
                int curPos = 1;

                while (current != null && curPos<position) {
                    current = current.rptr;
                    curPos++;
                }

                if(current == null){
                    insertAtlast(data);
                }
                else{
                    newNode.rptr = current;
                    newNode.lptr = current.lptr;
                    current.lptr.rptr = newNode;
                    current.lptr = newNode;
                }
            }
        }
    }

    public void display(){
        node save = first;
        if(first == null){
            System.out.println("Linked list is empty");
            return;
        }
        else{
            while (save != null) {
                System.out.print(" "+save.data);
                save = save.rptr;
            }
        }
    }
}