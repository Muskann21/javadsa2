class circular{
    int queue[];
    int front,rear,size;
    public circular(int size){
        this.size=size;
        queue=new int[size];
        front=-1;
        rear=-1;
    }
    void enqueue(int element){
         if((rear+1)%size==front){
            System.out.println("Queue is full");
         }
         if(front==-1){
            front=0;
         }
         rear=(rear+1)%size;
         queue[rear]=element;
         System.out.println(element+"inserted");
            }
    void dequeue(){
        if(front==-1){
            System.out.println("Queue is empty");
            return;
        }
        front=(front+1)%size;
        System.out.println("Dequeued");
        }
    void display(){
        if(front==-1){
            System.out.println("Queue is empty");
            return;
        }
        int i=front;
        do{
            System.out.print(queue[i]+" ");
            i=(i+1)%(size);
        }
        while (i!=(rear+1)%size);
        System.out.println();
    }
    }
    
    public class circularqueue{
           public static void main(String[] args) {
               circular cq=new circular(4);
               cq.enqueue(10);
               cq.enqueue(20);
               cq.enqueue(30);
               cq.enqueue(40);
               cq.display();
               cq.dequeue();
               cq.display();
           }
    }
