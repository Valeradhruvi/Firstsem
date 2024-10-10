import java.util.Scanner;
public class stack_using_LL{
    public static void main(String[] args) {
        stack s1 = new stack();

        Scanner sc = new Scanner(System.in);
        int flag =0;
        while (flag!=-1) {
            System.out.println("Enter 1 to push an element: ");
            System.out.println("Enter 2 to pop an element: ");
            System.out.println("Enter 3 to peep an element");
            System.out.println("Enter 4 to change a element in stack");
            System.out.println("Enter 5 to display stack");
            System.out.println("Enter -1 to exit Stack");
            flag = sc.nextInt();

            if(flag==1){
                System.out.println("How many element you want to push?");
                int ele = sc.nextInt();
                for(int i=0;i<ele;i++){
                    System.out.println("Enter element which you want to push at "+i+" : ");
                    int data = sc.nextInt();
                    s1.push(data);
                }
                s1.display();
                System.out.println("----------------------------");
            }
            else if(flag==2){
                s1.pop();
                s1.display();
                System.out.println("----------------------------");
            }
            else if(flag==3){
                System.out.println("Enter element you want to peep: ");
                int key = sc.nextInt();
                s1.peep(key);
                s1.display();
                System.out.println("-----------------------------");
            }
            else if(flag==4){
                s1.display();
                System.out.println("--------------------------------");
            }
            else if(flag==5){
                System.out.println("Enter element you want ot replace: ");
                int data = sc.nextInt();
                System.out.println("Enter new element: ");
                int newdata = sc.nextInt();
                s1.change(data, newdata);
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
class stack{
    class node{
        int data;
        node link;

        public node(int data){
            this.data = data;
            this.link = null;
        }
    }

    public node top = null;

    public void push(int data){
        node n1 = new node(data);

        if(top==null){
            top = n1;
            return;
        }
        
        node temp = top;
        top = n1;
        top.link = temp;
    }

    public void pop(){
        node save = top;

        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }
        
        top = save.link;
        System.out.println("Poped element are: "+save.data);
    }

    public void peep(int data){
        node save = top;
        node previous = null;

        if(top == null){
            System.out.println("Stack underflow");
            return;
        }

        if(save.data == data){
            top = save.link;
            return;
        }

        while (save.link!=null && save.data != data) {
            previous = save;
            save = save.link;
        }

        if(save.link == null){
            System.out.println("Element not found");
            return;
        }

        previous.link = save.link;
    }

    public void change(int data, int newdata){
        node temp = top;

        if(top==null){
            System.out.println("Stack Underflow");
            return;
        }

        while (temp.link!=null) {
            if(temp.data == data){
                temp.data = newdata;
                break;
            }
            temp = temp.link;
        }
    }

    public void display(){
        node temp = top;

        if(temp == null){
            System.out.println("Stack Underflow");
            return;
        }

        while (temp!=null) {
            System.out.print(temp.data);
            temp = temp.link;
        }
    }
}