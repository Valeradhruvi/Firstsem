public class SearchNodeFrmBst {
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

        boolean ans = b1.searchRecord(100, root);
        System.out.println(ans);

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

    public boolean searchRecord(int data, node root){
        if(root == null){
            return false;
        }
        else if(data == root.data){
            return true;
        }
        else if(data > root.data){
            return searchRecord(data, root.rptr);
        }
        else{
            return searchRecord(data, root.lptr);
        }
    }

    public void inorder(node root){
        if(root != null){
            inorder(root.lptr);
            System.out.print(root.data+" ");
            inorder(root.rptr);
        }
    }
}