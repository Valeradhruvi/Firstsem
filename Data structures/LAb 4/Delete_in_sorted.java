import java.util.Scanner;
public class Delete_in_sorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeOfArray = sc.nextInt();

        int[] old_array = new int[sizeOfArray];
        int[] new_array = new int[sizeOfArray-1];

        for(int i=0;i<sizeOfArray;i++){
            System.out.println("Enter element at "+i+" index");
            old_array[i] = sc.nextInt();
        }

        int index = 0;
        System.out.println("Enter element you want to delete: ");
        int element = sc.nextInt();

        for(int i=0;i<sizeOfArray;i++){
            if(old_array[i]==element){
                index=i;
            }
        }
        for(int i=0;i<index;i++){
            new_array[i] = old_array[i];
        }
        for(int i=index;i<sizeOfArray-1;i++){
            new_array[i] = old_array[i+1];
        }

        System.out.println("New array");
        for(int i=0;i<sizeOfArray-1;i++){
            System.out.println(new_array[i]);
        }
        sc.close();
    }
}