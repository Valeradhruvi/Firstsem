import java.util.Scanner;
public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of your array: ");
        int initialSize = sc.nextInt();

        int[] a = new int[initialSize];

        for(int i=0 ; i<initialSize ; i++){
            System.out.println("Enter element at ["+i+"]th index");
            a[i] = sc.nextInt();
        }

        //for getting maximum element out of array
        int max = a[0];
        for(int i=0 ; i<initialSize ; i++){
            if(a[i]>max){
                max = a[i];
            }
        }

        // System.out.println(max);

        //declaring a temporary array c
        int[] c = new int[max+1];
        for(int i=0 ; i<c.length ; i++){
            c[i] = 0;
        }


        //below for loop will calculate occurances of elements in array
        for(int i=0 ; i<initialSize ; i++){
            c[a[i]]++;
        }

        


        for(int i=1 ; i<=max ; i++){
            c[i] = c[i] + c[i-1];
        }


        
        //declaring an another output array b of size a.length
        int[] b = new int[a.length];

        for(int i=initialSize-1 ; i>=0 ; i--){
            b[ c[ a[i] ] -1] = a[i];
            c[a[i]]--;
        }
        System.out.println("-------------------------------------");
        System.out.println("Sorted array is: ");
        for(int i=0 ; i<b.length ; i++){
            System.out.print(b[i]);
        }
    }
}