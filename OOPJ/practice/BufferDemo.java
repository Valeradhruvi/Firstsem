import java.io.BufferedReader;
import java.io.FileReader;

public class BufferDemo {
    public static void main(String[] args) {
       try{
        FileReader fl = new FileReader("bf.txt");
        BufferedReader bread = new BufferedReader(fl);
        char[] c = new char[40];
        if(bread.ready()){
            System.out.println(bread.readLine());
            bread.read(c);

            for(int i = 0; i<=c.length; i++){
                System.out.print(c[i]);
            }
        }
        bread.close();
       }catch(Exception e){
        e.printStackTrace();
       }
    }
}
