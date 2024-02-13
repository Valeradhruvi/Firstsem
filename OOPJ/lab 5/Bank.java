import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Bank_Account a = new Bank_Account();
        a.getAccountDetails();
        a.print();
    }
}

class Bank_Account {
    int accountNo,accountBalance;
    String userName,email,accountType;

    void getAccountDetails(){
        Scanner sc = new Scanner(System.in);

        int accountNo,accountBalance;
        String userName,email,accountType;

        System.out.println("Enter Account No. :");
        accountNo = sc.nextInt();
        System.out.println("Enter Account Balance :");
        accountBalance = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Username :");
        userName = sc.nextLine();
        System.out.println("Enter Email :");
        email = sc.nextLine();
        System.out.println("Enter Account Type :");
        accountType = sc.nextLine();
    }
    
    void print(){
        System.out.println("=====================================");
        System.out.println("Details of Employee:");
        System.out.println("Username : "+userName);
        System.out.println("Account No. : "+accountNo);
        System.out.println("Account Balance : "+accountBalance);
        System.out.println("Email Id : "+email);
        System.out.println("Account Type : "+accountType);
    }

}
