import java.util.Scanner;

public class Vowels {
    int vovel_a=0,vovel_e=0,vovel_i=0,vovel_o=0,vovel_u=0;
     void vowels(String a){
        
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' ) {
                this.vovel_a++;
            }
            else if (a.charAt(i) == 'e') {
                this.vovel_e++;
            }
            else if (a.charAt(i) == 'i') {
                this.vovel_i++;
            }
            else if ( a.charAt(i)== 'o') {
                this.vovel_o++;
            }
            else if (a.charAt(i)== 'u') {
                this.vovel_u++;
            }
        }
        
    }

    void print(){
        System.out.println("A Count : "+vovel_a);
        System.out.println("E Count : "+vovel_e);
        System.out.println("I Count : "+vovel_i);
        System.out.println("O Count : "+vovel_o);
        System.out.println("U Count : "+vovel_u);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter a String :");
            String str = sc.next();
            if (str.equalsIgnoreCase("quit")) {
                break;
            }
            Vowels a = new Vowels();
            a.vowels(str);
            a.print();
        } 
                    
        sc.close();
    }
}
