import java.util.Arrays;
import java.util.Scanner;;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of string array: ");
        int size = sc.nextInt();

        String[] char_arr = new String[size];
        for(int i=0;i<size;i++){    
            System.out.println("Enter word at "+i+" index");
            char_arr[i] = sc.next();
        }
        int m = (int)(Math.random()*size);
        System.out.println("random index word is: "+char_arr[m]);
        System.out.println("-------------------------------------");

        System.out.println("enter anagram word: ");
        String str = sc.next();

        char[] c = str.toCharArray();
        char[] ch = char_arr[m].toCharArray();

        Arrays.sort(c);
        Arrays.sort(ch);

        int temp = 0;
        for(int i=0;i<c.length;i++){
            if(c[i]==ch[i]){
                temp++;
                continue;
            }
            else{
                System.out.println("--------------------------------");
                System.out.println("Not anagram");
                break;
            }
        }
        if(temp==c.length){
            System.out.println("----------------------------------------");
            System.out.println("It is Anagram");
        }
        sc.close();
    }
}