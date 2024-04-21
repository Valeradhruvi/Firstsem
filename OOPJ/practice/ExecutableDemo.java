import java.util.concurrent.*;

public class ExecutableDemo {
    public static void main(String[] args) {
        Runnable r1 = new prem("task 1");
        Runnable r2 = new prem("task 2");
        Runnable r3 = new prem("task 3");
        Runnable r4 = new prem("task 4");

        ExecutorService pool =  Executors.newFixedThreadPool(4);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.shutdown();

    }
}
class prem implements Runnable{
    private String name;
    prem(String s){
        name = s;
    }

    public void run(){
        try{
            for(int i=0 ; i<=5 ; i++){
                System.out.println("hello "+i);
            }
            System.out.println(name+ "task completed");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
