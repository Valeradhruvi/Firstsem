public class Company{
    public static void main(String[] args){
        Employee E1 = new Employee("jaina",20,153248751,"nearnearnaer",10000,"inheritance");
        E1.printEmployeeDetails();

        Manager M1 = new Manager("jaina",20,153248751,"nearnearnaer",10000,"cse");
        M1.printManagerDetails();
    }
}

class Member{
        String name;
        int age;
        int phoneNumber;
        String address;
        int salary;

    public Member(String name, int age, int phoneNumber,String address,int salary){
            this.name = name;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.salary = salary;
        }

    void printDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Phone Number: "+this.phoneNumber);
        System.out.println("Address: "+this.address);
        System.out.println("Salary: "+this.salary);
      }
}

class Employee extends Member{
    String specialization;

    public Employee(String name, int age, int phoneNumber, String address, int salary, String specialization ){
        super(name,age,phoneNumber,address,salary);
        this.specialization = specialization;
    }

    void printEmployeeDetails(){
        super.printDetails();
        System.out.println("Specialization: "+this.specialization);
        System.out.println("===================");
    }
}

class Manager extends Member{
    String department;

    public Manager(String name, int age, int phoneNumber, String address, int salary, String department){
        super(name,age,phoneNumber,address,salary);
        this.department = department;
    }

    void printManagerDetails(){
        super.printDetails();
        System.out.println("Department: "+this.department);
    }
}