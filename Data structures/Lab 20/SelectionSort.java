import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter element at "+i+"th index: ");
            arr[i] = sc.nextInt();
        }

        int min_index;

        for(int i=0;i<=size-2;i++){
            min_index = i;
                for(int j=i+1;j<=size-1;j++){
                    if(arr[j]<arr[min_index]){
                        min_index = j;
                    }
                }

                if(min_index != i){
                    int temp = arr[i];
                    arr[i] = arr[min_index];
                    arr[min_index] = temp;
                }
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
