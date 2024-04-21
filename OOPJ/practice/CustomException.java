public class CustomException {
    public static void main(String[] args) {
        
        try{
                
             double a = Integer.parseInt(args[0]);
             double b = Integer.parseInt(args[1]);
            ex(a,b);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     public static void ex(double a, double b) throws Exception{
        if(a==0 || b==0){
            throw new MyException("Invalid input");
        }
        else{
            double ans = a/b;
            System.out.println(ans);
        }
       
     }
}
/**
 * MyExceptiom
 */ 
class MyException extends Exception {
     public MyException(String a){
        super(a);
     }
}
