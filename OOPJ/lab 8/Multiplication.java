public class Multiplication{
    public static void main(String[] args){
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            int ans = 1;
            for(int i = 1; i <= y; i++){
                ans = ans*x;
            }
            System.out.println(ans);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}