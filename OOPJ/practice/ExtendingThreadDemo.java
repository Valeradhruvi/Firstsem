public class ExtendingThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        try{
            for(int j=0 ; j<=5 ; j++){
                System.out.println("main Thread");
                Thread.sleep(500);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.err.println("main thread exists");
    }
}
class NewThread extends Thread{

    NewThread(){
        start();
    }
    public void run(){
        try{
            for(int i=0 ; i<=5 ; i++){
                System.out.println("child Thread");
                sleep(1000);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        System.err.println("child thread exists");
    }
}
