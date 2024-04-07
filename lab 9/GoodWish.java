public class GoodWish{
    public static void main(String[] args){
        Thread t1 = new Message1("Good Morning", 1000);
        Thread t2 = new Message1("Afternoon", 3000);
        t1.start();
        //try{
            //t1.join()
        //}
        t2.start();

        //t1.join in try catch to synchronize two thread

        //for Runnable
        // Runnable re = new Messege1();
        // Thread t1 = new Thread(re);
    }
}
//class Messege1 implements Runnable
class Message1 extends Thread{
    //int i=10
    String msg;
    int delay;

    Message1(String msg, int delay){
        this.msg = msg;
        this.delay = delay;
    }
    public void run(){
        try{
            while(true){
                System.out.println(msg);
                Thread.sleep(delay);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}