import java.util.Scanner;
public class Print_elements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element at: "+i);
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Element: "+arr[i]);
        }
        sc.close();
    }
}