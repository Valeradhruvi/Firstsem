import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int sizeOfArray = sc.nextInt();

        int[] arr = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            System.out.println("Enter element at "+i+" index");
            arr[i] = sc.nextInt();
        }
        System.out.println("-------------------------------------------------");
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }
        System.out.println("Are duplicates");
        sc.close();
    }
}
