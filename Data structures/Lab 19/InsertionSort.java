import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
       
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter element at "+i+"th index: ");
            arr[i] = sc.nextInt();
        }

        int key;

        int i=1;
        int j=0;

        while(i<size){
            key = arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = key;
            i = i+1;
        }
        System.out.println();

        for(int k=0;k<size;k++){
            System.out.print(arr[k]+" ");
        }

        sc.close();
    }
}
