import java.util.Scanner;
public class Name_sort_logic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of string array: ");
        int size = sc.nextInt();

        String[] arr = new String[size];

        String currentFirstWord;
        int currentFirstIndex;
        for(int i=0;i<size;i++){

            currentFirstWord = arr[i];
            currentFirstIndex = i;

                for(int j=i+1;j<size;j++)
                    if(currentFirstWord.charAt(0)>arr[j].charAt(0)){
                        currentFirstWord = arr[j];
                        currentFirstIndex = j;
                    }

                if(currentFirstIndex != i){
                    String temp = arr[i];
                    arr[i] = arr[currentFirstIndex];
                arr[currentFirstIndex] = temp; //arrays sorted
                }
        }
        System.out.println("Sorted names: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
        sc.close();
    }
}