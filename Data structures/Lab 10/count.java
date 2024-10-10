public class count {
    public static void main(String[] args){
        linkedList l1 = new linkedList();
        l1.insert(12);
        l1.insert(11);
        l1.insert(10);
        l1.insert(9);
        l1.insert(8);

        l1.count_nodes();
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
    public node last = null;

    public void insert(int data){
        node n1 = new node(data);
        if(last == null){
            n1.link = n1;
            first = n1;
            last = n1;
            return;
        }
            n1.link = first;
            last.link = n1.link;
            first = n1;
    }

    int count=1;

    public void count_nodes(){
        if(first == null){
            count = 0;
            System.out.println(count);
            return;
        }

        node save = first;
        
        while (save!=last) {
            save = save.link;
            count++;
        }

        System.out.println(count);
    }
}