class Number extends Thread{
    int start;

    Number(int start){
        this.start = start;
    }

    public void run(){
        for(int i = start; i <= 20; i+=2){
            System.out.println(i);
        }
    }
}
public class OddEven{
    public static void main(String[] args){
        Thread even = new Number(2);
        Thread odd = new Number(1);

        even.start();
        odd.start();
    }
}