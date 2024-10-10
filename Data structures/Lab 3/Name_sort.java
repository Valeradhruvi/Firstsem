import java.util.Arrays;
import java.util.Scanner;
public class Name_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of String array: ");
        int size = sc.nextInt();

        String[] arr = new String[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter name at "+i+" index");
            arr[i] = sc.next();
        }

        Arrays.sort(arr);
        System.out.println("-----------------------------------");
        System.out.println("sorted array is");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
