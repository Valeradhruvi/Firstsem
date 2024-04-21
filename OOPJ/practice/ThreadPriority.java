public class ThreadPriority {
    public static void main(String[] args) {
        PriorityD t1 = new PriorityD("prem");
        t1.setPriority(Thread.MIN_PRIORITY);//1
        PriorityD t2 = new PriorityD("zeel");
        t2.setPriority(Thread.MAX_PRIORITY);//10

        t1.start();
        t2.start();
    }
}
class PriorityD extends Thread{

    PriorityD(String name){
        super(name);
    }

    public void run(){
        for(int i =0 ; i<10; i++){
            try{
                sleep(100);
                System.out.println("call of : "+this.getName());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
