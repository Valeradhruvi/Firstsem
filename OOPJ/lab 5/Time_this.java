public class Time_this{
    public static void main(String[] args){
        TimeClass t1 = new TimeClass();
        TimeClass t2 =  new TimeClass(12,40);

        t1.displayTime();
        t2.displayTime();
    }
}
 
class TimeClass{
    int hrs;
    int mins;
    TimeClass(){
        hrs = 2;
        mins = 40;
    }

    TimeClass(int hrs , int mins){
        this.hrs = hrs;
        this.mins = mins;
        displayTime();
    }

    void displayTime(){

        System.out.println(hrs+":"+mins);
    }
}