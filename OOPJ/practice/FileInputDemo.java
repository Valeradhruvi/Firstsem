import java.io.FileInputStream;

public class FileInputDemo {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("f1.txt");
        int i;
        while((i = fin.read()) != -1)
            {
                System.out.println((char)i);
            }
            fin.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
