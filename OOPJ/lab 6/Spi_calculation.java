import java.util.Scanner;
class Student {
    int id_no; 
    int no_of_subjects_registered;
    String[] subject_code; 
    int[] subject_credits;
    String[] grade_obtained;
    double spi;
    Scanner sc=new Scanner(System.in);

    public Student(int id_no,int no_of_subjects_registered,String[] subject_code,int[] subject_credits,String[] grade_obtained){
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = 0.0;
    }

    public double get_spi(){
        int totalCredits=0;
        double gradetemp=0.0;
        for(int i=0;i<no_of_subjects_registered;i++){
            totalCredits+=subject_credits[i];
            gradetemp+=subject_credits[i]*gradeToNumber(grade_obtained[i]);
        }
        spi=gradetemp/totalCredits;
        return spi;
    }

    public double gradeToNumber(String grade_obtained){
        grade_obtained=grade_obtained.toUpperCase();
        char grade = grade_obtained.charAt(0);
        switch (grade) {
            case 'A':
                return 10.0;
            case 'B':
                return 9.0;
            case 'C':
                return 8.0;
            case 'D':
                return 7.0;
            case 'E':
                return 6.0;
            case 'F':
                return 5.0;
            default:
                return 0.0;
        }
    }
}

public class Spi_calculation {
    public static void main(String[] args){
        Scanner sh=new Scanner(System.in);
        System.out.print("Enter total no. of Students: ");
        int n=sc.nextInt();
        Student[] s=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+": ");
            System.out.print("Enter id number: ");
            int id_no=sh.nextInt();
            System.out.print("Enter No. of Subjects registered: ");
            int no_of_subjects_registered=sc.nextInt();
            String[] subject_code=new String[no_of_subjects_registered];
            int[] subject_credits=new int[no_of_subjects_registered];
            String[] grade_obtained=new String[no_of_subjects_registered];
            for(int j=0;j<no_of_subjects_registered;j++){
                System.out.println("\tSubject "+(j+1)+": ");
                System.out.print("\t\tEnter Subject Code: ");
                subject_code[j]=sh.next();
                System.out.print("\t\tEnter Subject Credits: ");
                subject_credits[j]=sh.nextInt();
                System.out.print("\t\tEnter Grade Obtained: ");
                grade_obtained[j]=sh.next();
            }
            s[i]=new Student(id_no,no_of_subjects_registered,subject_code,subject_credits,grade_obtained);
            double spi=s[i].get_spi();
            System.out.println("Student "+s[i].id_no+"-> SPI obtained: "+spi);
        }
        sc.close();
    }
}