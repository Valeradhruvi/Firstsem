import java.util.Scanner;
class Employee_Detail{
    String employee_Id;
    String name;
    String designation;
    int salary;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        employee_Id = sc.next();
        System.out.println("Enter  Name: ");
        name = sc.next();
        System.out.println("Enter Designation: ");
        designation = sc.next();
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
        sc.close();
    }
    public void printDetails(){
        System.out.println("Employee ID: "+employee_Id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Designation: "+designation);
        System.out.println("Employee Salary: "+salary);
    }
}
public class Emply {
    public static void main(String[] args) {
        Employee_Detail employee = new Employee_Detail();

        employee.getDetails();
        employee.printDetails();
    }
}
