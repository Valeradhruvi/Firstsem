import java.io.FileOutputStream;

public class FileOutDemo {
    public static void main(String[] args) {
        try{
        FileOutputStream fout = new FileOutputStream("f1.txt");
         String l = "prem ghosted me! yessss!";
         byte[] ll = l.getBytes();
            
         fout.write(ll);
         fout.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Everything over");

    }
}
