import java.util.Scanner;
public class Insert_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size+1];

        for(int i=0;i<arr.length-1;i++){
            System.out.println("Enter element at "+i+" index");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index at which you want to add number: ");
        int newIndex = sc.nextInt();

        System.out.println("Enter the number you want to add at that index: ");
        int newNumber = sc.nextInt();

        for(int i=size;i>=newIndex;i--){
            arr[i]=arr[i-1];
        }
        arr[newIndex] = newNumber;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}