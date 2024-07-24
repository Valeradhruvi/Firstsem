import java.io.*;
import java.util.Scanner;
public class Program1{
    public static void main(String[] args){
        try{
            File file = new File("a.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}