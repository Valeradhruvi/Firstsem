import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0; int a=0;
        for(int i = 1008 ; i<9009 ; i++){
           for (int j = 2 ; j < i/2 ; j++){
            if(j % 1 == 0){
                count++;
            }
           }
           if (count == 1){
              a = i;
           }
           else{
            
           }
           System.out.println(a);
        }


        sc.close();
    }
}