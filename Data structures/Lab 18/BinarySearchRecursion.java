import java.util.Scanner;
import java.util.Arrays;
public class BinarySearchRecursion {
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

        int ans = BinarySearch(arr,key,0,size-1);
        if(ans == -1){
            System.err.println("Element not found");
        }
        else{
            System.out.println(ans+"th index");
        }

        sc.close();

    }

    public static int BinarySearch(int arr[], int key, int left, int right){
        int ans;
        if (left<=right) {
           int  middle = (left+right)/2;
            if(arr[middle] == key){
                ans = middle;
                return ans;
            }
            else if(key<arr[middle]){
                return BinarySearch(arr, key, left, middle-1);
            }
            else{
                return BinarySearch(arr, key, middle+1, right);
            }
        }

        return -1;
    }
}