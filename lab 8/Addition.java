import java.util.Scanner;
class NegetiveNumberException extends Exception{

    NegetiveNumberException(String msg){
        super(msg);
    }
}
class CannotDivideException extends Exception{

    CannotDivideException(String msg){
        super(msg);
    }
}
public class Addition{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number here: ");
            int a = sc.nextInt();
            if(a<0){
                 throw new NegetiveNumberException("Number cannot be less zero");
            }
            else if(a/2!==0){
                throw new CannotDivideException("Number is not Divisible")
            }
        }
        catch(NegetiveNumberException e){
            System.out.println(e.getMessage());
        }
        catch(CannotDivideException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}