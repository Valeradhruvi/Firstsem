import java.util.Scanner;
public class Delete_number {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter size of array: ");
       int size = sc.nextInt();

       int[] arr = new int[size];
       for(int i=0;i<size;i++){
            System.err.println("Enter element at "+i+" index");
            arr[i] = sc.nextInt();
       }
       
       System.out.println("Enter the index at which you want to delete number: ");
       int index = sc.nextInt();

       for(int i=index;i<size-1;i++){
        arr[i] = arr[i+1];
       }
       
       for(int i=0;i<arr.length-1;i++){
        System.out.println(arr[i]);
    }

    sc.close();
    }
}
