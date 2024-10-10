public class DeleteNodeFromBst {
    public static void main(String[] args) {
        LinkedList.node root = null;

        LinkedList b1 =  new LinkedList();
        root = b1.insert(root, 50);
        b1.insert(root, 25);
        b1.insert(root, 75);
        b1.insert(root, 22);
        b1.insert(root, 40);
        b1.insert(root, 60);
        b1.insert(root, 80);
        b1.insert(root, 90);
        b1.insert(root, 15);
        b1.insert(root, 30);

        b1.deletenode(root, 40);
        System.out.println("deleteed");

        b1.inorder(root);
    }
}
class LinkedList{
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

    public node insert(node root, int key){

        node newNode = new node(key);
        node current = root;
        node prev = null;

        if(root == null){
            return newNode;
        }
                while(current != null)
                {
                    prev  = current;
                    if(key < current.data){
                        current = current.lptr;
                    }
                    else if(key > current.data){
                        current = current.rptr;
                    }
                    else {
                        return root;
                    }
                }

                if(prev == null){
                    prev = newNode;
                }
                else if(key < prev.data){
                    prev.lptr = newNode;
                    // System.out.println(prev.data);
                }
                else{
                    prev.rptr = newNode;
                    // System.out.println(prev.data);
                }
            return prev;
    }

    public node deletenode(node root, int data){
       if(root == null){
        return root;
       }

       if(root.data > data){
        root.lptr = deletenode(root.lptr, data);
       }
       else if(root.data < data){
        root.rptr = deletenode(root.rptr, data);
       }
       else{
         if(root.lptr == null){
            return root.rptr;
         }

         if(root.rptr == null){
            return root.lptr;
         }

         // When both children are present
         node succ = getSuccessor(root);
         root.data = succ.data;
         root.rptr = deletenode(root.rptr, succ.data);
       }

       return root;
    }
    public node getSuccessor(node curr) {
        curr = curr.rptr;
        while (curr != null && curr.lptr != null) {
            curr = curr.lptr;
        }
        return curr;
    }  

    public void inorder(node root){
        if(root != null){
            inorder(root.lptr);
            System.out.print(root.data+" ");
            inorder(root.rptr);
        }
    }
}