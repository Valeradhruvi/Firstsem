import java.util.Scanner;
public class Add_time{
    public static void main( String[] args){
        Scanner uc = new Scanner(System.in);
    
        System.out.println("Enter Hours");
        int hours=uc.nextInt;
        System.out.println("Enter minutes");
        int minutes=uc.nextInt;

        Time t1 = new Time();
        Time t2 = new Time(hours , minutes);

        t2.addition(t1 , t2);
        //System.out.println("hours: "+t1.h);
        //System.out.print("mins: "+t2.m);
        //System.out.println("hours: "+t1.h);
        //System.out.print("mins: "+t2.m);
       
    }
}
class Time{
    int h , m;
    Time(){
        h= 10;
        m= 30;
    }
    Time(int hrs, int min){
        h= hrs;
        m= min;
    }
    void addition(Time obj1, Time obj2){
        int totalHrs= obj1.h + obj2.h;
        int totalmins= obj1.m + obj2.m;
        if(totalmins>59){
            totalHrs++;
            totalmins = totalmins - 60;
        }
        System.out.println(totalHrs+"hrs:"+totalmins);
    }

}