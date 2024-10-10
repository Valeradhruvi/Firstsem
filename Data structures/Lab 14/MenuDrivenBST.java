public class MenuDrivenBST {
    public static void main(String[] args) {
        BinaryTree.node root = null;

        BinaryTree b1 = new BinaryTree();
        root = b1.insert(root, 50);
        root = b1.insert(root, 30);
        root = b1.insert(root, 20);
        root = b1.insert(root, 10);
        root = b1.insert(root, 70);
        root = b1.insert(root, 60);

        b1.inorder(root);
    }
}
class BinaryTree{
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
    
    public node insert(node root, int key ){
        if(root == null){
            return new node(key);
        }

        if(root.data == key){
            return root;
        }

        if(key < root.data){
            root.lptr = insert(root.lptr, key);
        }
        else{
            root.rptr = insert(root.rptr, key);
        }

        return root;
    }

    public void inorder(node root){
        if(root != null){
            inorder(root.lptr);
            System.out.println(root.data+" ");
            inorder(root.rptr);
        }
    }
}