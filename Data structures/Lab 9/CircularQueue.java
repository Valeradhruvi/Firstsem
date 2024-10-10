public class CircularQueue {
    public static void main(String[] args) {
        QueueClass q1 = new QueueClass();
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);

        q1.display();
        q1.Dequeue();
        System.out.println();
        
        q1.enqueue(70);
        q1.Dequeue();
        q1.display();
    }
}
class QueueClass{
    int top = -1, f = -1, max = 5;
    int[] arr = new int[max];

    public void enqueue(int data){
        if(top+1 == f || (top >= max && f == -1)){
            System.out.println("overflow");
        }
        else{
            if(f == -1){
                f = 0;
            }
            top = (top+1)%max;
            arr[top] = data;
        }
    }

    public int Dequeue(){
        if(f==-1){
            System.out.println("underflow");
            return 0;
        }
        else{
            int y = arr[f];
            if(f==top){
                f = 0;
                top = 0;
                return y;
            }
            else if(f==max){
                f = 0;
                return y;
            }
            else{
                f = (f+1)%max;
                return y;
            }
        }
    }

    public void display(){
        if(top < -1){
            System.out.println("underflow");
        }
        else{
            int i;
            for(i=f ; i!=top ; i=(i+1)%max){
                System.out.print(" "+arr[i]);
            }
            System.out.print(" "+arr[i]);
        }
    }
}