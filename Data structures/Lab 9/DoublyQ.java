public class DoublyQ {
    public static void main(String[] args) {
        QueueClass q1 = new QueueClass();
        q1.Enqueue_rare(20);
        q1.Enqueue_rare(30);
        q1.Enqueue_rare(100);
        q1.Enqueue_rare(80);

        q1.Dequeue_front();

        q1.Enqueue_front(40);

        q1.Dequeue_rare();

        q1.display();
    }
}
class QueueClass{
    int top = -1, f = -1, max = 5;
    int[] arr = new int[max];

    public void Enqueue_rare(int data){
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

    public int Dequeue_front(){
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

    public void Enqueue_front(int data){
        if(f==0){
            System.out.println("Overflow");
        }
        else{
            
            if(f==-1){
                top = 0;
                f = 0;
            }
            f--;
            arr[f] = data;
        }
    }

    public int Dequeue_rare(){
        if(top == -1){
            System.out.println("underflow");
            return 0;
        }
        else{
            int y = arr[top];
            if(top == f){
                f = -1;
                top = -1;
            }
            else{
                top--;
            }
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