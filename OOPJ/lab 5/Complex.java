import java.util.Scanner;


public class Complex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first cimplex no: ");
        System.out.println("Enter real part od first complex no: ");
        int rr = sc.nextInt();
        System.out.println("Enter imaginary part of first complex no.: ");
        int ii = sc.nextInt();
        ComplexNo c1 =  new ComplexNo(rr, ii);

        System.out.println("Enter second cimplex no: ");
        System.out.println("Enter real part of second complex no: ");
        int rr = sc.nextInt();
        System.out.println("Enter imaginary part of second complex no.: ");
        int ii = sc.nextInt();
        ComplexNo c2 =  new ComplexNo(rr, ii);

        ComplexNo c3 = new ComplexNo();
        c3.addComplexNo(c1 , c2);
        System.out.println("Sum is:");
        System.out.print(+c3.realNo+" "+c3.imgNo+
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        v);
    }
}

public class ComplexNo{

    ComplexNo(){
        realNo = 0;
        imgNo = 0;
    }
    ComplexNo(int realNo , int imgNo){
        this.realNo = realNo;
        this.imgNo = imgNo;
    }

    void addComplexNo(ComplexNo c1 , ComplexNo c2){
        this.realNo = c1.realNo + c2.realNo;
        this.imgNo = c1.imgNo + c2.imgNo;
    }
}