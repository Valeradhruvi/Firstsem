import java.util.Scanner;
public class Insert_in_sorted {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int sizeOfArray = sc.nextInt();

        int[] oldArray = new int[sizeOfArray];
        int[] newArray = new int[sizeOfArray+1];

        for(int i=0;i<sizeOfArray;i++){
            System.out.println("Enter element at "+i+" index: ");
            oldArray[i] = sc.nextInt();
        }

        int index = 0;
        System.out.println("Enter the new value: ");
        int new_value = sc.nextInt();
        for(int i=0;i<sizeOfArray;i++){
            if(oldArray[i]>new_value){
                index = i-1;
            }
        }
        for(int i=0;i<index;i++){
            newArray[i] = oldArray[i];
        }
        newArray[index] = new_value;

        for(int i=index+1;i<sizeOfArray+1;i++){
            newArray[i] = oldArray[i-1];
        }

        System.out.println("New array: ");
        for(int i=0;i<sizeOfArray+1;i++){
            System.out.println(newArray[i]);
        }

        sc.close();
    }
}
