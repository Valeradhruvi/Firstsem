import java.util.Scanner;
public class Replace_uc_lc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String: ");
        String str = sc.next();

        char[] newstr = str.toCharArray();
       for(int i=0;i<newstr.length;i++){
        if(Character.isLowerCase(newstr[i])){
           newstr[i] =  Character.toUpperCase(newstr[i]);
        }
        else if(Character.isUpperCase(newstr[i])){
            newstr[i] = Character.toLowerCase(newstr[i]);
        }
        else{
            System.out.println("not a charcter");
        }
       }
       System.out.println("-----------------------------------");
       System.out.println("New String");
       for(int i=0;i<newstr.length;i++){
        System.out.print(newstr[i]);
       }
       sc.close();
    }
}
