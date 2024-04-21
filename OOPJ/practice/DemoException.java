import java.util.Scanner;
public class DemoException {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        try{
            if(a==0 || b==0){
                throw new Exception("Number cannot be zero");
                
            }
            else{
                int ans = a/b;
                System.out.println(ans);
                sc.close();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

       
    }
}
