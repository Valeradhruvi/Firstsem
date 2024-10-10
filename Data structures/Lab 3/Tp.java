import java.util.Scanner;
public class Tp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int array_size = sc.nextInt();

        int[] arr1 = new int[array_size];
        int[] newArr = new int[array_size+1];
        for(int i=0;i<array_size;i++){
            System.out.println("Enter element at: "+i);
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter index at which you want to add number: ");
        int newIndex = sc.nextInt();
        System.out.println("Enter number at which you want to add at that index: ");
        int newNumber = sc.nextInt();

       
        for(int i=0;i<newIndex;i++){
            newArr[i] = arr1[i];
        }
        newArr[newIndex] = newNumber;
        for(int i=newIndex+1;i<array_size+1;i++){
            newArr[i]  = arr1[i-1];
        }
        
        System.out.println("New array: ");
        for(int i=0;i<array_size+1;i++){
            System.out.println(newArr[i]);
        }
        sc.close();
    }
}