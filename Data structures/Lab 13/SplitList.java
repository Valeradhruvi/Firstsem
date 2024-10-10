public class SplitList{
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.cir_insert_at_first(1);
        l1.cir_insert_at_first(2);
        l1.cir_insert_at_first(3);
        l1.cir_insert_at_first(4);
        l1.cir_insert_at_first(5);

        l1.display();
        System.out.println();   
        l1.middlenode();
        l1.split();
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

    public static node first = null;
    public static node last = null;
    int mid=0;


    public void cir_insert_at_first(int data){
        node n1 = new node(data);

        if(first == null){
            n1.link = n1;
            first = n1;
            last = n1;

            return;
        }

        n1.link = last.link;
        last.link = n1;
        first = n1;
    }
    public void split(){
        System.out.println(mid+1);
        node temp=first;
        int num=0;
        while(num!=mid+1){
            temp=temp.link;
        }
        while(temp.link!=first){
            node newNode=new node(temp.data);
        }
    }
    

    public void middlenode(){
        node save=first;
        node pred=first;
        if(first==null){
            return;
        }
        try{
            while(save.link!=first){
                save=save.link.link;
                pred=pred.link;
                mid++;
            }
            System.out.println(pred.data);
        }
        catch(Exception e){
            System.out.println("Node is even");
        }
        
    }

    public void display(){
        node temp = first;
        if(last == null){
            System.out.println("list is empty");
            return;
        }
        do{
            System.out.print(temp.data);
            temp = temp.link;
        }while(temp != last.link);
    }
}