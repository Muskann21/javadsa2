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
    void dequeue(int element){
        if((rear+1)%size==front){
            System.out.println("Element not found");
        }
        if(front==-1){
            front=0;
        }
        if(queue[((rear+1)%size)]==element){
            
        }
    }
    }
    public class circularqueue{
           public static void main(String[] args) {
               circular cq=new circular(4);
               cq.enqueue(10);
               cq.enqueue(20);
               cq.enqueue(30);
               cq.enqueue(40);
           }
    }
