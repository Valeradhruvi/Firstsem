import java.util.Scanner;
public class Constants_vowels{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String ch=sc.next();
    int a=0;
    int b=0;
    ch=ch.toLowerCase();

    for(int i=0;i<=ch.length()-1;i++){
      if(ch.charAt(i)=='a' || ch.charAt(i)=='e' || ch.charAt(i)=='i' || ch.charAt(i)=='o' || ch.charAt(i)=='u')
        {
          a++;
        }
      else{
          b++;
      }
    
    }

    System.out.println("Consonants ="+b);
    System.out.println("Vowel ="+a);
  }
}