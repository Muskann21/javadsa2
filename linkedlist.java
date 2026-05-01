
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Link{
    Node head;
    void insert(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    void findplace(int data){
        Node temp=head;
        int x=0;
        while(temp!=null){
            if(temp.data==data){
                System.out.println(data+" found at "+x+" index");
                return;
              }
            x+=1;
            temp=temp.next;
        }
    }
}
public class linkedlist {
    public static void main(String[] args) {
        Link list=new Link();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.insert(90);
        list.display();
        list.findplace(30);
    }
}
