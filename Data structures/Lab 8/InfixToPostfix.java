import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new String : ");
        String infix = sc.nextLine();
        String ans = revpol(infix);
        System.out.println(ans);

        sc.close();
    }
    public static int stackPrec(char ch){
        if(ch=='+' || ch=='-'){
            return 2;
        }
        else if (ch=='*' || ch=='/'){
            return 4;
        }
        else if (ch=='^'){
            return 5;
        }
        else if ((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')){
            return 8;
        }
        else
            return 0;
    }
    public static int inputPrec(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }
        else if (ch=='*' || ch=='/'){
            return 3;
        }
        else if (ch=='^'){
            return 6;
        }
        else if (ch>='a'&& ch<='z' || (ch>='A' && ch<='Z')){
            return 7;
        }
        else if(ch=='('){
            return 9;
        }
        else 
            return 0;
     }

    
    
    public static int rankValue(char ch)
    {
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^'){
            return -1;
        }
        else
            return 1;
     }
        
    public static String revpol(String infix){
        Stack<Character> s = new Stack<>();
        s.push('(');
        String polish = "";
        String ans="";
        int rank = 0;
        infix+=')';
        
        for(int i = 0; i < infix.length();i++){
            char ch = infix.charAt(i);
                if(s.isEmpty()){
                    ans ="Invalid1";
                    return ans;
                }
                while(stackPrec(s.peek()) > inputPrec(ch)){
                    char temp = s.pop();
                    polish = polish + temp;
                    rank = rank + rankValue(temp);
                    if(rank <1){
                        ans ="Invalid2";
                        return ans;
                    }
                }
                if(stackPrec(s.peek()) != inputPrec(ch)){
                    s.push(ch);
                }
                else{
                    s.pop();
                }
        }
         if(!s.isEmpty()|| rank != 1 ){
            ans = "invalid3";
            return ans;
         }
         else{
            return polish;
         }
    }
}