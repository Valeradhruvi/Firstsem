import java.util.Scanner;
public class Delete_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeOfArray = sc.nextInt();

        int[] arr = new int[sizeOfArray+1];
        for(int i=0;i<sizeOfArray;i++){
            System.out.println("Enter element at "+i+" index");
            arr[i] = sc.nextInt();
        }
       int index=0;
        for(int i=0;i<sizeOfArray;i++){
            for(int j=i+1;j<sizeOfArray;j++){
                if(arr[i]==arr[j]){
                    index = i;
                }
            }
        }
        System.out.println("at "+index+" index duplicate number "+arr[index]+" is available");

        for(int i=index;i<arr.length-2;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("-------------------------------------------------");
        System.out.println("New array");
        for(int i=0;i<arr.length-2;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}