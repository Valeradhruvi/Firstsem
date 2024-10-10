public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,7,8,9};

        int gap = arr.length/2;
        for(gap = arr.length/2 ; gap >=1 ; gap = gap/2){
            for(int j=gap ; j<arr.length ; j++){
                for(int i = j-gap ; i>=0 ; i = i-gap){
                    if(arr[i+gap] > arr[j] ){
                        break;
                    }
                    else{
                        int temp = arr[i+gap];
                        arr[i+gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}