import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter size of array: ");
       int size = sc.nextInt();
       
       int [] arr = new int[size];
       for(int i=0;i<size;i++){
           System.out.println("Enter element at "+i+"th index: ");
           arr[i] = sc.nextInt();
       }

       int last = size-1;
       int exchange = 0;
       for(int i=0;i<=size-2;i++){
           exchange = 0;
            for(int j=0;j<=last-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                exchange++;

            }
        }

        if(exchange == 0){
            System.err.println("Array is sorted");
        }
        else{ 
            for(int k=0;k<size;k++){
                System.out.print(arr[k]+" ");
            }
        }

        sc.close();
    }
}
