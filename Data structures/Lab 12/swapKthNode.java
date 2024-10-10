public class swapKthNode {
    public static void main(String[] args) {
        linkedList l1 = new linkedList();

        l1.insert(7);
        l1.insert(6);
        l1.insert(5);
        l1.insert(4);
        l1.insert(3);
        l1.insert(2);
        l1.insert(1);

        l1.display();
        l1.swap(3);
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

    public void swap(int k){
        int c = countNodes();

        // if kth node id out limit of list
        if(k>c){
            System.out.println("Invalid");
            return;
        }

        //if both nodes are same 
        else if(2*k-1 == c){
            return;
        }

        else{
            node x = first;
            node prex = null;

            for(int i=0;i<k;i++){
                prex = x;
                x = x.link;
            }

            node y = first;
            node prey = null;
            for(int i=0;i<c-k+1;i++){
                prey = y;
                y = y.link;
            }


            if(prex != null){
                prex.link = y;
            }

            if(prey != null){
                prey.link = x;
            }

            //swaping
            node temp = x.link;
            x.link = y.link;
            y.link = temp;


            if(k==1){
                first = y;
            }
            if(k==c){
                first = x;
            }
        }
    }

    public int countNodes(){
        int count = 0;

        node save = first;
        while(save != null){
            count++;
            save = save.link;
        }

        return count;
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