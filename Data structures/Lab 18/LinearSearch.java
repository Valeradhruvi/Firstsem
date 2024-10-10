import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter element at "+i+"th index: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number you want to search for: ");
        int key = sc.nextInt();

        int ans = -1;
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                ans = i;
                break;
            }
        }

        if(ans == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+ans+"th index");
        }

        sc.close();
    }
}