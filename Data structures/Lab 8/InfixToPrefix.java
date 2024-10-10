import java.util.Scanner;
import java.util.Stack;
public class InfixToPrefix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a infix string: ");
        String infix = sc.next();
        String reverse = "";

        //to reverse a string
        for(int i=infix.length()-1 ;i >= 0;i--){
            if(infix.charAt(i)== ')'){
                reverse = reverse + '(';
            }
            else if(infix.charAt(i) == '('){
                reverse = reverse + ')';
            }
            else{
                reverse = reverse + infix.charAt(i);
            }
        }

        System.out.println("reverse String : "+reverse);
         polishNotation(reverse
         );
        sc.close();
    }

    // this function converts infix string to postfix string
    public static void polishNotation(String infix){
        Stack<Character> s = new Stack<>();
        s.push('(');
        String polish = "";
        String ans="";
        int rank = 0;
        infix+=')';
        
        // logic for conversion
        for(int i = 0; i < infix.length();i++){
            char ch = infix.charAt(i);
                if(s.isEmpty()){
                    ans ="Invalid1";
                    System.out.println(ans);;

                }
                //check precendence
                while(stackPrec(s.peek()) > inputPrec(ch)){
                    char temp = s.pop();
                    polish = polish + temp;
                    rank = rank + rankValue(temp);
                    if(rank <1){
                        ans ="Invalid2";
                        System.out.println(ans);;

                    }
                }
                if(stackPrec(s.peek()) != inputPrec(ch)){
                    s.push(ch);
                }
                else{
                    s.pop();
                }
        }

        //final convert
         if(!s.isEmpty()|| rank != 1 ){
            ans = "invalid3";
            System.out.println(ans);;
         }
         else{
            System.out.println("Neary postfix: "+polish);;
         }
         String final_ans = "";
         for(int i=polish.length()-1;i >= 0; i--){
            final_ans = final_ans + polish.charAt(i);
         }

         System.out.println(final_ans);
        
    }

    // this fucntion is for stack precedence of character
    public static int stackPrec(char ch){
        if(ch=='+'||ch=='-')
            return 1;
        else if(ch=='*'||ch=='/'){
            return 3;
        }
        else if(ch=='^'){
            return 6;
        }
        else if(ch>='a' && ch<='z' ||ch>='A' && ch<='Z'){
            return 8;
        }
        else if(ch=='('){
            return 0;
        }
        else{
            return -1;
        }
    }

    //this fucntion is to check input precedence of character
    public static int inputPrec(char ch){
        if(ch=='+'||ch=='-'){
            return 2;
        }
        else if(ch=='*'||ch=='/'){
            return 4;
        }
        else if(ch=='^'){
            return 5;
        }
        else if(ch>='a' && ch<='z' ||ch>='A' && ch<='Z'){
            return 7;
        }
        else if(ch=='('){
            return 9;
        }
        else if(ch==')'){
            return 0;
        }
        else{
            return -1;
        }
     }

    // this function is to check rank of the character
    public static int rankValue(char ch)
    {
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^'){
            return -1;
        }
        else{
            return 1;
        }
     }

}