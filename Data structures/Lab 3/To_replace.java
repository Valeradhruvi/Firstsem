import java.util.Scanner;
public class To_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int sizeOfArray = sc.nextInt();

        int[] arr = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            System.out.println("Enter element at "+i+" index: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter first element: ");
        int firstNo = sc.nextInt();
        System.out.println("Enter second element: ");
        int secondNo = sc.nextInt();

        int index1=0, index2=0;
        for(int i=0;i<sizeOfArray;i++){
            if(arr[i]==firstNo){
                index1 = i;
            }
            else if(arr[i] == secondNo){
                index2 = i;
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println("index1= "+index1);
        System.out.println("index2= "+index2);

        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println("------------------------------------------------------");
        System.out.println("Updated array: ");
        for(int i=0;i<sizeOfArray;i++){
            System.out.print(arr[i]+",");
        }
        sc.close();
    }
}
