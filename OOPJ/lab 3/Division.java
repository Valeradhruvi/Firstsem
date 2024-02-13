import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float m1,m2,m3,m4,m5,Total;
        System.out.println("Enter Total Marks For Each Subject:");
        Total = sc.nextFloat();
        
        do {
            System.out.println("Enter Marks of Subject-1:");
             m1 = sc.nextFloat();
        } while (m1 > Total || m1 < 0);
        do {
            System.out.println("Enter Marks of Subject-2:");
             m2 = sc.nextFloat();
        } while (m2 > Total || m2 < 0);
        do {
            System.out.println("Enter Marks of Subject-3:");
             m3 = sc.nextFloat();
        } while (m3 > Total || m3 < 0);
        do {
            System.out.println("Enter Marks of Subject-4:");
             m4 = sc.nextFloat();
        } while (m4 > Total || m4 < 0);
        do {
            System.out.println("Enter Marks of Subject-5:");
             m5 = sc.nextFloat();
        } while (m5 > Total || m5 < 0);

        
        float per = (float) (((m1+m2+m3+m4+m5)/(Total * 5.0)) * 100.0);
        if (per>=60) {
            System.out.println("First Devision");
        }
        else if (per>=50) {
            System.out.println("Secound Devision");
        }
        else if (per>=40) {
            System.out.println("Third Devision");
        }
        else {
            System.out.println("You are Failed!! ");
        }
    }
}

}