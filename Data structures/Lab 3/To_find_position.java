import java.util.Scanner;
public class To_find_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at "+i);
            arr[i] = sc.nextInt();
        }

        int lnum=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[lnum]);
            lnum=i;
        }
        int snum=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[lnum]);
            snum=i;
        }
        System.out.println(arr[lnum]);
        System.out.println(arr[snum]);

        sc.close();
    }
}
