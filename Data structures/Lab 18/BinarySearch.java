import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter element at "+i+"th index");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter element you are in search for: ");
        int key = sc.nextInt();

        int left = 0;
        int right = size-1;
        int middle; int ans = -1;
        while (left<=right) {
            middle = (left+right)/2;
            if(arr[middle] == key){
                ans = middle;
                break;
            }
            else if(key<arr[middle]){
                right = middle-1;
            }
            else{
                left = middle+1;
            }
        }

        if(ans == -1){
            System.err.println("Element not found");
        }
        else{
            System.out.println("Element found at "+ans+"th index");
        }

        sc.close();
    }    
}