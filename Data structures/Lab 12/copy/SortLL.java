public class SortLL {
    public static void main(String[] args) {
        linkedList l1 = new linkedList();

        l1.insert(1);
        l1.insert(3);
        l1.insert(4);
        l1.insert(2);
        l1.insert(5);
        l1.insert(7);
        l1.insert(6);

        l1.sort();
        l1.display();
    }
}
class node{
    int data;
    node link;

    node(int data){
        this.data = data;
        this.link = null;
    }

    
}
class linkedList{
    
    node first = null;
    
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

    public void sort(){
        node current = first;
        node index;

        if(first == null){
            return;
        }
        else{
            while(current != null) {  
                index = current.link;  
                  
                while(index != null) {  
                    if(current.data > index.data) {  
                        int temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.link;  
                }  
                current = current.link;  
            }      
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