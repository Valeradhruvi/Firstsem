public class linkedList {
    public static void main(String[] args) {
        node newNode = new node(10);
        node newNode2 = new node(12);
        node newNode3 = new node(14);
        node newNode4 = new node(16);

        newNode.link = newNode2;
        newNode2.link = newNode3;
        newNode3.link = newNode4;

        node temp = newNode;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}
class node{
    int data;
    node link;

    public node(int data){
        this.data = data;
        this.link = null;
    }
    
}