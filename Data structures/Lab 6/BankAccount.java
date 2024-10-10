import java.util.Scanner;
public class BankAccount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array for bank account holders: ");
        int size = sc.nextInt();
        Bank_acc[] ba = new Bank_acc[size];
        for(int i=0;i<size;i++){
            ba[i] = new Bank_acc();
            ba[i].getDetails();
        }
        sc.close();
    }
}
class Bank_acc{
    int acc_no;
    double balance;
    String name;
    double damount;
    double wamount;
    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter acc_no");
        acc_no=sc.nextInt();
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter balance");
        balance=sc.nextDouble();
        System.out.println("Enter amount to deposit ");
        damount=sc.nextDouble();
        deposit(damount);
        System.out.println("Enter amount to withdraw ");
        wamount=sc.nextDouble();
        withdraw(wamount);
        check_balance();

        sc.close();
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("balance after deposit"+balance);
    }
    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }else{
            System.out.println("Insufficient balance");
        } 
     }
     void check_balance(){
        System.out.println("balance="+balance);
    }
}