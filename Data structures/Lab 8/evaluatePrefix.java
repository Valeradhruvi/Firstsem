import java.util.Stack;
import java.util.Scanner;
public class evaluatePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter postfix expression: ");
        String str = sc.next();

        System.out.println(eval(str));

        sc.close();

        // String infix = "231*+9-";
        // System.out.println("PostFix Evaluation:" + eval(infix));
    }

    public static int eval(String s){
        Stack<Integer> str = new Stack<>();
        char temp;

        for(int i=s.length()-1;i>= 0 ;i--){
            temp = s.charAt(i);

            if(Character.isDigit(temp)){
                str.push(Integer.parseInt(String.valueOf(temp)));
            }
            else{
                int op1 = str.pop();
                int op2 = str.pop();

                switch (temp) {
                    case '+':
                        str.push( op1 + op2);
                         break;
                    case '-':
                        str.push( op1 - op2);
                        break;
                    case '*':
                        str.push( op1 * op2);
                        break;
                    case '/':
                        str.push( op1 / op2);
                        break;
                    case '^':
                        str.push( op1 ^ op2);
                        break;    
                
                    default:
                        break;
                }
            }
        }
        return str.pop();

    }
} 
