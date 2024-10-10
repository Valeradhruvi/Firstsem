import java.util.Scanner;
public class Addition_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        System.out.println("For matrix 1");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter element at ["+i+"]["+j+"] index");
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("------------------------------------");
        System.out.println("For matrix 2");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter element at ["+i+"]["+j+"] index");
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------------------------------");
        int[][] matrix3 = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("Matrix 3 after addition");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
