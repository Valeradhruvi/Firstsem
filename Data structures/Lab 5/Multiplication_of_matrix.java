import java.util.Scanner;
public class Multiplication_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[3][2];
        int[][] matrix2 = new int[2][3];

        System.out.println("For matrix 1");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter element at ["+i+"]["+j+"] index");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("------------------------------------");
        System.out.println("For matrix 2");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter element at ["+i+"]["+j+"] index");
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------------------------------");

        int[][] matrix3 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix3[i][j]=0;
                for(int k=0;k<2;k++)
                matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("Matrix 3 after Multiplication");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
