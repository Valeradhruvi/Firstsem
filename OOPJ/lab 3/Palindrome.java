import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a String: ");
        String ch= sc.next();
        String revch="";
        for(int i=ch.length()-1;i>=0;i--){
            revch = revch+ch.charAt(i);
        }

        if(ch.equals(revch)){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}