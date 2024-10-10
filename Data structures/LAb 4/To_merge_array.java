import java.util.Scanner;
public class To_merge_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int m = sc.nextInt();
        System.out.println("Enter size of second array: ");
        int n = sc.nextInt();

        int[] first_array = new int[m];
        int[] second_array = new int[n];
        System.out.println("For first array");
        for(int i=0;i<m;i++){
            System.out.println("Enter element at "+i+" index of first array: ");
            first_array[i] = sc.nextInt();
        }
        System.out.println("For second array");
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+" index of first array: ");
            second_array[i] = sc.nextInt();
        }

        int[] third_array = new int[m+n];
        for(int i=0;i<m;i++){
            third_array[i] = first_array[i];
        }
        for(int i=0;i<n;i++){
            third_array[m+i] = second_array[i];
        }

        System.out.println("Merged array is: ");
        for(int i=0;i<third_array.length;i++){
            System.out.print(third_array[i]+",");
        }
        sc.close();
    }
}
