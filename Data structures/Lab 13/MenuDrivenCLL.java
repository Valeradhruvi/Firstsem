public class MenuDrivenCLL {
    public static void main(String[] args) {
        linkedList l1 = new linkedList();

        for(int i=1;i<4;i++){
            l1.cir_insert_at_first(i);
        }
        
        for(int i=3;i<6;i++){
            l1.insert_at_last(i);
        }


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
    public node last = null;

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

    public void insert_at_last(int data){
        node n1 = new node(data);

        if(first == null){
            n1.link = n1;
            first = n1;
            last = n1;
            return;
        }
        
        n1.link = first;
        last.link = n1;
        last = n1;

    }

    public void insertInOrder(int data){
        node newNode = new node(data);

        if(first == null){
            cir_insert_at_first(data);
            return;
        }
        if(newNode.data <= first.data){
            cir_insert_at_first(data);
            return;
        }
            
        node save = first;
                while (save != last && newNode.data > save.link.data) {
                    save = save.link;
                }

                newNode.link = save.link;
                save.link = newNode;
                    if(save == last){
                        last = newNode;
                    }
                return;
    }

    
    public void delete(int data){

        if(first == null){
            System.out.println("Link is empty");
            return;
        }
        else{
            node save = first;
            node pred = save;
            while (save.data != data && save != last) {
                pred = save;
                save = save.link;
            }

            if(save.data != data){
                System.out.println("Node doesn't exist");
                return;
            }
            else{
                if(first == last){
                    first.link = null;
                    last.link = null;
                }
                else if (first.data == data) {
                        first = first.link;
                        last.link = first;
                }
                else{
                    pred.link =  save.link;
                    if(save.data == last.data){
                        last = save;
                    }
                }
            }
        }
    }

    public void display(){
        node temp = last.link;
        if(last == null){
            System.out.println("list is empty");
            return;
        }
        while(temp != last ){
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}