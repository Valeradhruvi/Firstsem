import java.util.Scanner;
class student_details{
    int enrollment_no;
    String name;
    int semester;
    double cpi;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Enrollment Number: ");
        enrollment_no = sc.nextInt();
        System.out.println("Enter Enrollment Number: ");
        name = sc.next();
        System.out.println("Enter Enrollment Number: ");
        semester = sc.nextInt();
        System.out.println("Enter Enrollment Number: ");
        cpi = sc.nextDouble();
        sc.close();
        
    }
    public void printDetails(){
        System.out.println("Enrollment number: "+enrollment_no);
        System.out.println("Name: "+name);
        System.out.println("Semester: "+semester);
        System.out.println("CPI: "+cpi);
    }
}
public class aob_Student {
    public static void main(String[] args) {
        student_details[] student = new student_details[5];
        for(int i=0;i<student.length;i++){
            student[i] = new student_details();
            student[i].getDetails();
        }
        for(int i=0;i<student.length;i++){
            student[i].printDetails();
        }
        
    }
}