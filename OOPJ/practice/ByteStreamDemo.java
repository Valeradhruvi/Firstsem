import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) {
        
        FileOutputStream fout = null;
        FileInputStream fin = null;

        try{
            fout = new FileOutputStream("Renewed Marks.csv");
            fin = new FileInputStream("unit3-marks.csv");
            
            int a;
            while((a = fin.read()) != -1){
                fout.write(a);
            }
        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
          try{
            fin.close();
            fout.close();
          }catch(Exception e){ e.printStackTrace();}
        }
        
    }
}
