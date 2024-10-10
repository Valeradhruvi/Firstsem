import java.util.Scanner;
public class ArraytoBst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[] { 1, 2, 3, 4, 5};
        int n = arr.length;
        
        ArraytoBst b1 = new ArraytoBst();
        root = b1.arrayBst(arr, 0, n-1);
        System.out.println("inorder traversal");
        b1.inorder(root);
        

        sc.close();
    }

    static node root;

    public static node arrayBst(int[] arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start+end)/2;
        System.out.println(mid);
        node n1 = new node(arr[mid]);
        n1.lptr = arrayBst(arr, start, mid-1);
        n1.rptr = arrayBst(arr, mid+1, end);

        return n1;
    }

    public static void inorder(node n1){
        if(n1 == null){
            return;
        }
        else{
            System.out.print(n1.data + " ");
            inorder(n1.lptr);
            inorder(n1.rptr);
        }
    }
    public static void preorder(node n1){
        if(n1 == null){
            return;
        }
        else{
            System.out.print(n1.data + " ");
            preorder(n1.lptr);
            preorder(n1.rptr);
        }
    }
}

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