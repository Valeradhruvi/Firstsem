import java.util.Scanner;

public class Count_object{
    static int count = 0;
    public static void main(String[] args){
        Count_object o1 = new Count_object();
        Count_object o2 = new Count_object(10 , 20);

        System.out.println(count);
    }
    
    Count_object(){
        count++;
    }
    Count_object(int a, int b){
        count++;
    }
}