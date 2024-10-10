public class SimpleQueue {
    
    public static void main(String[] args) {
        QueueClass q1 = new QueueClass();

        q1.Enqueue(20);
        q1.Enqueue(30);
        q1.Enqueue(40);
        q1.Enqueue(50);
        q1.Enqueue(60);
        q1.display();

        System.out.println();
        q1.Dequeue();
        q1.display();
    }
}
class QueueClass{
    int top = -1, f = -1, max = 5;
    int[] arr = new int[max];
    public void Enqueue(int data){
        if(top >= max){
            System.out.println("Queue Overflow");
            return;
        }
        else{

            if( f == -1){
                f = 0;
            }
            top = top+1;
            arr[top] = data;
        }
    }

    public int Dequeue(){
        int y = arr[f];
        if(top < -1){
            System.out.println("Queue underflow");
            return 0;
        }
        else{
            if(f==top){
                f = 0;
                top = 0;
                return y;
            }
            f++;
            return y;
        }
    }

    public void display(){
        if(top < -1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=f;i<=top;i++){
                System.out.print(" "+arr[i]);
            }
        }
    }
}