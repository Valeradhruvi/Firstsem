 import java.util.Arrays;
import java.util.Scanner;
public class MergeSort {
    static int size = 8;
    static int[] a = new int[size];
    static int low=0;
    static int high=7;
    static int mid = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++){
            System.out.println("Enter element at "+i+"th index");
            a[i] = sc.nextInt();
        }
        mergeSort(a , 0, 7);
        merge(low, mid, high);

        // for(int k=low;k<=high;k++){
           
        // }

        sc.close();
    }

    public static void mergeSort(int[] a,int low ,int high){
        a = new int[(high-low)+1];
        int mid=0;
        if(low<high){

            mid = (low+high)/2;
            mergeSort(a, low, mid);
            mergeSort( a, mid+1, high);
        }
    }

    public static void merge(int low,int mid,int high){
        int h = low;
        int i = low;
        int j = mid+1;
        int k;

        int[] b = new int[size];
        while(h<=mid && j<=high){
            if(a[h]<=a[j]){
                b[i] = a[h];
                h=h+1;
            }
            else{
                b[i] = a[j];
                j=j+1;
            }

            i=i+1;
        }
  

        if(h>mid){
            for(k=j;k<=high;k++){
                b[i] = a[k];
                i=i+1;
            }
        }
        else{
            for(k=h;k<=mid;k++){
                b[i] = a[k];
                i=i+1;
            }
        }

        for(k=low;k<=high;k++){
            a[k] = b[k];
        }
        
        // Arrays.sort(a);
        for(k=low;k<=high;k++){
            System.out.print(a[k]+" ");
        }
        
    }
}
